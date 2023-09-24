package com.example.backend_bookingcar.DTO;

public class TaiLieuDTO {
    private int uid;
    private String tieude;
    private String mota;
    private String duongdan;
    private String mavtro;

    public TaiLieuDTO(){

    }
    public TaiLieuDTO(int uid, String tieude, String mota, String duongdan, String mavtro){
        this.uid = uid;
        this.tieude = tieude;
        this.mota = mota;
        this.duongdan = duongdan;
        this.mavtro = mavtro;
    }
    public TaiLieuDTO(String tieude, String mota, String duongdan, String mavtro){
        this.tieude = tieude;
        this.mota = mota;
        this.duongdan = duongdan;
        this.mavtro = mavtro;
    }

    public int getUid() {
        return uid;
    }

    public String getTieude() {
        return tieude;
    }

    public String getMota() {
        return mota;
    }

    public String getDuongdan() {
        return duongdan;
    }

    public String getMavtro() {
        return mavtro;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public void setDuongdan(String duongdan) {
        this.duongdan = duongdan;
    }

    public void setMavtro(String mavtro) {
        this.mavtro = mavtro;
    }
}
