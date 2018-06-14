package pl.uj.jwzp.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import pl.uj.jwzp.database.User;

import java.time.LocalDateTime;
import java.util.Collections;

public class AllegroAuthentication extends AbstractAuthenticationToken {
    private User user;
    private String accessToken;
    private String refreshToken;
    private LocalDateTime expirationDate;
    private boolean invalidated;

    public AllegroAuthentication(
            User user,
            String accessToken,
            String refreshToken,
            LocalDateTime expirationDate
    ) {
        super(Collections.singletonList(new SimpleGrantedAuthority(user.getAccessLevel().getName())));

        this.user = user;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expirationDate = expirationDate;
    }

    @Override
    public String getCredentials() {
        return accessToken;
    }

    @Override
    public User getPrincipal() {
        return user;
    }

    @Override
    public boolean isAuthenticated() {
        return !invalidated && LocalDateTime.now().isBefore(expirationDate);
    }

    @Override
    public void setAuthenticated(boolean authenticated) {
        if (authenticated) {
            throw new IllegalArgumentException("Create a new Authentication object to authenticate");
        }
        invalidated = true;
    }
}