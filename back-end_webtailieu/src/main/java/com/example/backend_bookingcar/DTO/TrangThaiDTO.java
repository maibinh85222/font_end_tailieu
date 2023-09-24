package com.example.backend_bookingcar.DTO;

public class TrangThaiDTO {
    private int uid;
    private  String matt;
    private String tentt;

    public TrangThaiDTO(){

    }

    public TrangThaiDTO(int uid, String matt, String tentt){
        this.uid = uid;
        this.matt = matt;
        this.tentt = tentt;
    }

    public TrangThaiDTO(String matt, String tentt){
        this.matt = matt;
        this.tentt = tentt;
    }

    public int getUid() {
        return uid;
    }

    public String getMatt() {
        return matt;
    }

    public String getTentt() {
        return tentt;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setMatt(String matt) {
        this.matt = matt;
    }

    public void setTentt(String tentt) {
        this.tentt = tentt;
    }
}
