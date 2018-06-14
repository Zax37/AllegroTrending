package pl.uj.jwzp.database;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
public class OffersSnapshot implements Serializable {
    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    private Subscription subscription;

    private LocalDateTime dateTime;

    private Double average;

    @Tolerate
    public OffersSnapshot() {
    }
}
