package com.example.backend_bookingcar.Repository;

import com.example.backend_bookingcar.Model.TheTag;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Service.TheTagService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface TheTagRepository extends JpaRepository<TheTag, Integer> {

}
