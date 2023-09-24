package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.BinhLuanDTO;
import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.BinhLuan;
import com.example.backend_bookingcar.Model.LichSuHoatDong;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.BinhLuanRepository;
import com.example.backend_bookingcar.Repository.LichSuRepository;
import com.example.backend_bookingcar.Service.BinhLuanService;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*"uidtailieu": 4,
    "uiduser": 5,
    "tg": "2023-12-10T00:00:00",
    "noidung": "tuyet voi"*/
@CrossOrigin
@RestController
@RequestMapping("/manage_cmt")
public class ManageBinhLuanController {
    @Autowired
    private BinhLuanService binhLuanService;
    @Autowired
    private BinhLuanRepository binhLuanRepository;
    @PostMapping("/add_cmt")
    public BinhLuan newbinhluan(@RequestBody BinhLuanDTO binhLuanDTO){
        BinhLuan binhLuan = new BinhLuan();
        binhLuan = binhLuanService.save(binhLuanDTO);
        return binhLuan;
    }
    @GetMapping("/list_cmt")
    List<BinhLuan> getAllBinhLuan(){
        List<BinhLuan> arrayBinhLuan = binhLuanService.getAllBinhLuan();
        return arrayBinhLuan;
    }
    @GetMapping("/{id}")
    BinhLuan getBinhLuanById(@PathVariable int id){
        return binhLuanService.getBinhLuanById(id);
    }

    @PutMapping("/edit_cmt/{id}")
    BinhLuan updateBinhLuan(@RequestBody BinhLuanDTO binhLuanDTO, @PathVariable int id){
        return binhLuanService.updateBinhLuan(binhLuanDTO,id);
    }
    @DeleteMapping("/delete_cmt/{id}")
    String deleteBinhLuan(@PathVariable int id){
        return binhLuanService.deleteBinhLuan(id);
    }

    @DeleteMapping("/delete_cmt/tailieu/{idtailieu}")
    String deleteBinhLuanByTailieuId(@PathVariable int idtailieu) {
        return binhLuanService.deleteBinhLuanByTailieuId(idtailieu);
    }
    @GetMapping("/list_cmt/tailieu/{idtailieu}")
    public ResponseEntity<List<BinhLuan>> findByidtailieu(@PathVariable int idtailieu) {
        List<BinhLuan> binhLuan = binhLuanRepository.findByidtailieu(idtailieu);
        if (binhLuan.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(binhLuan, HttpStatus.OK);
    }
    @GetMapping("/list_cmt/user/{iduser}")
    public ResponseEntity<List<BinhLuan>> findByiduser(@PathVariable int iduser) {
        List<BinhLuan> binhluan = binhLuanRepository.findByiduser(iduser);
        if (binhluan.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(binhluan, HttpStatus.OK);
    }
}
