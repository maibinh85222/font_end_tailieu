package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "TAILIEU")
public class TaiLieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTaiLieu")
    private int uidTaiLieu;

    @Column(name = "tieude")
    private String tieude;
    @Column(name = "mota")
    private String mota;
    @Column(name = "duongdan")
    private String duongdan;
    @Column(name = "mavtro")
    private String mavtro;

    public TaiLieu(){

    }
    public TaiLieu(int uid, String tieude, String mota, String duongdan, String mavtro){
        this.uidTaiLieu = uid;
        this.tieude = tieude;
        this.mota = mota;
        this.duongdan = duongdan;
        this.mavtro = mavtro;
    }
    public TaiLieu(String tieude, String mota, String duongdan, String mavtro){
        this.tieude = tieude;
        this.mota = mota;
        this.duongdan = duongdan;
        this.mavtro = mavtro;
    }

    public int getUidTaiLieu() {
        return uidTaiLieu;
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

    public void setUidTaiLieu(int uidTaiLieu) {
        this.uidTaiLieu = uidTaiLieu;
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
