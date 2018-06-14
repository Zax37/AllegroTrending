package pl.uj.jwzp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.uj.jwzp.database.OfferSnapshotsRepository;
import pl.uj.jwzp.services.OffersCalculator;

@Controller
public class OffersSnapshotController {
    private OffersCalculator offersCalculator;
    private OfferSnapshotsRepository offerSnapshotsRepository;

    OffersSnapshotController(
            OffersCalculator offersCalculator,
            OfferSnapshotsRepository offerSnapshotsRepository
    ) {
        this.offersCalculator = offersCalculator;
        this.offerSnapshotsRepository = offerSnapshotsRepository;
    }

    @RequestMapping(value = "/offers", method = RequestMethod.GET)
    @ResponseBody
    public Double getOffersAverage(
            @RequestParam String parentId,
            @RequestParam String phrase
    ) {
        return offersCalculator.getOffersAverage(parentId, phrase);
    }
}
