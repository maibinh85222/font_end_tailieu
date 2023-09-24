package com.example.backend_bookingcar.Service;

import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.User;

import java.util.List;

public interface UserService {
    User save(UserDTO userDTO);
    Boolean checkUserByEmail(String email);
    Boolean checkUserByLogin(String login);
    User getUserByEmail(String email);

    User getUserByLogin(String login);

    List<User> getAllUsers();
    User getUserById(int id);
    User updateUser(UserDTO user, int id);
    String deleteUser(int id);
    int findUidByLogin(String login);
}
