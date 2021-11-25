package com.kord.brewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List<String>> validationExceptionHandler(ConstraintViolationException e) {
        List<String> errors = new ArrayList<>(e.getConstraintViolations().size());

        e.getConstraintViolations().forEach(constraintViolation -> {
            errors.add(constraintViolation.getPropertyPath() + ": " + constraintViolation.getMessage());
        });

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<List<String>> handleBindException(BindException e) {
        return new ResponseEntity(e.getStackTrace(), HttpStatus.BAD_REQUEST);
    }
}
