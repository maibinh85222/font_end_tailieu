package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Exception.UserNotFoundException;
import com.example.backend_bookingcar.Model.TaiKhoan;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.UserRepository;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplement implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserDTO userDTO) {
        User user = new User(userDTO.getFullname(),
                userDTO.getEmail(), userDTO.getAddress(), userDTO.getLogin());
        return userRepository.save(user);
    }

    @Override
    public Boolean checkUserByEmail(String email) {
        User user = userRepository.findUserByEmail(email);
        if(user == null) return false;
        return true;
    }

    @Override
    public Boolean checkUserByLogin(String login) {
        User user = userRepository.findUserByLogin(login);
        if(user == null) return false;
        return true;
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

    @Override
    public User getUserByLogin(String login) {
        return userRepository.getUserByLogin(login);
    }
    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }
    @Override
    public User updateUser(UserDTO newUser,int id){
        return userRepository.findById(id).map(
                user->{
                    user.setFullname(newUser.getFullname());
                    //user.setPhonenumber(newUser.getPhonenumber());
                    //user.setEmail(newUser.getEmail());
                    //user.setPassword(newUser.getPassword());
                    user.setAddress(newUser.getAddress());
                    //user.setRole(newUser.getRole());
                    return userRepository.save(user);
                }
        ).orElseThrow(()->new UserNotFoundException(id));
    }

    @Override
    public String deleteUser(int id) {
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "Delete Sucessfull";
    }

    @Override
    public int findUidByLogin(String login) {
        Optional<User> userOptional = userRepository.findAll().stream()
                .filter(user -> user.getLogin().equals(login))
                .findFirst();

        return userOptional.map(User::getUid).orElse(null);
    }


}
