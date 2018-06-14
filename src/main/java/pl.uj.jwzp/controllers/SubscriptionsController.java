package pl.uj.jwzp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.uj.jwzp.database.Category;
import pl.uj.jwzp.database.Subscription;
import pl.uj.jwzp.database.SubscriptionsRepository;
import pl.uj.jwzp.database.User;
import pl.uj.jwzp.security.AllegroAuthentication;
import pl.uj.jwzp.services.CategoriesSupplier;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class SubscriptionsController {
    private CategoriesSupplier categoriesSupplier;
    private SubscriptionsRepository subscriptionsRepository;

    SubscriptionsController(
            CategoriesSupplier categoriesSupplier,
            SubscriptionsRepository subscriptionsRepository
    ) {
        this.categoriesSupplier = categoriesSupplier;
        this.subscriptionsRepository = subscriptionsRepository;
    }

    @RequestMapping(value = "/subscription", method = RequestMethod.GET)
    public void subscribe(
            AllegroAuthentication authentication,
            @RequestParam String parentId,
            @RequestParam String phrase,
            HttpServletResponse response
    ) {
        Category category = categoriesSupplier.getSingleCategoryById(parentId);

        Optional<Subscription> subscription = subscriptionsRepository.findByCategoryAndPhrase(category, phrase);

        if (subscription.isPresent()) {
            Subscription sub = subscription.get();
            List<User> subscribers = sub.getSubscribers();
            if (!subscribers.contains(authentication.getPrincipal())) {
                subscribers.add(authentication.getPrincipal());
                subscriptionsRepository.save(sub);
                response.setStatus(201);
            }
            response.setStatus(400); //bad request, already on the list
        } else {
            Subscription sub = Subscription.builder()
                    .category(category)
                    .phrase(phrase)
                    .subscribers(Collections.singletonList(authentication.getPrincipal()))
                    .build();

            subscriptionsRepository.save(sub);
            response.setStatus(201);
        }
    }
}
