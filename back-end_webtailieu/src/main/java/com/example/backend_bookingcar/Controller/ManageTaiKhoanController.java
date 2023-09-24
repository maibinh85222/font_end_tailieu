package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.TaiKhoanDTO;
import com.example.backend_bookingcar.Model.TaiKhoan;
import com.example.backend_bookingcar.Service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/manage_login")
public class ManageTaiKhoanController {
    @Autowired
    private TaiKhoanService taikhoanService;
    @PostMapping("/add_login")
    public TaiKhoan newTaiKhoan(@RequestBody TaiKhoanDTO taikhoanDTO){
        TaiKhoan taikhoan = new TaiKhoan();
//        if(!userService.checkUserByEmail(userDTO.getEmail()) && !userService.checkUserByLogin(userDTO.getLogin())){
//            user = userService.save(userDTO);
//        }
//
//        else {
//            throw new RuntimeException("Email Existed or Login Existed");
//        }
//        if(!userService.checkUserByLogin(userDTO.getLogin())){
//            user = userService.save(userDTO);
//        }
//        else {
//            throw new RuntimeException("Login Existed");
//        }
        taikhoan = taikhoanService.save(taikhoanDTO);
        return taikhoan;

    }
    @GetMapping("/list_login")
    List<TaiKhoan> getAllTaiKhoan(){
        List<TaiKhoan> arrayTaiKhoan = taikhoanService.getAllTaiKhoan();
        return arrayTaiKhoan;
    }
//    @PutMapping("/edit_login/{id}")
//    TaiKhoan updateTaiKhoan(@RequestBody TaiKhoanDTO taikhoanDTO, @PathVariable int id){
//        return taikhoanService.updateTaiKhoan(taikhoanDTO,id);
//    }

    @PutMapping("/edit_login/{login}")
    TaiKhoan updateTaiKhoan(@RequestBody TaiKhoanDTO taikhoanDTO, @PathVariable String login){
        int id = taikhoanService.findUidByLogin(login);
        return taikhoanService.updateTaiKhoan(taikhoanDTO,id);
    }
//    @DeleteMapping("/delete_login/{id}")
//    String deleteTaiKhoan(@PathVariable int id){
//        return taikhoanService.deleteTaiKhoan(id);
//    }

    @DeleteMapping("/delete_login/{login}")
    String deleteTaiKhoan(@PathVariable String login){
        int id = taikhoanService.findUidByLogin(login);
        return taikhoanService.deleteTaiKhoan(id);
    }


    @GetMapping("/id/{id}")
    TaiKhoan getTaiKhoanById(@PathVariable int id){
        return taikhoanService.getTaiKhoanById(id);
    }

//    @GetMapping("/{login}")
//    TaiKhoan getTaiKhoanByLogin(@PathVariable String login){
//        return taikhoanService.getTaiKhoanByLogin(login);
//    }

    @GetMapping("/{login}")
    TaiKhoan getTaiKhoanByLogin1(@PathVariable String login){
        int uid = taikhoanService.findUidByLogin(login);

        return taikhoanService.getTaiKhoanById(uid);
    }
}
