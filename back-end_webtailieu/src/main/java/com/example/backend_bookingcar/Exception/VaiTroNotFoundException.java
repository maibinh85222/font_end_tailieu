package com.example.backend_bookingcar.Exception;

public class VaiTroNotFoundException extends RuntimeException{
    public VaiTroNotFoundException(int id){
        super("could not found");
    }
}
