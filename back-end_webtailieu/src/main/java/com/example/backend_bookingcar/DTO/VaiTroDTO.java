package com.example.backend_bookingcar.DTO;

public class VaiTroDTO {
    private int uid;
    private String mavtro;
    private String tenvtro;
    private String mota;

    public VaiTroDTO(){

    }
    public VaiTroDTO(int uid, String mavtro, String tenvtro, String mota){
        this.uid = uid;
        this.mavtro = mavtro;
        this.tenvtro = tenvtro;
        this.mota = mota;
    }
    public VaiTroDTO(String mavtro, String tenvtro, String mota){
        this.mavtro = mavtro;
        this.tenvtro = tenvtro;
        this.mota = mota;
    }

    public int getUid() {
        return uid;
    }

    public String getMavtro() {
        return mavtro;
    }

    public String getTenvtro() {
        return tenvtro;
    }

    public String getMota() {
        return mota;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setMavtro(String mavtro) {
        this.mavtro = mavtro;
    }

    public void setTenvtro(String tenvtro) {
        this.tenvtro = tenvtro;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
