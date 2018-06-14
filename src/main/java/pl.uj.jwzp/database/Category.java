package pl.uj.jwzp.database;

import lombok.Builder;
import lombok.Data;
import lombok.Value;
import lombok.experimental.Tolerate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
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
    @OneToMany(mappedBy="parent", fetch = FetchType.EAGER)
    List<Category> children;
    boolean leaf;

    @Tolerate
    public Category() {
    }

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
