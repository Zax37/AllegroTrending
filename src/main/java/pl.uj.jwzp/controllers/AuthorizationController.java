package pl.uj.jwzp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.uj.jwzp.config.AllegroProperties;
import pl.uj.jwzp.config.ApplicationProperties;
import pl.uj.jwzp.services.AuthService;
import pl.uj.jwzp.util.UrlJoiner;

import java.rmi.RemoteException;
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
    public ModelAndView redirect(
            @RequestParam Optional<String> code
    ) throws RemoteException {
        if (code.isPresent()) {
            String token = authService.getAccessTokenFromCode(code.get());
            String login = authService.getUserLoginFromAccessToken(token);
            ModelAndView ret = new ModelAndView("code");
            ret.getModelMap().addAttribute("login", login);
            return ret;
        } else {
            return new ModelAndView("redirect:" + AUTH_URL);
        }
    }
}
