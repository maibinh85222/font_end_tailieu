package com.example.backend_bookingcar.DTO;

import java.time.LocalDateTime;

public class BinhLuanDTO {
    private int uidbinhluan;
    private int uidtailieu;
    private int uiduser;
    private LocalDateTime tg;
    private String noidung;

    public BinhLuanDTO(){

    }
    public BinhLuanDTO(int uidbinhluan,int uidtailieu, int uiduser, LocalDateTime tg, String noidung){
        this.uidbinhluan = uidbinhluan;
        this.uidtailieu = uidtailieu;
        this.uiduser = uiduser;
        this.tg = tg;
        this.noidung = noidung;
    }
    public BinhLuanDTO(int uidtailieu, int uiduser, LocalDateTime tg, String noidung){
        this.uidtailieu = uidtailieu;
        this.uiduser = uiduser;
        this.tg = tg;
        this.noidung = noidung;
    }

    public int getUidbinhluan() {
        return uidbinhluan;
    }

    public int getUidtailieu() {
        return uidtailieu;
    }

    public int getUiduser() {
        return uiduser;
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

    public void setUidtailieu(int uidtailieu) {
        this.uidtailieu = uidtailieu;
    }

    public void setUiduser(int uiduser) {
        this.uiduser = uiduser;
    }

    public void setTg(LocalDateTime tg) {
        this.tg = tg;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}
