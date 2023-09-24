package com.example.backend_bookingcar.DTO;

import java.time.LocalDateTime;

public class PhienDTO {
    private int uidphien;
    private int uiduser;
    private LocalDateTime tgbatdau;
    private LocalDateTime tgketthuc;

    public PhienDTO(){

    }
    public PhienDTO(int uidphien, int uiduser, LocalDateTime tgbatdau, LocalDateTime tgkethuc){
        this.uidphien = uidphien;
        this.uiduser = uiduser;
        this.tgbatdau = tgbatdau;
        this.tgketthuc = tgkethuc;
    }
    public PhienDTO(int uiduser, LocalDateTime tgbatdau, LocalDateTime tgkethuc){
        this.uiduser = uiduser;
        this.tgbatdau = tgbatdau;
        this.tgketthuc = tgkethuc;
    }

    public int getUidphien() {
        return uidphien;
    }

    public int getUiduser() {
        return uiduser;
    }

    public LocalDateTime getTgbatdau() {
        return tgbatdau;
    }

    public LocalDateTime getTgketthuc() {
        return tgketthuc;
    }

    public void setUidphien(int uidphien) {
        this.uidphien = uidphien;
    }

    public void setUiduser(int uiduser) {
        this.uiduser = uiduser;
    }

    public void setTgbatdau(LocalDateTime tgbatdau) {
        this.tgbatdau = tgbatdau;
    }

    public void setTgketthuc(LocalDateTime tgketthuc) {
        this.tgketthuc = tgketthuc;
    }
}
