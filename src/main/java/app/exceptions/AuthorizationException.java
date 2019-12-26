package app.exceptions;

import java.io.IOException;

public class AuthorizationException extends AppAbstractException {

    private static final String ERROR_MESSAGE = "Token not valid";
    private static final int ERROR_CODE = 1001;

    public AuthorizationException() {
        super(toJson(ERROR_CODE, ERROR_MESSAGE));
    }

    public AuthorizationException(String message) {
        super(toJson(ERROR_CODE, message));
    }

}
