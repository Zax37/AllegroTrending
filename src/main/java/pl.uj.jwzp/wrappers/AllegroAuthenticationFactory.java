package pl.uj.jwzp.wrappers;

import org.springframework.stereotype.Component;
import pl.uj.jwzp.database.User;
import pl.uj.jwzp.security.AllegroAuthentication;

import java.time.LocalDateTime;

@Component
public class AllegroAuthenticationFactory {
    public AllegroAuthentication createSession(
            User user,
            String accessToken,
            String refreshToken,
            LocalDateTime expirationDate
    ) {
        return new AllegroAuthentication(user, accessToken, refreshToken, expirationDate);
    }
}
