package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "PHIENLAMVIEC")
public class PhienLamViec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPhien")
    private int uidphien;
    @Column(name = "IdUser")
    private int uiduser;
    @Column(name = "TgBatDau")
    private LocalDateTime tgbatdau;
    @Column(name = "TgKetThuc")
    private LocalDateTime tgketthuc;

    public PhienLamViec(){

    }
    public PhienLamViec(int uidphien, int uiduser, LocalDateTime tgbatdau, LocalDateTime tgketthuc){
        this.uidphien = uidphien;
        this.uiduser = uiduser;
        this.tgbatdau = tgbatdau;
        this.tgketthuc = tgketthuc;
    }
    public PhienLamViec(int uiduser, LocalDateTime tgbatdau, LocalDateTime tgketthuc){
        this.uiduser = uiduser;
        this.tgbatdau = tgbatdau;
        this.tgketthuc = tgketthuc;
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
