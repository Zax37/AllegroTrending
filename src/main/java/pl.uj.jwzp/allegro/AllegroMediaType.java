package pl.uj.jwzp.allegro;

import org.springframework.http.MediaType;

public class AllegroMediaType extends MediaType {
    public static final String ALLEGRO_MEDIA_TYPE_BASE = "application";

    public static final String ALLEGRO_PUBLIC_JSON_VALUE = "vnd.allegro.public.v1+json";
    public static final String ALLEGRO_BETA_V1_JSON_VALUE = "vnd.allegro.beta.v1+json";
    public static final String ALLEGRO_BETA_V2_JSON_VALUE = "vnd.allegro.beta.v2+json";

    public static final AllegroMediaType ALLEGRO_PUBLIC_JSON =
            new AllegroMediaType(ALLEGRO_PUBLIC_JSON_VALUE);

    public static final AllegroMediaType ALLEGRO_BETA_V1_JSON =
            new AllegroMediaType(ALLEGRO_BETA_V1_JSON_VALUE);

    public static final AllegroMediaType ALLEGRO_BETA_V2_JSON =
            new AllegroMediaType(ALLEGRO_BETA_V2_JSON_VALUE);

    public AllegroMediaType(String subtype) {
        super(ALLEGRO_MEDIA_TYPE_BASE, subtype);
    }
}
