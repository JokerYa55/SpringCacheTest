package app.controller;

import app.exceptions.DataNotFoundException;
import app.exceptions.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler {

    @ExceptionHandler({UserNotFoundException.class, DataNotFoundException.class})
    public final ResponseEntity handleParamNotFoundException(Exception ex, WebRequest request) {
        return new ResponseEntity(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({org.springframework.web.client.HttpClientErrorException.class})
    public final ResponseEntity handlePrivelegesException(Exception ex, WebRequest request) {
        log.info("{}",ex);
        return new ResponseEntity(ex.getMessage(), HttpStatus.FORBIDDEN);
    }
    
    
    
//
//    @ExceptionHandler({DefaultException.class})
//    public final ResponseEntity handleDefoultException(Exception ex, WebRequest request) {
//        return new ResponseEntity(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//    }

}
