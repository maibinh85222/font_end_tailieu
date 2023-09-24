package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.DTO.TheTagDTO;
import com.example.backend_bookingcar.Exception.UserNotFoundException;
import com.example.backend_bookingcar.Model.TheTag;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.TheTagRepository;
import com.example.backend_bookingcar.Repository.UserRepository;
import com.example.backend_bookingcar.Service.TheTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheTagServiceImplement implements TheTagService {
    @Autowired
    private TheTagRepository theTagRepository;
    @Override
    public TheTag save(TheTagDTO theTagDTO) {
        TheTag thetag = new TheTag(theTagDTO.getTenthe());
        return theTagRepository.save(thetag);
    }

    @Override
    public List<TheTag> getAllTheTag() {
        return theTagRepository.findAll();
    }

    @Override
    public TheTag getTheTagById(int id) {
        return theTagRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }

    @Override
    public TheTag updateTheTag(TheTagDTO theTagDTO, int id) {
        return theTagRepository.findById(id).map(
                user->{
                    user.setTenthe(theTagDTO.getTenthe());
                    //user.setPhonenumber(newUser.getPhonenumber());
                    //user.setEmail(newUser.getEmail());
                    //user.setPassword(newUser.getPassword());
                    //user.setAddress(newUser.getAddress());
                    //user.setRole(newUser.getRole());
                    return theTagRepository.save(user);
                }
        ).orElseThrow(()->new UserNotFoundException(id));
    }

    @Override
    public String deleteTheTag(int id) {
        if(!theTagRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        theTagRepository.deleteById(id);
        return "Delete Sucessfull";
    }
}
