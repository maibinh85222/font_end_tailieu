package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.DTO.CT_TaiLieuDTO;
import com.example.backend_bookingcar.Exception.UserNotFoundException;
import com.example.backend_bookingcar.Model.CT_TaiLieu;
import com.example.backend_bookingcar.Model.TaiKhoan;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.CTTaiLieuRepository;
import com.example.backend_bookingcar.Repository.UserRepository;
import com.example.backend_bookingcar.Service.CT_TaiLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CT_TaiLieuServiceImplement implements CT_TaiLieuService {
    @Autowired
    private CTTaiLieuRepository ctTaiLieuRepository;

    @Override
    public CT_TaiLieu save(CT_TaiLieuDTO ctTaiLieuDTO) {
        CT_TaiLieu ctTaiLieu = new CT_TaiLieu(ctTaiLieuDTO.getIdthe(),
                ctTaiLieuDTO.getIdtailieu(), ctTaiLieuDTO.getMota());
        return ctTaiLieuRepository.save(ctTaiLieu);
    }

    @Override
    public List<CT_TaiLieu> getAllCtTaiLieu() {
        return ctTaiLieuRepository.findAll();
    }

    @Override
    public CT_TaiLieu getCtTaiLieuById(int id) {
        return ctTaiLieuRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }

    @Override
    public CT_TaiLieu updateCtTaiLieu(CT_TaiLieuDTO newUser, int id) {
        return ctTaiLieuRepository.findById(id).map(
                user->{
                    user.setIdthe(newUser.getIdthe());
                    //user.setPhonenumber(newUser.getPhonenumber());
                    //user.setEmail(newUser.getEmail());
                    user.setIdtailieu(newUser.getIdtailieu());
                    user.setMota(newUser.getMota());
                    //user.setRole(newUser.getRole());
                    return ctTaiLieuRepository.save(user);
                }
        ).orElseThrow(()->new UserNotFoundException(id));
    }

    @Override
    public String deleteCTByTailieuId(int idtailieu) {
        List<CT_TaiLieu> ct_taiLieuList = ctTaiLieuRepository.findByidtailieu(idtailieu);
        if (ct_taiLieuList.isEmpty()) {
            return "Không có chi tiết nào liên quan đến tài liệu này.";
        }

        for (CT_TaiLieu ctTaiLieu : ct_taiLieuList) {
            ctTaiLieuRepository.deleteById(ctTaiLieu.getUidct());
        }

        return "Đã xóa toàn bộ cho tiết liên quan đến tài liệu.";
    }

    @Override
    public String deleteCtTaiLieu(int id) {
        if(!ctTaiLieuRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        ctTaiLieuRepository.deleteById(id);
        return "Delete Sucessfull";
    }
}

