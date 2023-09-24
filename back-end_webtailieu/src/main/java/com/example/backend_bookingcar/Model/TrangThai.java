package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "TRANGTHAI")
public class TrangThai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private int uid;
    @Column(name = "matt")
    private String matt;

    @Column(name = "tentt")
    private String tentt;

    public TrangThai(){

    }

    public TrangThai(int uid, String matt,String tentt){
        this.uid = uid;
        this.matt = matt;
        this.tentt = tentt;
    }

    public TrangThai(String matt, String tentt){
        this.matt = matt;
        this.tentt = tentt;
    }

    public int getUid() {
        return uid;
    }

    public String getMatt() {
        return matt;
    }

    public String getTentt() {
        return tentt;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setMatt(String matt) {
        this.matt = matt;
    }

    public void setTentt(String tentt) {
        this.tentt = tentt;
    }
}
