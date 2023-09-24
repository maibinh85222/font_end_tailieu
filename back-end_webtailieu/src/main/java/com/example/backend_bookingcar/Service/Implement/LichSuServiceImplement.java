package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.DTO.LichSuHoatDongDTO;
import com.example.backend_bookingcar.Exception.LichSuNotFoundException;
import com.example.backend_bookingcar.Exception.UserNotFoundException;
import com.example.backend_bookingcar.Model.LichSuHoatDong;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.LichSuRepository;
import com.example.backend_bookingcar.Repository.UserRepository;
import com.example.backend_bookingcar.Service.LichSuService;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LichSuServiceImplement implements LichSuService {
    @Autowired
    private LichSuRepository lichSuRepository;

    @Override
    public LichSuHoatDong save(LichSuHoatDongDTO lichSuHoatDongDTO) {
        LichSuHoatDong lichSuHoatDong = new LichSuHoatDong(lichSuHoatDongDTO.getIduser(),
                lichSuHoatDongDTO.getTghoatdong(), lichSuHoatDongDTO.getIdtailieu(), lichSuHoatDongDTO.getLoaihoatdong());
        return lichSuRepository.save(lichSuHoatDong);
    }

    @Override
    public List<LichSuHoatDong> getAllLichSu() {
        return lichSuRepository.findAll();
    }

    @Override
    public LichSuHoatDong getLichSuById(int id) {
        return lichSuRepository.findById(id).orElseThrow(()-> new LichSuNotFoundException(id));
    }

    @Override
    public LichSuHoatDong updateLichSu(LichSuHoatDongDTO lichSuHoatDongDTO, int id) {
        return lichSuRepository.findById(id).map(
                lichsu->{
                    lichsu.setIduser(lichSuHoatDongDTO.getIduser());
                    //user.setPhonenumber(newUser.getPhonenumber());
                    //user.setEmail(newUser.getEmail());
                    lichsu.setTghoatdong(lichSuHoatDongDTO.getTghoatdong());
                    lichsu.setIdtailieu(lichSuHoatDongDTO.getIdtailieu());
                    lichsu.setLoaihoatdong(lichSuHoatDongDTO.getLoaihoatdong());
                    return lichSuRepository.save(lichsu);
                }
        ).orElseThrow(()->new LichSuNotFoundException(id));
    }

    @Override
    public String deleteLichSu(int id) {
        if(!lichSuRepository.existsById(id)){
            throw new LichSuNotFoundException(id);
        }
        lichSuRepository.deleteById(id);
        return "Delete Sucessfull";
    }
}
