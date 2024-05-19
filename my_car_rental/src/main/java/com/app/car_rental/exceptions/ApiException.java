package com.app.car_rental.exceptions;

public class ApiException extends  RuntimeException{

    public ApiException(String message) {
        super(message);
    }

    public ApiException() {
        super();
    }

}
