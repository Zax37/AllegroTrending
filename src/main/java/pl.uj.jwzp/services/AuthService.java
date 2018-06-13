package pl.uj.jwzp.services;

import com.allegro.webapi.DoGetUserLoginRequest;
import com.allegro.webapi.DoGetUserLoginResponse;
import com.allegro.webapi.DoLoginWithAccessTokenRequest;
import com.allegro.webapi.DoLoginWithAccessTokenResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.uj.jwzp.allegro.TokenResponse;
import pl.uj.jwzp.allegro.WebApiWrapper;
import pl.uj.jwzp.config.AllegroProperties;
import pl.uj.jwzp.config.ApplicationProperties;
import pl.uj.jwzp.util.UrlJoiner;

import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;
import java.util.Base64;
import java.util.Collections;

@Service
public class AuthService {
    private AllegroProperties allegroProperties;
    private WebApiWrapper webApi;

    private static final String TOKEN_URL_BASE = "auth/oauth/token?grant_type=authorization_code&code={code}&redirect_uri=";
    private final String TOKEN_URL;

    public AuthService(
            AllegroProperties allegroProperties,
            ApplicationProperties applicationProperties,
            UrlJoiner urlJoiner,
            WebApiWrapper webApi
    ) {
        this.webApi = webApi;
        this.allegroProperties = allegroProperties;

        TOKEN_URL = urlJoiner.join(allegroProperties.getPageUrl(), TOKEN_URL_BASE) + applicationProperties.getUrl();
    }

    public String getAccessTokenFromCode(String code) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        String creditentials = allegroProperties.getClientId() + ':' + allegroProperties.getClientSecret();
        String encoded = Base64.getEncoder().encodeToString(creditentials.getBytes(StandardCharsets.UTF_8));
        headers.add("Authorization", "Basic "+encoded);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<TokenResponse> response = restTemplate.exchange(
                TOKEN_URL,
                HttpMethod.GET,
                entity,
                TokenResponse.class,
                Collections.singletonMap("code", code)
        );

        return response.getBody().getAccessToken();
    }

    public String getUserLoginFromAccessToken(String token) throws RemoteException {
        DoLoginWithAccessTokenRequest doLoginWithAccessTokenRequest = new DoLoginWithAccessTokenRequest();
        doLoginWithAccessTokenRequest.setAccessToken(token);
        doLoginWithAccessTokenRequest.setCountryCode(allegroProperties.getCountryId());
        doLoginWithAccessTokenRequest.setWebapiKey(allegroProperties.getApiKey());
        DoLoginWithAccessTokenResponse doLoginWithAccessTokenResponse;

        doLoginWithAccessTokenResponse =
                webApi.makeRequest().doLoginWithAccessToken(doLoginWithAccessTokenRequest);

        DoGetUserLoginRequest userLoginRequest = new DoGetUserLoginRequest();
        userLoginRequest.setCountryId(allegroProperties.getCountryId());
        userLoginRequest.setUserId((int) doLoginWithAccessTokenResponse.getUserId());
        userLoginRequest.setWebapiKey(allegroProperties.getApiKey());

        DoGetUserLoginResponse loginResponse =
                webApi.makeRequest().doGetUserLogin(userLoginRequest);

        return loginResponse.getUserLogin();
    }
}
