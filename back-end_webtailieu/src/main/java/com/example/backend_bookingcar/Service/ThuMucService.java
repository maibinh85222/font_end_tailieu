package com.example.backend_bookingcar.Service;

import com.example.backend_bookingcar.DTO.ThuMucDTO;
import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.ThuMuc;
import com.example.backend_bookingcar.Model.User;

import java.util.List;

public interface ThuMucService {
    ThuMuc save(ThuMucDTO thuMucDTO);
    //Boolean checkPasswordUser(String email,String password);
    //Boolean checkThuMucByDuongDan(String duongdan);

    List<ThuMuc> getAllThuMuc();
    ThuMuc getThuMucById(int id);
    ThuMuc updateUser(ThuMucDTO thuMucDTO, int id);
    String deleteThuMuc(int id);
    int findUidByDuongDan(String duongdan);
}
