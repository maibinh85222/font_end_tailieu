package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "NGUOIDUNG")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUser")
    private int uid;

    @Column(name = "Ten")
    private String fullname;

    @Column(name = "Gmail")
    private String email;

    @Column(name = "DiaChi")
    private String address;


    @Column(name = "Login")
    private String login;

    public User() {
    }

    public User(int uid, String fullname,  String email,  String address, String login) {
        this.uid = uid;
        this.fullname = fullname;
        //this.phonenumber = phonenumber;
        this.email = email;
        //this.password = password;
        this.address = address;
        this.login = login;
        //this.role = role;
    }

    public User(String fullname,  String email,  String address, String login) {
        this.fullname = fullname;
        //this.phonenumber = phonenumber;
        this.email = email;
        //this.password = password;
        this.address = address;
        //this.role = role;
        this.address = address;
        this.login = login;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}


