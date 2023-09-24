package com.example.backend_bookingcar.Service;

import com.example.backend_bookingcar.DTO.BinhLuanDTO;
import com.example.backend_bookingcar.DTO.VaiTroDTO;
import com.example.backend_bookingcar.Model.BinhLuan;
import com.example.backend_bookingcar.Model.VaiTro;

import java.util.List;

public interface BinhLuanService {
    BinhLuan save(BinhLuanDTO binhLuanDTO);
    //Boolean checkVaiTroByMaVtro(String mavtro);
    List<BinhLuan> getAllBinhLuan();
    BinhLuan getBinhLuanById(int id);
    BinhLuan updateBinhLuan(BinhLuanDTO binhLuanDTO, int id);
    String deleteBinhLuan(int id);
    String deleteBinhLuanByTailieuId(int idtailieu);
    //int findUidByLogin(String mavtro);
}
