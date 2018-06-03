package pl.uj.jwzp.database;

import lombok.Builder;
import lombok.Data;
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
    String parentId;
    @Transient
    Category parent;
    @Transient
    List<Category> children;
    boolean leaf;

    @Tolerate
    public Category() {
    }

    @Override
    public String toString() {
        return id;
    }
}
