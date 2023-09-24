package com.example.backend_bookingcar.Exception;

public class LichSuNotFoundException extends RuntimeException{
    public LichSuNotFoundException(int id){
        super("could not found");
    }
}

