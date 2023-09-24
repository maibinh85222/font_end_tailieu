package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "CT_TAILIEU")
public class CT_TaiLieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCT")
    private int uidct;
    @Column(name = "IdThe")
    private int idthe;
    @Column(name = "IdTaiLieu")
    private int idtailieu;
    @Column(name = "MoTa")
    private String mota;
    public CT_TaiLieu(){

    }
    public CT_TaiLieu(int uidct, int idthe, int idtailieu, String mota){
        this.uidct = uidct;
        this.idthe = idthe;
        this.idtailieu = idtailieu;
        this.mota = mota;

    }
    public CT_TaiLieu(int idthe, int idtailieu, String mota){
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
