package com.example.backend_bookingcar.Exception;

public class TaiLieuNotFoundException extends RuntimeException{
    public TaiLieuNotFoundException(int id){
        super("could not found");
    }
}
