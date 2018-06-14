package pl.uj.jwzp.exceptions;

public class AllegroFailedException extends FrontendHandledException {
    public AllegroFailedException() {
        super("Seems like we failed to communicate with Allegro.");
    }
}
