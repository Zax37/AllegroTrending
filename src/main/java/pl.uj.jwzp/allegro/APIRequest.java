package pl.uj.jwzp.allegro;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Component
public class APIRequest<Ret> {
    public static final String API_KEY = "6d87282e";
    public static final MediaType ACCEPTS = new MediaType("application", "vnd.allegro.public.v1+json");
    public static final String URL_BASE = "https://api.allegro.pl.allegrosandbox.pl/";

    public Ret get(String url, Class<Ret> cls) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(ACCEPTS));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<Ret> response = restTemplate.exchange(URL_BASE + url, HttpMethod.GET, entity, cls);
        return response.getBody();
    }
}
