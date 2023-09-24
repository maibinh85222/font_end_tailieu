package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.ThuMucDTO;
import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.ThuMuc;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Service.ThuMucService;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/manage_thumuc")
public class ManageThuMucController {
    @Autowired
    private ThuMucService thuMucService;
    @PostMapping("/add_thumuc")
    public ThuMuc newThuMuc(@RequestBody ThuMucDTO thuMucDTO){
        ThuMuc thumuc = new ThuMuc();
        //if(!thuMucService.checkThuMucByDuongDan(thuMucDTO.getDuongdan())){
            thumuc = thuMucService.save(thuMucDTO);
        //}

//          else {
//              throw new RuntimeException("Thu muc Existed");
//          }
        return thumuc;
    }

    @GetMapping("/list_thumuc")
    List<ThuMuc> getAllThuMuc(){
        List<ThuMuc> arrayThuMuc = thuMucService.getAllThuMuc();
        return arrayThuMuc;
    }

    @GetMapping("/{id}")
    ThuMuc getThuMucById(@PathVariable int id){
        return thuMucService.getThuMucById(id);
    }

//    @GetMapping("/list_thumuc/{duongdan}")
//    ThuMuc getThuMucByDuongDan(@PathVariable String duongdan){
//        int id = thuMucService.findUidByDuongDan(duongdan);
//        return thuMucService.getThuMucById(id);
//    }
//    @PutMapping("/edit_thumuc/duongdan/{duongdan}")
//    ThuMuc updateThuMuc(@RequestBody ThuMucDTO thuMucDTO, @PathVariable String duongdan){
//        int id = thuMucService.findUidByDuongDan(duongdan);
//        return thuMucService.updateUser(thuMucDTO,id);
//    }

    @PutMapping("/edit_thumuc/id/{id}")
    ThuMuc updateThuMuc(@RequestBody ThuMucDTO thuMucDTO, @PathVariable int id){
        return thuMucService.updateUser(thuMucDTO,id);
    }
//    @DeleteMapping("/delete_thumuc/duongdan/{duongdan}")
//    String deleteThuMuc(@PathVariable String duongdan){
//        int id = thuMucService.findUidByDuongDan(duongdan);
//        return thuMucService.deleteThuMuc(id);
//    }

    @DeleteMapping("/delete_thumuc/id/{id}")
    String deleteThuMuc(@PathVariable int id){
        return thuMucService.deleteThuMuc(id);
    }

}
