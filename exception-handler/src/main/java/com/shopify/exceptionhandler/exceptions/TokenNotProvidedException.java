package com.shopify.exceptionhandler.exceptions;

public class TokenNotProvidedException extends RuntimeException{
    public TokenNotProvidedException(String message) {
        super(message);
    }
}
