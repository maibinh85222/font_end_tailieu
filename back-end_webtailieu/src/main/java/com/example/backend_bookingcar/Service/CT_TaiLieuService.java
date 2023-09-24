package com.example.backend_bookingcar.Service;

import com.example.backend_bookingcar.DTO.CT_TaiLieuDTO;
import com.example.backend_bookingcar.DTO.LichSuHoatDongDTO;
import com.example.backend_bookingcar.Model.CT_TaiLieu;
import com.example.backend_bookingcar.Model.LichSuHoatDong;

import java.util.List;

public interface CT_TaiLieuService {
    CT_TaiLieu save(CT_TaiLieuDTO ctTaiLieuDTO);
    List<CT_TaiLieu> getAllCtTaiLieu();
    CT_TaiLieu getCtTaiLieuById(int id);
    CT_TaiLieu updateCtTaiLieu(CT_TaiLieuDTO ctTaiLieuDTO, int id);
    String deleteCTByTailieuId(int idtailieu);
    String deleteCtTaiLieu(int id);
}
