package app.exceptions;

public class UserNotFoundException extends AppAbstractException {

    private static final String ERROR_MESSAGE = "user not found";
    private static final int ERROR_CODE = 1007;

    public UserNotFoundException() {
        super(toJson(ERROR_CODE, ERROR_MESSAGE));
    }

    public UserNotFoundException(String message) {
        super(toJson(ERROR_CODE, message));
    }

}
