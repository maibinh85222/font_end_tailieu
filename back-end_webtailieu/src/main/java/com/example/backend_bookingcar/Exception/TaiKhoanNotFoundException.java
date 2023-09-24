package com.example.backend_bookingcar.Exception;

public class TaiKhoanNotFoundException extends RuntimeException{
    public TaiKhoanNotFoundException(int id){
        super("could not found");
    }
}
