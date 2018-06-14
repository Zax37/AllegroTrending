package pl.uj.jwzp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeScreenController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getOffers() {
        return new ModelAndView("welcome");
    }
}
