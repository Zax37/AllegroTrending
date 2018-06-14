package pl.uj.jwzp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.uj.jwzp.database.Category;
import pl.uj.jwzp.services.CategoriesSupplier;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoriesRestController {
    private CategoriesSupplier categoriesSupplier;

    CategoriesRestController(CategoriesSupplier categoriesSupplier) {
        this.categoriesSupplier = categoriesSupplier;
    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Category.FrontendContext> getCategories(
            @RequestParam Optional<String> parentId
    ) {
        return categoriesSupplier.getCategoriesInFrontendContext(parentId);
    }
}
