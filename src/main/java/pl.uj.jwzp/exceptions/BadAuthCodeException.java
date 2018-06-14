package pl.uj.jwzp.exceptions;

public class BadAuthCodeException extends FrontendHandledException {
    public BadAuthCodeException() {
        super("Supplied authentication code seems to be invalid.");
    }
}
