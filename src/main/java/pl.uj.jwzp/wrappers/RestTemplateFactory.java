package pl.uj.jwzp.wrappers;

import org.springframework.web.client.RestTemplate;

public class RestTemplateFactory {
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }
}
