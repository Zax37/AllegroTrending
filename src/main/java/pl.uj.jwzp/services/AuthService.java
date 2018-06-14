package pl.uj.jwzp.services;

import com.allegro.webapi.DoGetUserLoginRequest;
import com.allegro.webapi.DoGetUserLoginResponse;
import com.allegro.webapi.DoLoginWithAccessTokenRequest;
import com.allegro.webapi.DoLoginWithAccessTokenResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import pl.uj.jwzp.allegro.TokenResponse;
import pl.uj.jwzp.allegro.WebApiWrapper;
import pl.uj.jwzp.database.User;
import pl.uj.jwzp.database.UsersRepository;
import pl.uj.jwzp.exceptions.AllegroFailedException;
import pl.uj.jwzp.exceptions.BadAuthCodeException;
import pl.uj.jwzp.properties.AllegroProperties;
import pl.uj.jwzp.properties.ApplicationProperties;
import pl.uj.jwzp.security.AccessLevel;
import pl.uj.jwzp.security.AllegroAuthentication;
import pl.uj.jwzp.util.UrlJoiner;
import pl.uj.jwzp.wrappers.AllegroAuthenticationFactory;
import pl.uj.jwzp.wrappers.RestTemplateFactory;

import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.Collections;

@Slf4j
@Service
public class AuthService {
    private AllegroProperties allegroProperties;
    private AllegroAuthenticationFactory authenticationFactory;
    private UsersRepository usersRepository;
    private RestTemplateFactory restTemplateFactory;
    private WebApiWrapper webApi;

    private static final String TOKEN_URL_BASE =
            "auth/oauth/token?grant_type=authorization_code&code={code}&redirect_uri=";
    private final String TOKEN_URL;

    public AuthService(
            AllegroProperties allegroProperties,
            AllegroAuthenticationFactory authenticationFactory,
            ApplicationProperties applicationProperties,
            UrlJoiner urlJoiner,
            UsersRepository usersRepository,
            RestTemplateFactory restTemplateFactory,
            WebApiWrapper webApi
    ) {
        this.allegroProperties = allegroProperties;
        this.authenticationFactory = authenticationFactory;
        this.usersRepository = usersRepository;
        this.restTemplateFactory = restTemplateFactory;
        this.webApi = webApi;

        TOKEN_URL = urlJoiner.join(allegroProperties.getPageUrl(), TOKEN_URL_BASE) + applicationProperties.getUrl();
    }

    public AllegroAuthentication authorizeWithCode(String code) {
        log.trace("Starting auth process for code: "+code);
        LocalDateTime beforeAuthTime = LocalDateTime.now();
        TokenResponse tokenResponse = getTokenResponseFromCode(code);
        Long allegroId = getUserIdFromAccessToken(tokenResponse.getAccessToken());
        String login = getUserLoginFromUserId(allegroId);

        User user = usersRepository.findByAllegroId(allegroId).orElseGet(() -> {
            User newUser = User.builder()
                    .allegroId(allegroId)
                    .login(login)
                    .accessLevel(AccessLevel.USER)
                    .build();
            usersRepository.save(newUser);
            return newUser;
        });

        AllegroAuthentication allegroAuthentication = authenticationFactory.createSession(
                user, tokenResponse.getAccessToken(), tokenResponse.getRefreshToken(),
                beforeAuthTime.plusSeconds(tokenResponse.getExpiresIn())
        );
        SecurityContextHolder.getContext().setAuthentication(allegroAuthentication);
        log.trace("Successfully authenticated user with login: "+login);

        return allegroAuthentication;
    }

    private TokenResponse getTokenResponseFromCode(String code) {
        RestTemplate restTemplate = restTemplateFactory.createRestTemplate();
        HttpHeaders headers = new HttpHeaders();
        String creditentials = allegroProperties.getClientId() + ':' + allegroProperties.getClientSecret();
        String encoded = Base64.getEncoder().encodeToString(creditentials.getBytes(StandardCharsets.UTF_8));
        headers.add("Authorization", "Basic "+encoded);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        try {
            return restTemplate.exchange(
                    TOKEN_URL,
                    HttpMethod.GET,
                    entity,
                    TokenResponse.class,
                    Collections.singletonMap("code", code)
            ).getBody();
        } catch (HttpClientErrorException exception) {
            throw new BadAuthCodeException();
        }
    }

    private long getUserIdFromAccessToken(String token) {
        DoLoginWithAccessTokenRequest doLoginWithAccessTokenRequest = new DoLoginWithAccessTokenRequest();
        doLoginWithAccessTokenRequest.setAccessToken(token);
        doLoginWithAccessTokenRequest.setCountryCode(allegroProperties.getCountryId());
        doLoginWithAccessTokenRequest.setWebapiKey(allegroProperties.getApiKey());
        try {
            DoLoginWithAccessTokenResponse doLoginWithAccessTokenResponse =
                    webApi.makeRequest().doLoginWithAccessToken(doLoginWithAccessTokenRequest);

            return doLoginWithAccessTokenResponse.getUserId();
        } catch (RemoteException exception) {
            throw new AllegroFailedException();
        }
    }

    private String getUserLoginFromUserId(Long userId) {
        DoGetUserLoginRequest userLoginRequest = new DoGetUserLoginRequest();
        userLoginRequest.setCountryId(allegroProperties.getCountryId());
        userLoginRequest.setUserId(userId.intValue());
        userLoginRequest.setWebapiKey(allegroProperties.getApiKey());

        try {
            DoGetUserLoginResponse loginResponse =
                    webApi.makeRequest().doGetUserLogin(userLoginRequest);

            return loginResponse.getUserLogin();
        } catch (RemoteException exception) {
            throw new AllegroFailedException();
        }
    }
}
