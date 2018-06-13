package pl.uj.jwzp.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("trending.app")
public class ApplicationProperties {
    String url;
}
