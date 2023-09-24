package com.example.backend_bookingcar.Exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(int id){
        super("could not found");
    }
}
