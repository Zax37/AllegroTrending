package pl.uj.jwzp.controllers;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.uj.jwzp.allegro.APIRequest;
import pl.uj.jwzp.allegro.CategoriesResponse;
import pl.uj.jwzp.database.CategoriesRepository;
import pl.uj.jwzp.database.Category;

import java.util.List;

@Service
@RestController
public class CategoriesSupplier {
    public static final String ROOT_ID = "954b95b6-43cf-4104-8354-dea4d9b10ddf";
    public static final String URL_BASE = "categories?parent.id=";
    public static Category ROOT_CATEGORY;

    public CategoriesSupplier (
        CategoriesRepository categoriesRepository,
        APIRequest<CategoriesResponse> apiRequest
    ) {
        List<Category> categories = categoriesRepository.findAllByParentId(ROOT_ID);

        ROOT_CATEGORY = Category.builder()
                .id(ROOT_ID)
                .children(categories)
                .build();

        if (categories.isEmpty()) {
            CategoriesResponse categoriesResponse = apiRequest.get(URL_BASE + ROOT_ID, CategoriesResponse.class);
            categoriesResponse.getCategories().forEach(cat -> {
                Category category = Category.builder()
                        .id(cat.getId())
                        .name(cat.getName())
                        .parent(ROOT_CATEGORY)
                        .parentId(ROOT_ID)
                        .leaf(cat.getLeaf())
                        .build();
                categoriesRepository.save(category);
                categories.add(category);
            });
        }

        System.out.println(categories);
    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Category> getCategories() {
        return ROOT_CATEGORY.getChildren();
    }
}
