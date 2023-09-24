package com.example.backend_bookingcar.Service;

import com.example.backend_bookingcar.DTO.TaiKhoanDTO;
import com.example.backend_bookingcar.DTO.TrangThaiDTO;
import com.example.backend_bookingcar.Model.TaiKhoan;
import com.example.backend_bookingcar.Model.TrangThai;

import java.util.List;

public interface TrangThaiService {
    TrangThai save(TrangThaiDTO trangthaiDTO);
    List<TrangThai> getAllTrangThai();
    TrangThai getTrangThaiById(int id);
    TrangThai updateTrangThai(TrangThaiDTO trangthai, int id);
    String deleteTrangThai(int id);
    Boolean checkTrangThaiByMatt(String matt);
    int findUidByMatt(String matt);
}
