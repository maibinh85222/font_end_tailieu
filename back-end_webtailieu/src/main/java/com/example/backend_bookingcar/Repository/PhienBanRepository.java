package com.example.backend_bookingcar.Repository;

import com.example.backend_bookingcar.Model.LichSuHoatDong;
import com.example.backend_bookingcar.Model.PhienBan;
import com.example.backend_bookingcar.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface PhienBanRepository extends JpaRepository<PhienBan, Integer> {
    List<PhienBan> findByidtailieu(int idtailieu);
    List<PhienBan> findByiduser(int iduser);
}
