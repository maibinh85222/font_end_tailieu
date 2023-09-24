package com.example.backend_bookingcar.Repository;

import com.example.backend_bookingcar.Model.CT_TaiLieu;
import com.example.backend_bookingcar.Model.LichSuHoatDong;
import com.example.backend_bookingcar.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface CTTaiLieuRepository extends JpaRepository<CT_TaiLieu, Integer> {
    List<CT_TaiLieu> findByidtailieu(int idtailieu);
    List<CT_TaiLieu> findByidthe(int idthe);
}
