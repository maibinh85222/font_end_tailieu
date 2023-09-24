package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.DTO.TrangThaiDTO;
import com.example.backend_bookingcar.Exception.TaiKhoanNotFoundException;
import com.example.backend_bookingcar.Exception.TrangThaiNotFoundException;
import com.example.backend_bookingcar.Model.TaiKhoan;
import com.example.backend_bookingcar.Model.TrangThai;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.TaiKhoanRepository;
import com.example.backend_bookingcar.Repository.TrangThaiRepository;
import com.example.backend_bookingcar.Service.TrangThaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrangThaiServiceImplement implements TrangThaiService {

    @Autowired
    private TrangThaiRepository trangthaiRepository;
    @Override
    public TrangThai save(TrangThaiDTO trangthaiDTO) {

        TrangThai trangthai = new TrangThai(trangthaiDTO.getMatt(),
                trangthaiDTO.getTentt());
        return trangthaiRepository.save(trangthai);
    }

    @Override
    public List<TrangThai> getAllTrangThai() {

        return trangthaiRepository.findAll();
    }

    @Override
    public TrangThai getTrangThaiById(int id) {

        return trangthaiRepository.findById(id).orElseThrow(()-> new TrangThaiNotFoundException(id));
    }

    @Override
    public TrangThai updateTrangThai(TrangThaiDTO newtrangthai, int id) {

        return trangthaiRepository.findById(id).map(
                trangThai->{
                    trangThai.setMatt(newtrangthai.getMatt());
                    //user.setPhonenumber(newUser.getPhonenumber());
                    //user.setEmail(newUser.getEmail());
                    //user.setPassword(newUser.getPassword());
                    trangThai.setTentt(newtrangthai.getTentt());

                    return trangthaiRepository.save(trangThai);
                }
        ).orElseThrow(()->new TrangThaiNotFoundException(id));
    }

    @Override
    public String deleteTrangThai(int id) {

        if (!trangthaiRepository.existsById(id)) {
            throw new TrangThaiNotFoundException(id);
        }
        trangthaiRepository.deleteById(id);
        return "Delete Sucessfull";
    }

    @Override
    public Boolean checkTrangThaiByMatt(String matt) {
        TrangThai trangthai = trangthaiRepository.findTrangThaiByMatt(matt);
        if(trangthai == null) return false;
        return true;
    }


    @Override
    public int findUidByMatt(String matt) {

        Optional<TrangThai> userOptional = trangthaiRepository.findAll().stream()
                .filter(trangthai -> trangthai.getMatt().equals(matt))
                .findFirst();

        return userOptional.map(TrangThai::getUid).orElse(null);
    }
}
