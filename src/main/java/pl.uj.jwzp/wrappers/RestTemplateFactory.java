package pl.uj.jwzp.wrappers;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateFactory {
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }
}
