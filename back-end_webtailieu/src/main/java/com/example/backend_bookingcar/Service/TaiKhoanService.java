package com.example.backend_bookingcar.Service;

import com.example.backend_bookingcar.DTO.TaiKhoanDTO;
import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.TaiKhoan;
import com.example.backend_bookingcar.Model.User;

import java.util.List;

public interface TaiKhoanService {
    TaiKhoan save(TaiKhoanDTO taikhoanDTO);
    //Boolean checkPasswordUser(String email,String password);
    //Boolean checkUserByEmail(String email);
    //Boolean checkUserByLogin(String login);
    //User getUserByEmail(String email);
    //User getUserByLogin(String login);
    Boolean checktaikhoanByLogin(String login);
    List<TaiKhoan> getAllTaiKhoan();
    //TaiKhoan getTaiKhoanByLogin(String login);
    //User updateUser(UserDTO user, int id);
    //String deleteUser(int id);
    TaiKhoan getTaiKhoanById(int id);
    TaiKhoan updateTaiKhoan(TaiKhoanDTO taikhoan, int id);
    String deleteTaiKhoan(int id);
    String deleteTaiKhoanLogin(String Login);
    TaiKhoan getTaiKhoanByLogin(String login);
    int findUidByLogin(String login);
}
