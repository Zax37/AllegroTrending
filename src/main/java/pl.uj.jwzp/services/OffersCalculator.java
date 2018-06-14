package pl.uj.jwzp.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import pl.uj.jwzp.allegro.APIRequest;
import pl.uj.jwzp.allegro.OffersResponse;

import java.util.HashMap;
import java.util.Map;

@Service
@RestController
public class OffersCalculator {
    private static final String OFFERS_URL_BASE = "offers?categoryId={category}&phrase=\"{phrase}\"";

    private APIRequest<OffersResponse> apiRequest;

    public OffersCalculator(
        APIRequest<OffersResponse> apiRequest
    ) {
        this.apiRequest = apiRequest;
    }

    public Double getOffersAverage(String parentId, String phrase) {
        Map<String, String> params = new HashMap<>();
        params.put("category", parentId);
        params.put("phrase", phrase);
        return apiRequest.get(OFFERS_URL_BASE, OffersResponse.class, params).getOffers()
                .parallelStream()
                .mapToDouble(offer -> {
                    OffersResponse.Prices prices = offer.getPrices();
                    return prices.getWithDelivery() != null ?
                            prices.getWithDelivery().getAmount() : prices.getBuyNow().getAmount();
                })
                .average().orElse(0);
    }
}
