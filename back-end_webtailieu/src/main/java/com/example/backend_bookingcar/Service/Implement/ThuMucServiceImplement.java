package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.DTO.ThuMucDTO;
import com.example.backend_bookingcar.Exception.ThuMucNotFoundException;
import com.example.backend_bookingcar.Exception.UserNotFoundException;
import com.example.backend_bookingcar.Model.ThuMuc;
import com.example.backend_bookingcar.Model.TrangThai;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.ThuMucRepository;
import com.example.backend_bookingcar.Repository.TrangThaiRepository;
import com.example.backend_bookingcar.Service.ThuMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThuMucServiceImplement implements ThuMucService {

    @Autowired
    private ThuMucRepository thuMucRepository;
    @Override
    public ThuMuc save(ThuMucDTO thuMucDTO) {

        ThuMuc thuMuc = new ThuMuc(thuMucDTO.getDuongdan(),
                thuMucDTO.getTenthumuc());
        return thuMucRepository.save(thuMuc);
    }



//    @Override
//    public Boolean checkThuMucByDuongDan(String duongdan) {
//        ThuMuc thumuc = thuMucRepository.findTrangThaiByMatt(duongdan);
//        if(thumuc == null) return false;
//        return true;
//    }

//    @Override
//    public Boolean checkThuMucByDuongDan(String duongdan) {
//
//        ThuMuc thumuc = thuMucRepository.findThuMucByDuongDan(duongdan);
//        if(thumuc == null) return false;
//        return true;
//    }

    @Override
    public List<ThuMuc> getAllThuMuc() {

        return thuMucRepository.findAll();
    }

    @Override
    public ThuMuc getThuMucById(int id) {
        return thuMucRepository.findById(id).orElseThrow(()-> new ThuMucNotFoundException(id));
    }

    @Override
    public ThuMuc updateUser(ThuMucDTO thuMucDTO, int id) {

        return thuMucRepository.findById(id).map(
                thumuc->{
                    thumuc.setDuongdan(thuMucDTO.getDuongdan());
                    //user.setPhonenumber(newUser.getPhonenumber());
                    //user.setEmail(newUser.getEmail());
                    //user.setPassword(newUser.getPassword());
                    thumuc.setTenthumuc(thuMucDTO.getTenthumuc());
                    //user.setRole(newUser.getRole());
                    return thuMucRepository.save(thumuc);
                }
        ).orElseThrow(()->new ThuMucNotFoundException(id));
    }

    @Override
    public String deleteThuMuc(int id) {

        if(!thuMucRepository.existsById(id)){
            throw new ThuMucNotFoundException(id);
        }
        thuMucRepository.deleteById(id);
        return "Delete Sucessfull";
    }

    @Override
    public int findUidByDuongDan(String duongdan) {
        Optional<ThuMuc> userOptional = thuMucRepository.findAll().stream()
                .filter(thumuc -> thumuc.getDuongdan().equals(duongdan))
                .findFirst();

        return userOptional.map(ThuMuc::getUidThucMuc).orElse(null);
    }
}
