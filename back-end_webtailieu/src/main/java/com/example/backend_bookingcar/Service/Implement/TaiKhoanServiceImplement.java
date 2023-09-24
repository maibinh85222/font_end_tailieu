package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.DTO.TaiKhoanDTO;
import com.example.backend_bookingcar.Exception.TaiKhoanNotFoundException;
import com.example.backend_bookingcar.Exception.UserNotFoundException;
import com.example.backend_bookingcar.Model.TaiKhoan;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.TaiKhoanRepository;
import com.example.backend_bookingcar.Repository.UserRepository;
import com.example.backend_bookingcar.Service.TaiKhoanService;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaiKhoanServiceImplement implements TaiKhoanService {

    @Autowired
    private TaiKhoanRepository taikhoanRepository;
    @Override
    public TaiKhoan save(TaiKhoanDTO taikhoanDTO) {
        TaiKhoan taikhoan = new TaiKhoan(taikhoanDTO.getlogin(),
                taikhoanDTO.getpass(),taikhoanDTO.getMavtro(),taikhoanDTO.getMatt());
        return taikhoanRepository.save(taikhoan);
    }

    @Override
    public Boolean checktaikhoanByLogin(String login) {
        TaiKhoan taikhoan = taikhoanRepository.findTaiKhoanByLogin(login);
        if(taikhoan == null) return false;
        return true;
    }

    @Override
    public List<TaiKhoan> getAllTaiKhoan() {
        return taikhoanRepository.findAll();
    }

    @Override
    public TaiKhoan getTaiKhoanById(int id) {
        return taikhoanRepository.findById(id).orElseThrow(()-> new TaiKhoanNotFoundException(id));
    }

    @Override
    public TaiKhoan updateTaiKhoan(TaiKhoanDTO newtaikhoan, int id) {
        return taikhoanRepository.findById(id).map(
                taikhoan->{
                    taikhoan.setlogin(newtaikhoan.getlogin());
                    //user.setPhonenumber(newUser.getPhonenumber());
                    //user.setEmail(newUser.getEmail());
                    //user.setPassword(newUser.getPassword());
                    taikhoan.setPass(newtaikhoan.getpass());
                    taikhoan.setMaVTro(newtaikhoan.getMavtro());
                    taikhoan.setMaTT(newtaikhoan.getMatt());
                    return taikhoanRepository.save(taikhoan);
                }
        ).orElseThrow(()->new TaiKhoanNotFoundException(id));
    }

    @Override
    public String deleteTaiKhoan(int id) {

        if (!taikhoanRepository.existsById(id)) {
            throw new TaiKhoanNotFoundException(id);
        }
        taikhoanRepository.deleteById(id);
        return "Delete Sucessfull";

    }

    @Override
    public String deleteTaiKhoanLogin(String Login) {


        return "Delete Sucessfull";

    }
    /*
    * @Override
    public String deleteTaiKhoan(int id) {
        if (!taikhoanRepository.existsById(id)) {
            throw new TaiKhoanNotFoundException(id);
        }
        taikhoanRepository.deleteById(id);
        return "Delete Sucessfull";

    }
    * */

    @Override
    public TaiKhoan getTaiKhoanByLogin(String login) {
        return taikhoanRepository.getTaiKhoanByLogin(login);
    }

    @Override
    public int findUidByLogin(String login) {

        Optional<TaiKhoan> userOptional = taikhoanRepository.findAll().stream()
                .filter(taikhoan -> taikhoan.getlogin().equals(login))
                .findFirst();

        return userOptional.map(TaiKhoan::getUid).orElse(null);
    }
}
