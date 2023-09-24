package com.example.backend_bookingcar.Repository;

import com.example.backend_bookingcar.Model.LichSuHoatDong;
import com.example.backend_bookingcar.Model.ThuMuc;
import com.example.backend_bookingcar.Model.TrangThai;
import com.example.backend_bookingcar.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@EnableJpaRepositories
@Repository
public interface ThuMucRepository extends JpaRepository<ThuMuc, Integer> {

}
