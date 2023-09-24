package com.example.backend_bookingcar.Repository;

import com.example.backend_bookingcar.Model.TaiLieu;
import com.example.backend_bookingcar.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface TaiLieuRepository extends JpaRepository<TaiLieu, Integer> {

}
