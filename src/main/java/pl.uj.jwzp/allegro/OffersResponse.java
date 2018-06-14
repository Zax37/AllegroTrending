package pl.uj.jwzp.allegro;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class OffersResponse {
    @JsonProperty("offers")
    List<Offer> offers;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Offer {
        private String id;
        private String url;
        private Integer bidsCount;
        private Boolean auction;
        private Boolean advert;
        private Boolean buyNow;
        private String name;
        private Boolean cartAvailable;
        private Quantity quantity;
        private Seller seller;
        private Emphases emphases;
        private Shipping shipping;
        private Prices prices;
        private List<Object> parameters = null;
        private String vendor;
        private List<Image> images = null;
        private Boolean infinite;
        private Location location;
        private Loyalty loyalty;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Quantity {
        private String unitType;
        private Integer value;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Seller {
        private Integer id;
        private Boolean allegroStandard;
        private Boolean superSeller;
        private String logotypeUrl;
        private String shopName;
        private Boolean brandZone;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Emphases {
        private Boolean promoted;
        private Boolean bold;
        private Boolean highlight;
        private Object promoBadgeUrl;
        private Object promoBadgeTopUrl;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Shipping {
        private Cost lowestShippingCost;
        private Boolean free;
        private Boolean freeReturn;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Prices {
        private Cost buyNow;
        private Cost withDelivery;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Image {
        private Object url;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Location {
        private String countryCode;
        private String location;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Loyalty {
        private Integer coins;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Cost {
        private Float amount;
        private String currency;
    }
}
