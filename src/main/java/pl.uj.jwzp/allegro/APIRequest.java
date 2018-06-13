package pl.uj.jwzp.allegro;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.uj.jwzp.config.AllegroProperties;
import pl.uj.jwzp.util.UrlJoiner;

import java.util.Collections;
import java.util.Map;

@Component
public class APIRequest<Ret> {
    private MediaType ACCEPTS = AllegroMediaType.ALLEGRO_PUBLIC_JSON;
    private AllegroProperties allegroProperties;
    private UrlJoiner urlJoiner;

    public APIRequest(
            AllegroProperties allegroProperties,
            UrlJoiner urlJoiner
    ) {
        this.allegroProperties = allegroProperties;
        this.urlJoiner = urlJoiner;
    }

    public Ret get(String url, Class<Ret> cls, Map<String, ?> params) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(ACCEPTS));
        HttpEntity<String> entity = new HttpEntity<>(headers);

        String endpoint = urlJoiner.join(allegroProperties.getRestUrl(), url);

        ResponseEntity<Ret> response = restTemplate.exchange(
                endpoint,
                HttpMethod.GET,
                entity,
                cls,
                params
        );

        return response.getBody();
    }
}
