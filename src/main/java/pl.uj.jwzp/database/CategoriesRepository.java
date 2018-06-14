package pl.uj.jwzp.database;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CategoriesRepository extends CrudRepository<Category, String> {
    Optional<Category> findById(String id);
    List<Category> findAllByParentId(String id);
}
