package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "LICHSUHOATDONG")
public class LichSuHoatDong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdLichSu")
    private int uidLichSu;
    @Column(name = "IdUser")
    private int iduser;
    @Column(name = "TgHoatDong")
    private LocalDateTime tghoatdong;
    @Column(name = "IdTaiLieu")
    private int idtailieu;
    @Column(name = "LoaiHoatDong")
    private String loaihoatdong;

    public LichSuHoatDong(){

    }
    public LichSuHoatDong(int uidlichsu, int uiduser, LocalDateTime tghoatdong, int uidtailieu, String loaihoatdong){
        this.uidLichSu = uidlichsu;
        this.iduser = uiduser;
        this.tghoatdong = tghoatdong;
        this.idtailieu = uidtailieu;
        this.loaihoatdong = loaihoatdong;
    }
    public LichSuHoatDong(int uiduser, LocalDateTime tghoatdong, int uidtailieu, String loaihoatdong){
        this.iduser = uiduser;
        this.tghoatdong = tghoatdong;
        this.idtailieu = uidtailieu;
        this.loaihoatdong = loaihoatdong;
    }

    public int getUidLichSu() {
        return uidLichSu;
    }

    public int getIduser() {
        return iduser;
    }

    public LocalDateTime getTghoatdong() {
        return tghoatdong;
    }

    public int getIdtailieu() {
        return idtailieu;
    }

    public String getLoaihoatdong() {
        return loaihoatdong;
    }

    public void setUidLichSu(int uidLichSu) {
        this.uidLichSu = uidLichSu;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setTghoatdong(LocalDateTime tghoatdong) {
        this.tghoatdong = tghoatdong;
    }

    public void setIdtailieu(int idtailieu) {
        this.idtailieu = idtailieu;
    }

    public void setLoaihoatdong(String loaihoatdong) {
        this.loaihoatdong = loaihoatdong;
    }
}
