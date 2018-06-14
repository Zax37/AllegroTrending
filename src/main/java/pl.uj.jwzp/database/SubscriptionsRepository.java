package pl.uj.jwzp.database;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SubscriptionsRepository extends CrudRepository<Subscription, String> {
    List<Subscription> findAllBySubscribersContaining(User user);
    Optional<Subscription> findByCategoryAndPhrase(Category category, String phrase);
}
