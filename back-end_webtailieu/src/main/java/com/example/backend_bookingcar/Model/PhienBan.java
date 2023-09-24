package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "PHIENBAN")
public class PhienBan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPhienBan")
    private int uidphienban;
    @Column(name = "IdTaiLieu")
    private int idtailieu;
    @Column(name = "IdUser")
    private int iduser;
    @Column(name = "Tg")
    private LocalDateTime tg;
    @Column(name = "MoTa")
    private String mota;

    public PhienBan(){

    }
    public PhienBan(int uidphienban, int idtailieu, int iduser, LocalDateTime tg, String mota){
        this.uidphienban = uidphienban;
        this.idtailieu = idtailieu;
        this.iduser = iduser;
        this.tg = tg;
        this.mota = mota;

    }
    public PhienBan(int idtailieu, int iduser, LocalDateTime tg, String mota){
        this.idtailieu = idtailieu;
        this.iduser = iduser;
        this.tg = tg;
        this.mota = mota;
    }

    public int getUidphienban() {
        return uidphienban;
    }

    public int getIdtailieu() {
        return idtailieu;
    }

    public int getIduser() {
        return iduser;
    }

    public LocalDateTime getTg() {
        return tg;
    }

    public String getMota() {
        return mota;
    }

    public void setUidphienban(int uidphienban) {
        this.uidphienban = uidphienban;
    }

    public void setIdtailieu(int idtailieu) {
        this.idtailieu = idtailieu;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setTg(LocalDateTime tg) {
        this.tg = tg;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
