package com.example.backend_bookingcar.DTO;


import jakarta.persistence.*;

public class UserDTO {

    private int uid;

    private String fullname;
    private String email;
    private String address;
    private String login;
    public UserDTO() {
    }

    public UserDTO(int uid, String fullname, String phonenumber, String email, String password, String address, String role, String login) {
        this.uid = uid;
        this.fullname = fullname;
        //this.phonenumber = phonenumber;
        this.email = email;
        //this.password = password;
        this.address = address;
        //this.role = role;
        this.login = login;
    }

    public UserDTO(String fullname, String phonenumber, String email, String password, String address, String role, String login) {
        this.fullname = fullname;
        //this.phonenumber = phonenumber;
        this.email = email;
        //this.password = password;
        this.address = address;
        //this.role = role;
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


