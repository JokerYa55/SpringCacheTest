package app.exceptions;

import lombok.Data;

@Data
public class ExceptionData {

    private int errorCode;
    private String errorMessage;

    public ExceptionData() {
    }

    public ExceptionData(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

}
