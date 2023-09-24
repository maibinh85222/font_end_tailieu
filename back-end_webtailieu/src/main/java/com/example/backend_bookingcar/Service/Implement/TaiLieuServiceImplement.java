package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.DTO.TaiLieuDTO;
import com.example.backend_bookingcar.Exception.TaiLieuNotFoundException;
import com.example.backend_bookingcar.Exception.UserNotFoundException;
import com.example.backend_bookingcar.Model.TaiLieu;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.TaiLieuRepository;
import com.example.backend_bookingcar.Repository.UserRepository;
import com.example.backend_bookingcar.Service.TaiLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaiLieuServiceImplement implements TaiLieuService {

    @Autowired
    private TaiLieuRepository tailieuRepository;
    @Override
    public TaiLieu save(TaiLieuDTO tailieuDTO) {
        TaiLieu tailieu = new TaiLieu(tailieuDTO.getTieude(),tailieuDTO.getMota(),tailieuDTO.getDuongdan(),tailieuDTO.getMavtro());
        return tailieuRepository.save(tailieu);
    }

    @Override
    public List<TaiLieu> getAllTaiLieu() {
        return tailieuRepository.findAll();
    }

    @Override
    public TaiLieu getTaiLieuById(int id) {
        return tailieuRepository.findById(id).orElseThrow(()-> new TaiLieuNotFoundException(id));
    }

    @Override
    public TaiLieu updateTaiLieu(TaiLieuDTO tailieuDTO, int id) {
        return tailieuRepository.findById(id).map(
                tailieu->{
                    tailieu.setTieude(tailieuDTO.getTieude());
                    tailieu.setMota(tailieuDTO.getMota());
                    tailieu.setDuongdan(tailieuDTO.getDuongdan());
                    //user.setPassword(newUser.getPassword());
                    tailieu.setMavtro(tailieuDTO.getMavtro());
                    //user.setRole(newUser.getRole());
                    return tailieuRepository.save(tailieu);
                }
        ).orElseThrow(()->new TaiLieuNotFoundException(id));
    }

    @Override
    public String deleteTaiLieu(int id) {
        if(!tailieuRepository.existsById(id)){
            throw new TaiLieuNotFoundException(id);
        }
        tailieuRepository.deleteById(id);
        return "Delete Sucessfull";
    }
}
