package com.example.backend_bookingcar.Service;

import com.example.backend_bookingcar.DTO.LichSuHoatDongDTO;
import com.example.backend_bookingcar.DTO.PhienBanDTO;
import com.example.backend_bookingcar.Model.LichSuHoatDong;
import com.example.backend_bookingcar.Model.PhienBan;

import java.util.List;

public interface PhienBanService {
    PhienBan save(PhienBanDTO phienBanDTO);
    List<PhienBan> getAllPhienBan();
    PhienBan getPhienBanById(int id);
    PhienBan updatePhienBan(PhienBanDTO phienBanDTO, int id);
    String deletePhienBan(int id);
    String deleteVSByTailieuId(int idtailieu);
}
