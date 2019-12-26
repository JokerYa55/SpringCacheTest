package app.exceptions;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;

public abstract class AppAbstractException extends Exception {

    public AppAbstractException() {
    }

    public AppAbstractException(String message) {
        super(message);
    }

    public static String toJson(int code, String message) {
        ExceptionData exceptionData = new ExceptionData();
        exceptionData.setErrorMessage(message);
        exceptionData.setErrorCode(code);
        Gson gson = (new GsonBuilder()).create();
        return gson.toJson(exceptionData);
    }
}
