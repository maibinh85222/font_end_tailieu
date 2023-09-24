package com.example.backend_bookingcar.Repository;

import com.example.backend_bookingcar.Model.PhienLamViec;
import com.example.backend_bookingcar.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhienRepository extends JpaRepository<PhienLamViec, Integer> {

}
