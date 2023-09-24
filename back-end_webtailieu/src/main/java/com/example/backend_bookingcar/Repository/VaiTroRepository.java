package com.example.backend_bookingcar.Repository;

import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Model.VaiTro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@EnableJpaRepositories
@Repository
public interface VaiTroRepository extends JpaRepository<VaiTro, Integer> {
    VaiTro getVaiTroByMavtro(String mavtro);
    VaiTro findVaiTroByMavtro(String mavtro);
}
