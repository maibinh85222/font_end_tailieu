package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "BINHLUAN")
public class BinhLuan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdBinhLuan")
    private int uidbinhluan;
    @Column(name = "IdTaiLieu")
    private int idtailieu;
    @Column(name = "IdUser")
    private int iduser;
    @Column(name = "Tg")
    private LocalDateTime tg;
    @Column(name = "NoiDung")
    private String noidung;

    public BinhLuan(){

    }
    public BinhLuan(int uidbinhluan, int idtailieu, int iduser, LocalDateTime tg, String noidung){
        this.uidbinhluan = uidbinhluan;
        this.idtailieu = idtailieu;
        this.iduser = iduser;
        this.tg = tg;
        this.noidung = noidung;
    }
    public BinhLuan(int idtailieu, int iduser, LocalDateTime tg, String noidung){
        this.idtailieu = idtailieu;
        this.iduser = iduser;
        this.tg = tg;
        this.noidung = noidung;
    }

    public int getUidbinhluan() {
        return uidbinhluan;
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

    public String getNoidung() {
        return noidung;
    }

    public void setUidbinhluan(int uidbinhluan) {
        this.uidbinhluan = uidbinhluan;
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

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}
