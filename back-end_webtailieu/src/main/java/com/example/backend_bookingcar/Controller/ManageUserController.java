package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Service.TaiKhoanService;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/manage_user")
public class ManageUserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add_user")
    public User newUser(@RequestBody UserDTO userDTO){
        User user = new User();
        if(!userService.checkUserByEmail(userDTO.getEmail()) && !userService.checkUserByLogin(userDTO.getLogin())){
            user = userService.save(userDTO);
        }

        else {
            throw new RuntimeException("Email Existed or Login Existed");
        }
//        if(!userService.checkUserByLogin(userDTO.getLogin())){
//            user = userService.save(userDTO);
//        }
//        else {
//            throw new RuntimeException("Login Existed");
//        }
        return user;

    }
    @GetMapping("/list_user")
    List<User> getAllUsers(){
        List<User> arrayUser = userService.getAllUsers();
        return arrayUser;
    }
    @GetMapping("/{id}")
    User getUserById(@PathVariable int id){

        return userService.getUserById(id);
    }

    @GetMapping("/user_login/{login}")
    User getUserByLogin(@PathVariable String login){
        return userService.getUserByLogin(login);
    }

    @GetMapping("/user_gmail/{gmail}")
    User getUserByGmail(@PathVariable String gmail){
        return userService.getUserByEmail(gmail);
    }

//    @PutMapping("/edit_user/{id}")
//    User updateUser(@RequestBody UserDTO userDTO, @PathVariable int id){
//        return userService.updateUser(userDTO,id);
//    }
    @PutMapping("/edit_user/{login}")
    User updateUser(@RequestBody UserDTO userDTO, @PathVariable String login){
        int id = userService.findUidByLogin(login);
        return userService.updateUser(userDTO,id);
    }
//    @DeleteMapping("/delete_user/{id}")
//    String deleteUser(@PathVariable int id){
//        return userService.deleteUser(id);
//    }
    @DeleteMapping("/delete_user/{login}")
    String deleteUser(@PathVariable String login){
        int id = userService.findUidByLogin(login);
        return userService.deleteUser(id);
    }
}
