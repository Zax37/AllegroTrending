package pl.uj.jwzp.launchers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.uj.jwzp.config.AllegroProperties;
import pl.uj.jwzp.config.ApplicationProperties;

@SpringBootApplication(scanBasePackages = "pl.uj.jwzp")
@EnableJpaRepositories("pl.uj.jwzp.database")
@EntityScan("pl.uj.jwzp.database")
@EnableConfigurationProperties({AllegroProperties.class, ApplicationProperties.class})
public class SpringLauncher
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringLauncher.class, args);
    }
}