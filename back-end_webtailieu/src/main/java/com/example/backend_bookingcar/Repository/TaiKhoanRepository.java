package com.example.backend_bookingcar.Repository;

import com.example.backend_bookingcar.Model.TaiKhoan;
import com.example.backend_bookingcar.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, Integer> {
////    TaiKhoan getUserByEmail(String email);
////    TaiKhoan findUserByEmail(String email);
//
    TaiKhoan getTaiKhoanByLogin(String login);
    TaiKhoan findTaiKhoanByLogin(String Login);
}
