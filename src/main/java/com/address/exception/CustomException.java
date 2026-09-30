package com.address.exception;

import org.springframework.http.HttpStatus;

public class CustomException {
    private String status;

    public CustomException(String message, HttpStatus status){
        super(message);
        this.status = status;
    }
    public CustomException(String message){
        super(message);
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
