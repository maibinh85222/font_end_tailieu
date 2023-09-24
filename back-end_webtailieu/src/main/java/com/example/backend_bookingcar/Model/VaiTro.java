package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "VAITRO")
public class VaiTro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdVaiTro")
    private int uidvaitro;

    @Column(name = "MaVTro")
    private String mavtro;

    @Column(name = "TenVTro")
    private String tenvtro;

    @Column(name = "MoTa")
    private String mota;

    public VaiTro(){

    }
    public VaiTro(int uid, String mavtro, String tenvtro, String mota){
        this.uidvaitro = uid;
        this.mavtro = mavtro;
        this.tenvtro = tenvtro;
        this.mota = mota;
    }
    public VaiTro(String mavtro, String tenvtro, String mota){
        this.mavtro = mavtro;
        this.tenvtro = tenvtro;
        this.mota = mota;
    }

    public int getUidvaitro() {
        return uidvaitro;
    }

    public String getMavtro() {
        return mavtro;
    }

    public String getTenvtro() {
        return tenvtro;
    }

    public String getMota() {
        return mota;
    }

    public void setUidvaitro(int uidvaitro) {
        this.uidvaitro = uidvaitro;
    }

    public void setMavtro(String mavtro) {
        this.mavtro = mavtro;
    }

    public void setTenvtro(String tenvtro) {
        this.tenvtro = tenvtro;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
