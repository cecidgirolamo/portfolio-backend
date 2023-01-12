package com.argentinaprograma.cdegirolamo.portfolio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandler {

    @ExceptionHandler
    public ResponseEntity<String> catchException(NullPointerException exception) {
        return new ResponseEntity<>("error", HttpStatus.BAD_REQUEST);
    }
}