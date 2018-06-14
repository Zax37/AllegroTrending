package pl.uj.jwzp.services;

import com.allegro.webapi.DoGetUserLoginResponse;
import com.allegro.webapi.DoLoginWithAccessTokenResponse;
import com.allegro.webapi.ServicePort_PortType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import pl.uj.jwzp.allegro.TokenResponse;
import pl.uj.jwzp.allegro.WebApiWrapper;
import pl.uj.jwzp.database.User;
import pl.uj.jwzp.database.UsersRepository;
import pl.uj.jwzp.properties.AllegroProperties;
import pl.uj.jwzp.properties.ApplicationProperties;
import pl.uj.jwzp.util.UrlJoiner;
import pl.uj.jwzp.wrappers.AllegroAuthenticationFactory;
import pl.uj.jwzp.wrappers.RestTemplateFactory;

import java.rmi.RemoteException;
import java.time.LocalDateTime;

public class AuthServiceTest {
    public static final String someRequestCode = "test";
    public static final String someAccessToken = "token";
    public static final Long userId = 1L;
    public static final String userLogin = "login";

    @Test
    public void shouldHaveCorrectFlow() {
        AllegroProperties allegroProperties = Mockito.mock(AllegroProperties.class);
        AllegroAuthenticationFactory authenticationFactory = Mockito.mock(AllegroAuthenticationFactory.class);
        ApplicationProperties applicationProperties = Mockito.mock(ApplicationProperties.class);
        UrlJoiner urlJoiner = Mockito.mock(UrlJoiner.class);
        UsersRepository usersRepository = Mockito.mock(UsersRepository.class);
        ResponseEntity<TokenResponse> responseEntity = Mockito.mock(ResponseEntity.class);
        RestTemplate restTemplate = Mockito.mock(RestTemplate.class);
        RestTemplateFactory restTemplateFactory = Mockito.mock(RestTemplateFactory.class);
        TokenResponse tokenResponse = Mockito.mock(TokenResponse.class);
        WebApiWrapper webApiWrapper = Mockito.mock(WebApiWrapper.class);
        ServicePort_PortType portType = Mockito.mock(ServicePort_PortType.class);
        DoLoginWithAccessTokenResponse response1 = Mockito.mock(DoLoginWithAccessTokenResponse.class);
        DoGetUserLoginResponse response2 = Mockito.mock(DoGetUserLoginResponse.class);

        AuthService uut = new AuthService(allegroProperties, authenticationFactory,
                applicationProperties, urlJoiner, usersRepository,
                restTemplateFactory, webApiWrapper);

        // Setup mocks to get token
        Mockito.when(restTemplateFactory.createRestTemplate()).thenReturn(restTemplate);
        Mockito.when(restTemplate.exchange(Mockito.anyString(), Mockito.eq(HttpMethod.GET),
                Mockito.any(), Mockito.eq(TokenResponse.class), Mockito.anyMap())).thenReturn(responseEntity);
        Mockito.when(responseEntity.getBody()).thenReturn(tokenResponse);
        Mockito.when(tokenResponse.getAccessToken()).thenReturn(someAccessToken);

        Mockito.when(webApiWrapper.makeRequest()).thenReturn(portType);
        try {
            // Setup mocks to get usedID
            Mockito.when(portType.doLoginWithAccessToken(
                    Mockito.argThat(req -> req.getAccessToken().equals(someAccessToken))
            )).thenReturn(response1);
            Mockito.when(response1.getUserId()).thenReturn(userId);

            // Setup mocks to get userLogin
            Mockito.when(portType.doGetUserLogin(
                    Mockito.argThat(req -> req.getUserId() == userId.intValue())
            )).thenReturn(response2);
            Mockito.when(response2.getUserLogin()).thenReturn(userLogin);
        } catch (RemoteException e) {
            Assert.fail();
        }

        // Do actual thing
        uut.authorizeWithCode(someRequestCode);

        Mockito.verify(usersRepository, Mockito.times(1)).findByAllegroId(userId);
        Mockito.verify(usersRepository, Mockito.times(1)).save(Mockito.any(User.class));
        Mockito.verify(authenticationFactory, Mockito.times(1)).createSession(
                Mockito.argThat(user -> user.getAllegroId().equals(userId) &&
                        user.getLogin().equals(userLogin)), Mockito.eq(someAccessToken),
                Mockito.isNull(), Mockito.any(LocalDateTime.class)
        );
    }
}
