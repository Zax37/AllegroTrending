package pl.uj.jwzp.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import pl.uj.jwzp.controllers.AccessForbiddenController;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    private AccessForbiddenController forbiddenController;

    public WebSecurityConfig(AccessForbiddenController forbiddenController) {
        this.forbiddenController = forbiddenController;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .headers()
                .frameOptions()
                .sameOrigin()
                .httpStrictTransportSecurity()
                .disable()
                .and()
                .authorizeRequests()
                .antMatchers("/", "/console/**", "/mgmnt/**", "/error/**",
                        "/css/**", "/fonts/**", "/img/**", "/js/**", "/favicon.ico") // static resources
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/admin/**")
                .hasAuthority(AccessLevel.ADMIN.getName())
                .and()
                .authorizeRequests()
                .anyRequest()
                .hasAuthority(AccessLevel.USER.getName())
                .and()
                .logout()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .exceptionHandling()
                .accessDeniedHandler(forbiddenController)
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.NEVER);
    }
}