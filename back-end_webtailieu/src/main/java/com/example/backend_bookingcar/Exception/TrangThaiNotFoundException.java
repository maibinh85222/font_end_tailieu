package com.example.backend_bookingcar.Exception;

public class TrangThaiNotFoundException extends RuntimeException{
    public TrangThaiNotFoundException(int id){
        super("could not found");
    }
}
