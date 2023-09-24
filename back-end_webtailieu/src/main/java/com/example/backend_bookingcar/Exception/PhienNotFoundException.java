package com.example.backend_bookingcar.Exception;

public class PhienNotFoundException extends RuntimeException{
    public PhienNotFoundException(int id){
        super("could not found");
    }
}
