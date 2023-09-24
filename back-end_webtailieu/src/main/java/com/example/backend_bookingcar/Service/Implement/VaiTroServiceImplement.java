package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.DTO.VaiTroDTO;
import com.example.backend_bookingcar.Exception.UserNotFoundException;
import com.example.backend_bookingcar.Exception.VaiTroNotFoundException;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Model.VaiTro;
import com.example.backend_bookingcar.Repository.UserRepository;
import com.example.backend_bookingcar.Repository.VaiTroRepository;
import com.example.backend_bookingcar.Service.UserService;
import com.example.backend_bookingcar.Service.VaiTroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaiTroServiceImplement implements VaiTroService {
    @Autowired
    private VaiTroRepository vaitroRepository;


    @Override
    public VaiTro save(VaiTroDTO vaiTroDTO) {
        VaiTro vaitro = new VaiTro(vaiTroDTO.getMavtro(),
                vaiTroDTO.getTenvtro(), vaiTroDTO.getMota());
        return vaitroRepository.save(vaitro);
    }

    @Override
    public Boolean checkVaiTroByMaVtro(String mavtro) {
        VaiTro vaitro = vaitroRepository.findVaiTroByMavtro(mavtro);
        if(vaitro == null) return false;
        return true;
    }

    @Override
    public List<VaiTro> getAllVaiTro() {
        return vaitroRepository.findAll();
    }

    @Override
    public VaiTro getVaiTroById(int id) {
        return vaitroRepository.findById(id).orElseThrow(()-> new VaiTroNotFoundException(id));
    }

    @Override
    public VaiTro updateVaiTro(VaiTroDTO vaiTroDTO, int id) {
        return vaitroRepository.findById(id).map(
                vaitro->{
                    vaitro.setMavtro(vaiTroDTO.getMavtro());
                    //user.setPhonenumber(newUser.getPhonenumber());
                    //user.setEmail(newUser.getEmail());
                    //user.setPassword(newUser.getPassword());
                    vaitro.setTenvtro(vaiTroDTO.getTenvtro());
                    vaitro.setMota(vaiTroDTO.getMota());
                    return vaitroRepository.save(vaitro);
                }
        ).orElseThrow(()->new VaiTroNotFoundException(id));
    }

    @Override
    public String deleteVaiTro(int id) {
        if(!vaitroRepository.existsById(id)){
            throw new VaiTroNotFoundException(id);
        }
        vaitroRepository.deleteById(id);
        return "Delete Sucessfull";
    }

    @Override
    public int findUidByLogin(String mavtro) {
        Optional<VaiTro> userOptional = vaitroRepository.findAll().stream()
                .filter(vaitro -> vaitro.getMavtro().equals(mavtro))
                .findFirst();

        return userOptional.map(VaiTro::getUidvaitro).orElse(null);
    }
}
