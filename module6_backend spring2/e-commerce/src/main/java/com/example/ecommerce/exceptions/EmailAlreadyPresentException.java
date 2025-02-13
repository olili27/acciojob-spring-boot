package com.example.ecommerce.exceptions;

public class EmailAlreadyPresentException extends Exception{

    public EmailAlreadyPresentException(String message) {
        super(message);
    }
}
