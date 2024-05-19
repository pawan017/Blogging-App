package com.app.car_rental.exceptions;

public class ResourceNotFoundExceptio extends RuntimeException {
    public ResourceNotFoundExceptio(String message) {

        super(message);
    }
    public ResourceNotFoundExceptio() {

        super("please enter valid details");
    }
}
