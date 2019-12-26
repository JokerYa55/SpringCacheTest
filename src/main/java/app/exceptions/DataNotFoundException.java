package app.exceptions;

public class DataNotFoundException extends AppAbstractException {

    private static final String ERROR_MESSAGE = "data not found";
    private static final int ERROR_CODE = 1009;

    public DataNotFoundException() {
        super(toJson(ERROR_CODE, ERROR_MESSAGE));
    }

    public DataNotFoundException(String message) {
        super(toJson(ERROR_CODE, message));
    }

}
