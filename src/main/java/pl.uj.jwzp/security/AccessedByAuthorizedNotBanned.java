package pl.uj.jwzp.security;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@PreAuthorize("hasAnyAuthority(T(pl.uj.jwzp.security.AccessLevel).USER.toString(), " +
        "T(pl.uj.jwzp.security.AccessLevel).ADMIN.toString())")
public @interface AccessedByAuthorizedNotBanned {

}
