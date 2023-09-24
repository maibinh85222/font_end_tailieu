package com.example.backend_bookingcar.Repository;

import com.example.backend_bookingcar.Model.LichSuHoatDong;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Service.LichSuService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LichSuRepository extends JpaRepository<LichSuHoatDong, Integer> {
    List<LichSuHoatDong> findByidtailieu(int idtailieu);
    List<LichSuHoatDong> findByiduser(int iduser);
}
