package pl.uj.jwzp.controllers;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.uj.jwzp.allegro.APIRequest;
import pl.uj.jwzp.allegro.CategoriesResponse;
import pl.uj.jwzp.database.CategoriesRepository;
import pl.uj.jwzp.database.Category;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RestController
public class CategoriesSupplier {
    private static final String ROOT_ID = "954b95b6-43cf-4104-8354-dea4d9b10ddf";
    private static final String CATEGORY_URL_BASE = "categories/{id}";
    private static final String CATEGORIES_URL_BASE = "categories?parent.id={id}";
    private static Category ROOT_CATEGORY;

    private CategoriesRepository categoriesRepository;
    private APIRequest<CategoriesResponse.Category> apiRequestSingle;
    private APIRequest<CategoriesResponse> apiRequestMultiple;

    private Category createWithoutChildren(CategoriesResponse.Category categoryResponse, Category parent) {
        if (parent == null && !categoryResponse.getId().equals(ROOT_ID)) {
            parent = getExistingOrCreateWithoutChildren(categoryResponse.getParent().getId());
        }
        Category newCategory = Category.builder()
                .id(categoryResponse.getId())
                .name(categoryResponse.getName())
                .parent(parent)
                .leaf(categoryResponse.getLeaf())
                .build();
        categoriesRepository.save(newCategory);
        return newCategory;
    }

    private Category getExistingOrCreateWithoutChildren(
            CategoriesResponse.Category categoryResponse,
            Category parent
    ) {
        Optional<Category> category = categoriesRepository.findById(categoryResponse.getId());
        return category.orElseGet(() -> createWithoutChildren(categoryResponse, parent));
    }

    private Category getExistingOrCreateWithoutChildren(String id) {
        Optional<Category> category = categoriesRepository.findById(id);
        if (category.isPresent()) {
            return category.get();
        } else {
            CategoriesResponse.Category categoryResponse =
                    apiRequestSingle.get(
                            CATEGORY_URL_BASE,
                            CategoriesResponse.Category.class,
                            Collections.singletonMap("id", id)
                    );
            return createWithoutChildren(categoryResponse, null);
        }
    }

    private Category getWithChildrenSynchro(String id) {
        Optional<Category> category = categoriesRepository.findById(id);
        Category cat = category.orElseGet(
                () -> {
                    CategoriesResponse.Category categoryResponse =
                            apiRequestSingle.get(
                                    CATEGORY_URL_BASE,
                                    CategoriesResponse.Category.class,
                                    Collections.singletonMap("id", id)
                            );
                    return createWithoutChildren(categoryResponse, null);
                }
        );

        if (cat.isLeaf() || (cat.getChildren() != null && !cat.getChildren().isEmpty())) {
            return cat;
        } else {
            List<Category> children = new ArrayList<>();
            CategoriesResponse categoriesResponse =
                    apiRequestMultiple.get(
                            CATEGORIES_URL_BASE,
                            CategoriesResponse.class,
                            Collections.singletonMap("id", id)
                    );
            categoriesResponse.getCategories()
                    .parallelStream()
                    .forEach(c -> {
                        children.add(getExistingOrCreateWithoutChildren(c, cat));
                    });
            cat.setChildren(children);
            categoriesRepository.save(cat);
            return cat;
        }
    }

    public CategoriesSupplier (
        CategoriesRepository categoriesRepository,
        APIRequest<CategoriesResponse.Category> apiRequestSingle,
        APIRequest<CategoriesResponse> apiRequestMultiple
    ) {
        this.categoriesRepository = categoriesRepository;
        this.apiRequestSingle = apiRequestSingle;
        this.apiRequestMultiple = apiRequestMultiple;

        ROOT_CATEGORY = getWithChildrenSynchro(ROOT_ID);
    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Category.FrontendContext> getCategories(
            @RequestParam Optional<String> parentId
    ) {
        Category parent = parentId.isPresent() ? getWithChildrenSynchro(parentId.get()) : ROOT_CATEGORY;
        return parent.getChildren()
                .parallelStream()
                .map(Category::getFrontendContext)
                .collect(Collectors.toList());
    }
}
