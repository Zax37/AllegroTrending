package pl.uj.jwzp.allegro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class CategoriesResponse {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Parent {
        String id;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Category {
        String id;
        String name;
        Parent parent;
        Tree tree;
        Boolean leaf;
        Boolean hidden;
        Integer position;
        Options options;
    }

    Parent parent;
    List<Category> categories;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Tree {
        String name;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Options {
        Boolean variantsByImages;
        Boolean advertisement;
        Boolean advertisementPriceOptional;
        Boolean eanRegex;
        Boolean sizeTable;
    }
}
