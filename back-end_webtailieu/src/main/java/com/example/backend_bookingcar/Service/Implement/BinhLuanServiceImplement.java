package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.DTO.BinhLuanDTO;
import com.example.backend_bookingcar.Exception.LichSuNotFoundException;
import com.example.backend_bookingcar.Exception.UserNotFoundException;
import com.example.backend_bookingcar.Model.BinhLuan;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.BinhLuanRepository;
import com.example.backend_bookingcar.Repository.UserRepository;
import com.example.backend_bookingcar.Service.BinhLuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BinhLuanServiceImplement implements BinhLuanService {
    @Autowired
    private BinhLuanRepository binhLuanRepository;
    @Override
    public BinhLuan save(BinhLuanDTO binhLuanDTO) {
        BinhLuan binhLuan = new BinhLuan(binhLuanDTO.getUidtailieu(),
                binhLuanDTO.getUiduser(), binhLuanDTO.getTg(), binhLuanDTO.getNoidung());
        return binhLuanRepository.save(binhLuan);
    }

    @Override
    public List<BinhLuan> getAllBinhLuan() {
        return binhLuanRepository.findAll();
    }

    @Override
    public BinhLuan getBinhLuanById(int id) {
        return binhLuanRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }

    @Override
    public BinhLuan updateBinhLuan(BinhLuanDTO binhLuanDTO, int id) {
        return binhLuanRepository.findById(id).map(
                binhLuan->{
                    binhLuan.setIdtailieu(binhLuanDTO.getUidtailieu());
                    binhLuan.setIduser(binhLuanDTO.getUiduser());
                    binhLuan.setTg(binhLuanDTO.getTg());
                    //user.setPassword(newUser.getPassword());
                    binhLuan.setNoidung(binhLuanDTO.getNoidung());
                    //user.setRole(newUser.getRole());
                    return binhLuanRepository.save(binhLuan);
                }
        ).orElseThrow(()->new LichSuNotFoundException(id));
    }

    @Override
    public String deleteBinhLuan(int id) {
        if(!binhLuanRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        binhLuanRepository.deleteById(id);
        return "Delete Sucessfull";
    }

    @Override
    public String deleteBinhLuanByTailieuId(int idtailieu) {
        List<BinhLuan> binhLuanList = binhLuanRepository.findByidtailieu(idtailieu);
        if (binhLuanList.isEmpty()) {
            return "Không có bình luận nào liên quan đến tài liệu này.";
        }

        for (BinhLuan binhLuan : binhLuanList) {
            binhLuanRepository.deleteById(binhLuan.getUidbinhluan());
        }

        return "Đã xóa toàn bộ bình luận liên quan đến tài liệu.";
    }
}
