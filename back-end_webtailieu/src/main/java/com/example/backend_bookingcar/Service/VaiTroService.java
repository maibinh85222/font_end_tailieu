package com.example.backend_bookingcar.Service;

import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.DTO.VaiTroDTO;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Model.VaiTro;

import java.util.List;

public interface VaiTroService {
    VaiTro save(VaiTroDTO vaiTroDTO);
    Boolean checkVaiTroByMaVtro(String mavtro);
    List<VaiTro> getAllVaiTro();
    VaiTro getVaiTroById(int id);
    VaiTro updateVaiTro(VaiTroDTO vaiTroDTO, int id);
    String deleteVaiTro(int id);
    int findUidByLogin(String mavtro);
}
