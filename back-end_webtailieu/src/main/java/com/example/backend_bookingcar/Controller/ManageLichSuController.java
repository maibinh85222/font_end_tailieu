package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.LichSuHoatDongDTO;
import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.LichSuHoatDong;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.LichSuRepository;
import com.example.backend_bookingcar.Service.LichSuService;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/manage_lichsu")
public class ManageLichSuController {
    @Autowired
    private LichSuService lichSuService;
    @Autowired
    private LichSuRepository lichSuRepository;

    @PostMapping("/add_lichsu")
    public LichSuHoatDong newLichSu(@RequestBody LichSuHoatDongDTO lichSuHoatDongDTO){
        LichSuHoatDong lichSuHoatDong = new LichSuHoatDong();

        lichSuHoatDong = lichSuService.save(lichSuHoatDongDTO);

        return lichSuHoatDong;
    }
    @GetMapping("/list_lichsu")
    List<LichSuHoatDong> getAllLichsu(){
        List<LichSuHoatDong> arrayLichSu = lichSuService.getAllLichSu();
        return arrayLichSu;
    }
    @GetMapping("/{id}")
    LichSuHoatDong getlichSuById(@PathVariable int id){
        return lichSuService.getLichSuById(id);
    }

    @GetMapping("/list_lichsu/tailieu/{idtailieu}")
    public ResponseEntity<List<LichSuHoatDong>> findByidtailieu(@PathVariable int idtailieu) {
        List<LichSuHoatDong> lichSuHoatDong = lichSuRepository.findByidtailieu(idtailieu);
        if (lichSuHoatDong.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(lichSuHoatDong, HttpStatus.OK);
    }
    @GetMapping("/list_lichsu/user/{iduser}")
    public ResponseEntity<List<LichSuHoatDong>> findByiduser(@PathVariable int iduser) {
        List<LichSuHoatDong> lichSuHoatDong = lichSuRepository.findByiduser(iduser);
        if (lichSuHoatDong.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(lichSuHoatDong, HttpStatus.OK);
    }
}
