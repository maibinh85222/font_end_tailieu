package com.example.backend_bookingcar.Service;

import com.example.backend_bookingcar.DTO.TaiLieuDTO;
import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.TaiLieu;
import com.example.backend_bookingcar.Model.User;

import java.util.List;

public interface TaiLieuService {
    TaiLieu save(TaiLieuDTO tailieuDTO);
    List<TaiLieu> getAllTaiLieu();
    TaiLieu getTaiLieuById(int id);
    TaiLieu updateTaiLieu(TaiLieuDTO tailieuDTO, int id);
    String deleteTaiLieu(int id);
}
