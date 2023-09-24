package com.example.backend_bookingcar.Repository;


import com.example.backend_bookingcar.Model.TaiKhoan;
import com.example.backend_bookingcar.Model.TrangThai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface TrangThaiRepository extends JpaRepository<TrangThai, Integer> {
    TrangThai getTrangThaiByMatt(String matt);
    TrangThai findTrangThaiByMatt(String matt);
}
