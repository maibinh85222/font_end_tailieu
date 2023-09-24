package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "THUMUC")
public class ThuMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdThuMuc")
    private int uidThucMuc;

    @Column(name = "DuongDan")
    private String duongdan;
    //    @Column(name = "phonenumber")
//    private String phonenumber;
    @Column(name = "TenThuMuc")
    private String tenthumuc;

    public ThuMuc(){

    }
    public ThuMuc(int uidThucMuc, String duongdan, String tenthumuc){
        this.uidThucMuc = uidThucMuc;
        this.duongdan = duongdan;
        this.tenthumuc = tenthumuc;
    }
    public ThuMuc(String duongdan, String tenthumuc){
        this.duongdan = duongdan;
        this.tenthumuc = tenthumuc;
    }

    public int getUidThucMuc() {
        return uidThucMuc;
    }


    public String getDuongdan() {
        return duongdan;
    }

    public String getTenthumuc() {
        return tenthumuc;
    }

    public void setUidThucMuc(int uidThucMuc) {
        this.uidThucMuc = uidThucMuc;
    }

    public void setDuongdan(String duongdan) {
        this.duongdan = duongdan;
    }

    public void setTenthumuc(String tenthumuc) {
        this.tenthumuc = tenthumuc;
    }
}
