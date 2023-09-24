package com.example.backend_bookingcar.DTO;

import java.time.LocalDateTime;

public class PhienBanDTO {
    private int uidphienban;
    private int idtailieu;
    private int iduser;
    private LocalDateTime tg;
    private String mota;

    public PhienBanDTO(){

    }
    public PhienBanDTO(int uidphienban, int idtailieu, int iduser, LocalDateTime tg, String mota){
        this.uidphienban = uidphienban;
        this.idtailieu = idtailieu;
        this.iduser = iduser;
        this.tg = tg;
        this.mota = mota;
    }
    public PhienBanDTO(int idtailieu, int iduser, LocalDateTime tg, String mota){
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
