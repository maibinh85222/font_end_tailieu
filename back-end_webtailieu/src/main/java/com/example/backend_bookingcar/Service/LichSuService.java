package com.example.backend_bookingcar.Service;

import com.example.backend_bookingcar.DTO.LichSuHoatDongDTO;
import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.LichSuHoatDong;
import com.example.backend_bookingcar.Model.User;

import java.util.List;

public interface LichSuService {
    LichSuHoatDong save(LichSuHoatDongDTO lichSuHoatDongDTO);
    List<LichSuHoatDong> getAllLichSu();
    LichSuHoatDong getLichSuById(int id);
    LichSuHoatDong updateLichSu(LichSuHoatDongDTO lichSuHoatDongDTO, int id);
    String deleteLichSu(int id);

}
