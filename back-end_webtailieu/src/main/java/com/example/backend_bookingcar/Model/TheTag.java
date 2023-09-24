package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "THETAG")
public class TheTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTheTag")
    private int uidThe;

    @Column(name = "TenThe")
    private String tenthe;

    public TheTag(){

    }
    public TheTag(int uidThe,String tenthe){
        this.uidThe = uidThe;
        this.tenthe = tenthe;
    }
    public TheTag(String tenthe){
        this.tenthe = tenthe;
    }

    public int getUidThe() {
        return uidThe;
    }

    public String getTenthe() {
        return tenthe;
    }

    public void setUidThe(int uidThe) {
        this.uidThe = uidThe;
    }

    public void setTenthe(String tenthe) {
        this.tenthe = tenthe;
    }
}
