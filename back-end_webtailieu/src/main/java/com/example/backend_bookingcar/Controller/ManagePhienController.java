package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.PhienDTO;
import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.PhienLamViec;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Service.PhienService;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/manage_phien")
public class ManagePhienController {
    @Autowired
    private PhienService phienService;
    @PostMapping("/add_phien")
    public PhienLamViec newPhien(@RequestBody PhienDTO phienDTO){
        PhienLamViec phien = new PhienLamViec();

        phien = phienService.save(phienDTO);

        return phien;
    }
    @GetMapping("/list_phien")
    List<PhienLamViec> getAllPhien(){
        List<PhienLamViec> arrayPhien = phienService.getAllPhien();
        return arrayPhien;
    }
    @GetMapping("/{id}")
    PhienLamViec getUserById(@PathVariable int id){
        return phienService.getPhienById(id);
    }
}
