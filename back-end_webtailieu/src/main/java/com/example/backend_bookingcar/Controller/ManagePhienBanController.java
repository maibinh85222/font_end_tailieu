package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.BinhLuanDTO;
import com.example.backend_bookingcar.DTO.PhienBanDTO;
import com.example.backend_bookingcar.Model.BinhLuan;
import com.example.backend_bookingcar.Model.LichSuHoatDong;
import com.example.backend_bookingcar.Model.PhienBan;
import com.example.backend_bookingcar.Repository.BinhLuanRepository;
import com.example.backend_bookingcar.Repository.PhienBanRepository;
import com.example.backend_bookingcar.Service.BinhLuanService;
import com.example.backend_bookingcar.Service.PhienBanService;
import com.example.backend_bookingcar.Service.PhienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/manage_vs")
public class ManagePhienBanController {
    @Autowired
    private PhienBanService phienBanService;
    @Autowired
    private PhienBanRepository phienBanRepository;
    @PostMapping("/add_vs")
    public PhienBan newPhienBan(@RequestBody PhienBanDTO phienBanDTO){
        PhienBan phienban = new PhienBan();
        phienban = phienBanService.save(phienBanDTO);
        return phienban;
    }
    @GetMapping("/list_vs")
    List<PhienBan> getAllPhienBan(){
        List<PhienBan> arrayPhienBan = phienBanService.getAllPhienBan();
        return arrayPhienBan;
    }
    @GetMapping("/{id}")
    PhienBan getPhienBanById(@PathVariable int id){
        return phienBanService.getPhienBanById(id);
    }
    @PutMapping("/edit_vs/{id}")
    PhienBan updatePhienBan(@RequestBody PhienBanDTO phienBanDTO, @PathVariable int id){
        return phienBanService.updatePhienBan(phienBanDTO,id);
    }
    @DeleteMapping("/delete_vs/{id}")
    String deletePhienBan(@PathVariable int id){
        return phienBanService.deletePhienBan(id);
    }

    @DeleteMapping("/delete_vs/tailieu/{idtailieu}")
    String deleteVSByTailieuId(@PathVariable int idtailieu) {
        return phienBanService.deleteVSByTailieuId(idtailieu);
    }
    @GetMapping("/list_vs/tailieu/{idtailieu}")
    public ResponseEntity<List<PhienBan>> findByidtailieu(@PathVariable int idtailieu) {
        List<PhienBan> phienban = phienBanRepository.findByidtailieu(idtailieu);
        if (phienban.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(phienban, HttpStatus.OK);
    }
    @GetMapping("/list_vs/user/{iduser}")
    public ResponseEntity<List<PhienBan>> findByiduser(@PathVariable int iduser) {
        List<PhienBan> phienban = phienBanRepository.findByiduser(iduser);
        if (phienban.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(phienban, HttpStatus.OK);
    }
}
