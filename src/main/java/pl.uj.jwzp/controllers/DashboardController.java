package pl.uj.jwzp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.uj.jwzp.security.AccessedByAuthorizedNotBanned;
import pl.uj.jwzp.security.AllegroAuthentication;
import pl.uj.jwzp.services.CategoriesSupplier;

import java.util.Optional;

@RestController
public class DashboardController {
    private CategoriesSupplier categoriesSupplier;

    DashboardController(CategoriesSupplier categoriesSupplier) {
        this.categoriesSupplier = categoriesSupplier;
    }

    @AccessedByAuthorizedNotBanned
    @RequestMapping("/dashboard")
    public ModelAndView showDashboard(
            AllegroAuthentication authentication
    ) {
        ModelAndView dashboard = new ModelAndView("home");
        dashboard.getModel().put("login", authentication.getPrincipal().getLogin());
        dashboard.getModel().put("categories", categoriesSupplier.getCategoriesInFrontendContext(Optional.empty()));
        return dashboard;
    }
}
