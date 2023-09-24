package com.example.backend_bookingcar.Service;

import com.example.backend_bookingcar.DTO.PhienDTO;
import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.PhienLamViec;
import com.example.backend_bookingcar.Model.User;

import java.util.List;

public interface PhienService {
    PhienLamViec save(PhienDTO phienDTO);
    List<PhienLamViec> getAllPhien();
    PhienLamViec getPhienById(int id);
}
