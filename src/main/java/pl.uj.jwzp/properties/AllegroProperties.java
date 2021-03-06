package pl.uj.jwzp.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("allegro.api")
public class AllegroProperties {
    String pageUrl;
    String restUrl;
    String wsdlUrl;
    String apiKey;
    String clientId;
    String clientSecret;
    Integer countryId;
}
