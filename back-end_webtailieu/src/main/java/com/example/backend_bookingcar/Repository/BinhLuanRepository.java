package com.example.backend_bookingcar.Repository;

import com.example.backend_bookingcar.Model.BinhLuan;
import com.example.backend_bookingcar.Model.LichSuHoatDong;
import com.example.backend_bookingcar.Model.TrangThai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface BinhLuanRepository extends JpaRepository<BinhLuan, Integer> {
    List<BinhLuan> findByidtailieu(int idtailieu);
    List<BinhLuan> findByiduser(int iduser);
}
