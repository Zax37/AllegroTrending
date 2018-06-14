package pl.uj.jwzp.database;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Builder
public class Subscription implements Serializable {
    @Id
    @GeneratedValue
    Long id;

    @ManyToMany
    private List<User> subscribers;

    private Category category;

    private String phrase;

    @OneToMany(fetch = FetchType.EAGER)
    private List<OffersSnapshot> snapshots;

    @Tolerate
    public Subscription() {
    }
}
