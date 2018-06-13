package pl.uj.jwzp.allegro;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TokenResponse {
    @JsonProperty("access_token") String accessToken;
    @JsonProperty("token_type") String tokenType;
    @JsonProperty("refresh_token") String refreshToken;
    @JsonProperty("expires_in") String expiresIn;
    @JsonProperty("scope") String scope;
    @JsonProperty("jti") String jti;
}
