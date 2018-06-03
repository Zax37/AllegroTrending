package pl.uj.jwzp.launchers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "pl.uj.jwzp")
@EnableJpaRepositories("pl.uj.jwzp.database")
@EntityScan("pl.uj.jwzp.database")
public class SpringLauncher
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringLauncher.class, args);
    }
}