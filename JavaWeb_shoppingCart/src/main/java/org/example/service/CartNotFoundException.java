package org.example.service;

public class CartNotFoundException extends Exception {
    public CartNotFoundException(String message) {
        super(message);
    }
}
