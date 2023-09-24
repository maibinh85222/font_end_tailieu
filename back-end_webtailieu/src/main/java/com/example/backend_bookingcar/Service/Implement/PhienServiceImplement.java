package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.DTO.PhienDTO;
import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Exception.PhienNotFoundException;
import com.example.backend_bookingcar.Exception.UserNotFoundException;
import com.example.backend_bookingcar.Model.PhienLamViec;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.PhienRepository;
import com.example.backend_bookingcar.Repository.UserRepository;
import com.example.backend_bookingcar.Service.PhienService;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhienServiceImplement implements PhienService {
    @Autowired
    private PhienRepository phienRepository;

    @Override
    public PhienLamViec save(PhienDTO phienDTO) {
        PhienLamViec phien = new PhienLamViec(phienDTO.getUiduser(),
                phienDTO.getTgbatdau(), phienDTO.getTgketthuc());
        return phienRepository.save(phien);
    }

    @Override
    public List<PhienLamViec> getAllPhien() {
        return phienRepository.findAll();
    }

    @Override
    public PhienLamViec getPhienById(int id) {
        return phienRepository.findById(id).orElseThrow(()-> new PhienNotFoundException(id));
    }
}
