package com.example.backend_bookingcar.DTO;

public class TheTagDTO {
    private int idthe;
    private String tenthe;
    public TheTagDTO(){

    }
    public TheTagDTO(int idthe, String tenthe){
        this.idthe = idthe;
        this.tenthe = tenthe;
    }
    public TheTagDTO(String tenthe){
        this.tenthe = tenthe;
    }

    public int getIdthe() {
        return idthe;
    }

    public String getTenthe() {
        return tenthe;
    }

    public void setIdthe(int idthe) {
        this.idthe = idthe;
    }

    public void setTenthe(String tenthe) {
        this.tenthe = tenthe;
    }
}
