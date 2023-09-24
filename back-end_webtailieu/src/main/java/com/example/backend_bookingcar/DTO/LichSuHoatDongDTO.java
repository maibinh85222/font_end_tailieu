package com.example.backend_bookingcar.DTO;

import com.example.backend_bookingcar.Model.LichSuHoatDong;

import java.time.LocalDateTime;

public class LichSuHoatDongDTO {
    private int uidlichsu;
    private int iduser;
    private int idtailieu;
    private LocalDateTime tghoatdong;
    private String loaihoatdong;
    public LichSuHoatDongDTO(){

    }
    public LichSuHoatDongDTO(int uidlichsu, int uiduser, LocalDateTime tghoatdong, int uidtailieu, String loaihoatdong){
        this.uidlichsu = uidlichsu;
        this.iduser = uiduser;
        this.idtailieu = uidtailieu;
        this.tghoatdong = tghoatdong;
        this.loaihoatdong = loaihoatdong;
    }
    public LichSuHoatDongDTO(int uiduser, LocalDateTime tghoatdong, int uidtailieu, String loaihoatdong){
        this.iduser = uiduser;
        this.idtailieu = uidtailieu;
        this.tghoatdong = tghoatdong;
        this.loaihoatdong = loaihoatdong;
    }

    public int getUidlichsu() {
        return uidlichsu;
    }

    public int getIduser() {
        return iduser;
    }

    public int getIdtailieu() {
        return idtailieu;
    }

    public LocalDateTime getTghoatdong() {
        return tghoatdong;
    }

    public String getLoaihoatdong() {
        return loaihoatdong;
    }

    public void setUidlichsu(int uidlichsu) {
        this.uidlichsu = uidlichsu;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setIdtailieu(int idtailieu) {
        this.idtailieu = idtailieu;
    }

    public void setTghoatdong(LocalDateTime tghoatdong) {
        this.tghoatdong = tghoatdong;
    }

    public void setLoaihoatdong(String loaihoatdong) {
        this.loaihoatdong = loaihoatdong;
    }
}
