package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.DTO.PhienBanDTO;
import com.example.backend_bookingcar.Exception.LichSuNotFoundException;
import com.example.backend_bookingcar.Exception.UserNotFoundException;
import com.example.backend_bookingcar.Model.BinhLuan;
import com.example.backend_bookingcar.Model.PhienBan;
import com.example.backend_bookingcar.Repository.BinhLuanRepository;
import com.example.backend_bookingcar.Repository.PhienBanRepository;
import com.example.backend_bookingcar.Service.PhienBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhienBanServiceImplement implements PhienBanService {
    @Autowired
    private PhienBanRepository phienBanRepository;

    @Override
    public PhienBan save(PhienBanDTO phienBanDTO) {
        PhienBan phienBan = new PhienBan(phienBanDTO.getIdtailieu(),
                phienBanDTO.getIduser(), phienBanDTO.getTg(), phienBanDTO.getMota());
        return phienBanRepository.save(phienBan);
    }

    @Override
    public List<PhienBan> getAllPhienBan() {
        return phienBanRepository.findAll();
    }

    @Override
    public PhienBan getPhienBanById(int id) {
        return phienBanRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }

    @Override
    public PhienBan updatePhienBan(PhienBanDTO binhLuanDTO, int id) {
        return phienBanRepository.findById(id).map(
                binhLuan->{
                    binhLuan.setIdtailieu(binhLuanDTO.getIdtailieu());
                    binhLuan.setIduser(binhLuanDTO.getIduser());
                    binhLuan.setTg(binhLuanDTO.getTg());
                    //user.setPassword(newUser.getPassword());
                    binhLuan.setMota(binhLuanDTO.getMota());
                    //user.setRole(newUser.getRole());
                    return phienBanRepository.save(binhLuan);
                }
        ).orElseThrow(()->new LichSuNotFoundException(id));
    }

    @Override
    public String deletePhienBan(int id) {
        if(!phienBanRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        phienBanRepository.deleteById(id);
        return "Delete Sucessfull";
    }

    @Override
    public String deleteVSByTailieuId(int idtailieu) {
        List<PhienBan> phienBanList = phienBanRepository.findByidtailieu(idtailieu);
        if (phienBanList.isEmpty()) {
            return "Không có phiên bản nào liên quan đến tài liệu này.";
        }

        for (PhienBan phienban : phienBanList) {
            phienBanRepository.deleteById(phienban.getUidphienban());
        }

        return "Đã xóa toàn bộ phiên bản liên quan đến tài liệu.";
    }
}
