package pl.uj.jwzp.services;

import com.allegro.webapi.DoGetUserLoginRequest;
import com.allegro.webapi.DoGetUserLoginResponse;
import com.allegro.webapi.DoLoginWithAccessTokenRequest;
import com.allegro.webapi.DoLoginWithAccessTokenResponse;
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

import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.Collections;

@Service
public class AuthService {
    private AllegroProperties allegroProperties;
    private UsersRepository usersRepository;
    private WebApiWrapper webApi;

    private static final String TOKEN_URL_BASE =
            "auth/oauth/token?grant_type=authorization_code&code={code}&redirect_uri=";
    private final String TOKEN_URL;

    public AuthService(
            AllegroProperties allegroProperties,
            ApplicationProperties applicationProperties,
            UrlJoiner urlJoiner,
            UsersRepository usersRepository,
            WebApiWrapper webApi
    ) {
        this.allegroProperties = allegroProperties;
        this.usersRepository = usersRepository;
        this.webApi = webApi;

        TOKEN_URL = urlJoiner.join(allegroProperties.getPageUrl(), TOKEN_URL_BASE) + applicationProperties.getUrl();
    }

    public AllegroAuthentication authorizeWithCode(String code) {
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

        AllegroAuthentication allegroAuthentication = new AllegroAuthentication(
                user, tokenResponse.getAccessToken(), tokenResponse.getRefreshToken(),
                beforeAuthTime.plusSeconds(tokenResponse.getExpiresIn())
        );
        SecurityContextHolder.getContext().setAuthentication(allegroAuthentication);

        return allegroAuthentication;
    }

    private TokenResponse getTokenResponseFromCode(String code) {
        RestTemplate restTemplate = new RestTemplate();
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
