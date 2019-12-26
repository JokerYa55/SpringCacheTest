package app.exceptions;

public class PrivelegesException extends AppAbstractException {

    private static final String ERROR_MESSAGE = "insufficiently privileged";
    private static final int ERROR_CODE = 1002;

    public PrivelegesException() {
        super(toJson(ERROR_CODE, ERROR_MESSAGE));
    }

    public PrivelegesException(String message) {
        super(toJson(ERROR_CODE, message));
    }

}
