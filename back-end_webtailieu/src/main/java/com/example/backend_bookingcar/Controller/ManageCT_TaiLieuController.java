package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.CT_TaiLieuDTO;
import com.example.backend_bookingcar.DTO.LichSuHoatDongDTO;
import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.CT_TaiLieu;
import com.example.backend_bookingcar.Model.LichSuHoatDong;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Repository.CTTaiLieuRepository;
import com.example.backend_bookingcar.Repository.LichSuRepository;
import com.example.backend_bookingcar.Service.CT_TaiLieuService;
import com.example.backend_bookingcar.Service.LichSuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/manage_ct_tailieu")
public class ManageCT_TaiLieuController {
    @Autowired
    private CT_TaiLieuService ctTaiLieuService;
    @Autowired
    private CTTaiLieuRepository ctTaiLieuRepository;
    @PostMapping("/add_ct")
    public CT_TaiLieu newct(@RequestBody CT_TaiLieuDTO ctTaiLieuDTO){
        CT_TaiLieu ctTaiLieu = new CT_TaiLieu();

        ctTaiLieu = ctTaiLieuService.save(ctTaiLieuDTO);

        return ctTaiLieu;
    }
    @GetMapping("/list_ct")
    List<CT_TaiLieu> getAllCt(){
        List<CT_TaiLieu> arrayCt = ctTaiLieuService.getAllCtTaiLieu();
        return arrayCt;
    }
    @GetMapping("/{id}")
    CT_TaiLieu getCtById(@PathVariable int id){
        return ctTaiLieuService.getCtTaiLieuById(id);
    }
    @PutMapping("/edit_ct/{id}")
    CT_TaiLieu updateCt(@RequestBody CT_TaiLieuDTO ctTaiLieuDTO, @PathVariable int id){
        return ctTaiLieuService.updateCtTaiLieu(ctTaiLieuDTO,id);
    }

    @DeleteMapping("/delete_ct/{id}")
    String deleteCt(@PathVariable int id){
        return ctTaiLieuService.deleteCtTaiLieu(id);
    }
    @DeleteMapping("/delete_ct/tailieu/{idtailieu}")
    String deleteCTByTailieuId(@PathVariable int idtailieu) {
        return ctTaiLieuService.deleteCTByTailieuId(idtailieu);
    }

    @GetMapping("/list_ct/the/{idthe}")
    public ResponseEntity<List<CT_TaiLieu>> findByididthe(@PathVariable int idthe) {
        List<CT_TaiLieu> ctTaiLieuList = ctTaiLieuRepository.findByidthe(idthe);
        if (ctTaiLieuList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(ctTaiLieuList, HttpStatus.OK);
    }
    @GetMapping("/tailieu/{idtailieu}")
    public ResponseEntity<List<CT_TaiLieu>> findByidtailieu(@PathVariable int idtailieu) {
        List<CT_TaiLieu> ctTaiLieuList = ctTaiLieuRepository.findByidtailieu(idtailieu);
        if (ctTaiLieuList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(ctTaiLieuList, HttpStatus.OK);
    }
}
