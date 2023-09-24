//package com.example.backend_bookingcar.Model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "TAIKHOAN")
//public class TaiKhoan {
//    //­	TAIKHOAN(Login,Pass,MaVTro,MaTT)
//
//    @Column(name = "Login")
//    private String Login;
//    //    @Column(name = "phonenumber")
////    private String phonenumber;
//    @Column(name = "Pass")
//    private String Pass;
//    //    @Column(name = "password")
////    private String password;
//    @Column(name = "MaVTro")
//    private String MaVTro;
////    @Column(name = "role")
////    private String role;
//
//    @Column(name = "MaTT")
//    private String MaTT;
//
//    public TaiKhoan() {
//    }
//    //­	TAIKHOAN(Login,Pass,MaVTro,MaTT)
//    public TaiKhoan(String Login, String Pass, String MaVTro, String MaTT) {
//        this.Login = Login;
//        this.Pass = Pass;
//        //this.phonenumber = phonenumber;
//        this.MaVTro = MaVTro;
//        //this.password = password;
//        this.MaTT = MaTT;
//        //this.login = login;
//        //this.role = role;
//    }
//    //­	TAIKHOAN(Login,Pass,MaVTro,MaTT)
//
//    public String getLogin() {
//        return Login;
//    }
//
//    public void setLogin(String Login) {
//        this.Login = Login;
//    }
//
////    public String getPhonenumber() {
////        return phonenumber;
////    }
//
////    public void setPhonenumber(String phonenumber) {
////        this.phonenumber = phonenumber;
////    }
//
//    public String getPass() {
//        return Pass;
//    }
//
//    public void setPass(String Pass) {
//        this.Pass = Pass;
//    }
//
////    public String getPassword() {
////        return password;
////    }
//
////    public void setPassword(String password) {
////        this.password = password;
////    }
//
//    public String getMaVTro() {
//        return MaVTro;
//    }
//
//    public void setMaVTro(String MaVTro) {
//        this.MaVTro = MaVTro;
//    }
//
//    public String getMaTT() {
//        return MaTT;
//    }
//
//    public void setMaTT(String MaTT) {
//        this.MaTT = MaTT;
//    }
//
////    public String getRole() {
////        return role;
////    }
//
////    public void setRole(String role) {
////        this.role = role;
////    }
//}
package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "TAIKHOAN")
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private int uid;

    @Column(name = "login")
    private String login; //fullname
    //    @Column(name = "phonenumber")
//    private String phonenumber;
//    @Column(name = "Gmail")
//    private String email;
    //    @Column(name = "password")
//    private String password;
    @Column(name = "pass")
    private String pass; //address
    @Column(name = "mavtro")
    private String mavtro; //role

    @Column(name = "matt")
    private String matt; //login

    public TaiKhoan() {
    }

    public TaiKhoan(int uid, String Login,  String Pass,  String MaVTro, String MaTT) {
        this.uid = uid;
        this.login = Login;
        //this.phonenumber = phonenumber;
        //this.email = email;
        //this.password = password;
        this.pass = Pass;
        this.mavtro = MaVTro;
        this.matt = MaTT;
    }

    public TaiKhoan(String Login,  String Pass,  String MaVTro, String MaTT) {
        this.login = Login;
        //this.phonenumber = phonenumber;
        //this.email = email;
        //this.password = password;
        this.pass = Pass;
        //this.role = role;
        this.mavtro = MaVTro;
        this.matt = MaTT;
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

    public void setlogin(String fullname) {
        this.login = fullname;
    }

//    public String getPhonenumber() {
//        return phonenumber;
//    }

//    public void setPhonenumber(String phonenumber) {
//        this.phonenumber = phonenumber;
//    }

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

//    public String getPassword() {
//        return password;
//    }

//    public void setPassword(String password) {
//        this.password = password;
//    }

    public String getPass() {
        return pass;
    }

    public void setPass(String Pass) {
        this.pass = Pass;
    }

    public String getMaTT() {
        return matt;
    }

    public void setMaTT(String MaTT) {
        this.matt = MaTT;
    }

    public String getMaVTro() {
        return mavtro;
    }

    public void setMaVTro(String role) {
        this.mavtro = role;
    }
}



