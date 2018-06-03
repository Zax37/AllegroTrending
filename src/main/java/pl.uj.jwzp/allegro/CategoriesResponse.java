package pl.uj.jwzp.allegro;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class CategoriesResponse {
    @Data
    @AllArgsConstructor
    public static class Parent {
        String id;

        @JsonCreator
        public static Parent create(@JsonProperty("id") String id) {
            return new Parent(id);
        }
    }

    @Data
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

        @JsonCreator
        public static Category create(
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("parent") Parent parent,
            @JsonProperty("tree") Tree tree,
            @JsonProperty("leaf") Boolean leaf,
            @JsonProperty("hidden") Boolean hidden,
            @JsonProperty("position") Integer position,
            @JsonProperty("options") Options options
        ) {
            return new Category(id, name, parent, tree, leaf, hidden, position, options);
        }

    }

    Parent parent;
    List<Category> categories;

    @Data
    @AllArgsConstructor
    public static class Tree {
        String name;

        @JsonCreator
        public static Tree create(@JsonProperty("name") String name) {
            return new Tree(name);
        }
    }

    @Data
    @AllArgsConstructor
    public static class Options {
        Boolean variantsByImages;
        Boolean advertisement;
        Boolean advertisementPriceOptional;
        Boolean eanRegex;
        Boolean sizeTable;

        @JsonCreator
        public static Options create(
            @JsonProperty("variantsByImages") Boolean variantsByImages,
            @JsonProperty("advertisement") Boolean advertisement,
            @JsonProperty("advertisementPriceOptional") Boolean advertisementPriceOptional,
            @JsonProperty("eanRegex") Boolean eanRegex,
            @JsonProperty("sizeTable") Boolean sizeTable
        ) {
            return new Options(variantsByImages, advertisement, advertisementPriceOptional, eanRegex, sizeTable);
        }
    }
}
