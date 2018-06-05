package pl.uj.jwzp.database;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;
import lombok.experimental.Tolerate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Builder
public class Category implements Serializable {
    @Id
    String id;
    String name;
    @ManyToOne
    Category parent;
    @ElementCollection
    @ManyToMany
    List<Category> children;
    boolean leaf;

    @Tolerate
    public Category() {
    }

    @AllArgsConstructor
    @Value
    public class FrontendContext {
        String id;
        String name;
        boolean leaf;
    }

    @Transient
    public FrontendContext getFrontendContext() {
        return new FrontendContext(id, name, leaf);
    }
}
