package pl.uj.jwzp.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pl.uj.jwzp.exceptions.FrontendHandledException;

@ControllerAdvice
public class ErrorsHandlingController extends ResponseEntityExceptionHandler {
    @ExceptionHandler(FrontendHandledException.class)
    protected ModelAndView handleConflict(FrontendHandledException ex) {
        ModelAndView error = new ModelAndView("oops");
        error.getModel().put("exception", ex.getLocalizedMessage());
        return error;
    }

    @ExceptionHandler(HttpClientErrorException.class)
    public ModelAndView errorDisplay(HttpClientErrorException exception) {
        ModelAndView accessDenied = new ModelAndView("accessDenied");
        accessDenied.getModel().put("principal", exception.getLocalizedMessage());
        return accessDenied;
    }
}
