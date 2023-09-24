package com.example.backend_bookingcar.DTO;

public class CT_TaiLieuDTO {

    private int uidct;
    private int idthe;
    private int idtailieu;
    private String mota;

    public CT_TaiLieuDTO(){

    }
    public CT_TaiLieuDTO(int uidct, int idthe, int idtailieu, String mota){
        this.uidct = uidct;
        this.idthe = idthe;
        this.idtailieu = idtailieu;
        this.mota = mota;

    }
    public CT_TaiLieuDTO(int idthe, int idtailieu, String mota){
        this.idthe = idthe;
        this.idtailieu = idtailieu;
        this.mota = mota;
    }

    public int getUidct() {
        return uidct;
    }

    public int getIdthe() {
        return idthe;
    }

    public int getIdtailieu() {
        return idtailieu;
    }

    public String getMota() {
        return mota;
    }

    public void setUidct(int uidct) {
        this.uidct = uidct;
    }

    public void setIdthe(int idthe) {
        this.idthe = idthe;
    }

    public void setIdtailieu(int idtailieu) {
        this.idtailieu = idtailieu;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
