package com.address.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex){
        ErrorResponse response = new ErrorResponse(ex.getMessage(), ex.getStatus());
        return new ResponseEntity<>(response, ex.getStatus());
    }

    @ExceptionHandler(org.employee.exception.BadRequestException.class)
    public ResponseEntity<org.employee.exception.ErrorResponse> handleBadRequestException (BadRequestException ex){
        org.employee.exception.ErrorResponse response = new org.employee.exception.ErrorResponse(ex.getMessage(), ex.getStatus());
        return new ResponseEntity<>(response, ex.getStatus());
    }

    @ExceptionHandler(MissingParameterException.class)
    public ResponseEntity<org.employee.exception.ErrorResponse> handleMissingParameterException (MissingParameterException ex){
        org.employee.exception.ErrorResponse response = new org.employee.exception.ErrorResponse(ex.getMessage(), ex.getStatus());
        return new ResponseEntity<>(response, ex.getStatus());
    }
}
