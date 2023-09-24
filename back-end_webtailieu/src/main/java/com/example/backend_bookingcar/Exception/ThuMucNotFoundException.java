package com.example.backend_bookingcar.Exception;

public class ThuMucNotFoundException extends RuntimeException{
    public ThuMucNotFoundException(int id){
        super("could not found");
    }
}
