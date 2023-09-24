package com.example.backend_bookingcar.DTO;

public class TaiKhoanDTO{

    //­	TAIKHOAN(Login,Pass,MaVTro,MaTT)
    private int uid;
    private String login;
    private String pass;
    // private String phonenumber;
    private String mavtro;
    // private String password;
    private String matt;
    //  private String role;
   // private String login;
    public TaiKhoanDTO() {
    }

    //­	TAIKHOAN(Login,Pass,MaVTro,MaTT)
    public TaiKhoanDTO(int uid, String login, String pass, String mavtro, String matt) {
        this.uid = uid;
        this.login = login;
        //this.phonenumber = phonenumber;
        this.pass = pass;
        //this.password = password;
        this.mavtro = mavtro;
        //this.role = role;
        this.matt = matt;
    }

    public TaiKhoanDTO(String login, String pass, String mavtro, String matt) {
        this.login = login;
        //this.phonenumber = phonenumber;
        this.pass = pass;
        //this.password = password;
        this.mavtro = mavtro;
        //this.role = role;
        this.matt = matt;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getlogin() {
        return login;
    }

    public void setlogin(String login) {
        this.login = login;
    }

//    public String getPhonenumber() {
//        return phonenumber;
//    }
//
//    public void setPhonenumber(String phonenumber) {
//        this.phonenumber = phonenumber;
//    }

    public String getpass() {
        return pass;
    }

    public void setpass(String pass) {
        this.pass = pass;
    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }



    //    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }

    public String getMavtro() {
        return mavtro;
    }

    public String getMatt() {
        return matt;
    }

    public void setMavtro(String mavtro) {
        this.mavtro = mavtro;
    }

    public void setMatt(String matt) {
        this.matt = matt;
    }
}
