package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.TrangThaiDTO;
import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.TrangThai;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Service.TrangThaiService;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/manage_tt")
public class ManageTrangThaiController {
    @Autowired
    private TrangThaiService trangthaiService;

    @PostMapping("/add_tt")
    public TrangThai newTrangThai(@RequestBody TrangThaiDTO trangthaiDTO){
        TrangThai trangthai = new TrangThai();
        if(!trangthaiService.checkTrangThaiByMatt(trangthaiDTO.getMatt())){
            trangthai = trangthaiService.save(trangthaiDTO);
        }

        else {
            throw new RuntimeException("Trang thai Existed");
        }

        return trangthai;

    }

    @GetMapping("/list_tt")
    List<TrangThai> getAllTrangThai(){
        List<TrangThai> arrayTrangThai = trangthaiService.getAllTrangThai();
        return arrayTrangThai;
    }
    @GetMapping("/{id}")
    TrangThai getTrangThaiById(@PathVariable int id){
        return trangthaiService.getTrangThaiById(id);
    }

    @GetMapping("/tt_matt/{matt}")
    TrangThai getTrangThaiByMatt(@PathVariable String matt){
        int id = trangthaiService.findUidByMatt(matt);
        return trangthaiService.getTrangThaiById(id);
    }

    @PutMapping("/edit_tt/{matt}")
    TrangThai updateTrangThai(@RequestBody TrangThaiDTO trangthaiDTO, @PathVariable String matt){
        int id = trangthaiService.findUidByMatt(matt);
        return trangthaiService.updateTrangThai(trangthaiDTO,id);
    }

    @DeleteMapping("/delete_tt/{matt}")
    String deleteTrangThai(@PathVariable String matt){
        int id = trangthaiService.findUidByMatt(matt);
        return trangthaiService.deleteTrangThai(id);
    }
}
