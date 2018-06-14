package pl.uj.jwzp.database;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.Tolerate;
import pl.uj.jwzp.security.AccessLevel;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
@Builder
public class User implements Serializable {
    @Id
    private Long allegroId;
    private String login;
    private String apiKey;

    @Getter
    @Enumerated(EnumType.STRING)
    private AccessLevel accessLevel;

    @Tolerate
    public User() {
    }
}
