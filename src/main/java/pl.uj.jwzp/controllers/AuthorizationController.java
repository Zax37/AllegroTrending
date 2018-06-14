package pl.uj.jwzp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pl.uj.jwzp.properties.AllegroProperties;
import pl.uj.jwzp.properties.ApplicationProperties;
import pl.uj.jwzp.services.AuthService;
import pl.uj.jwzp.util.UrlJoiner;

import java.util.Optional;

@RestController
public class AuthorizationController {
    private static final String AUTH_URL_BASE = "auth/oauth/authorize?response_type=code&redirect_uri=";
    private static final String CLIENT_ID_PARAM = "&client_id=";

    private AuthService authService;
    private final String AUTH_URL;

    AuthorizationController(
            AllegroProperties allegroProperties,
            ApplicationProperties applicationProperties,
            AuthService authService,
            UrlJoiner urlJoiner
    ) {
        this.authService = authService;
        AUTH_URL = urlJoiner.join(allegroProperties.getPageUrl(), AUTH_URL_BASE)
                + applicationProperties.getUrl() + CLIENT_ID_PARAM + allegroProperties.getClientId();

    }

    @RequestMapping("/")
    public RedirectView authRedirect(
            @RequestParam Optional<String> code
    ) {
        if (code.isPresent()) {
            authService.authorizeWithCode(code.get());
            return new RedirectView("/dashboard");
        } else {
            return new RedirectView("/welcome");
        }
    }

    @RequestMapping("/login")
    public ModelAndView loginRedirect() {
        return new ModelAndView("redirect:" + AUTH_URL);
    }
}
