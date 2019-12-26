package app.exceptions;

public class DefaultException extends AppAbstractException {

    public DefaultException(int errorCode, String message) {
        super(toJson(errorCode, message));
    }

}
