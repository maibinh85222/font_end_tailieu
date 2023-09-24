package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.TaiKhoanDTO;
import com.example.backend_bookingcar.DTO.TaiLieuDTO;
import com.example.backend_bookingcar.DTO.TrangThaiDTO;
import com.example.backend_bookingcar.Model.TaiLieu;
import com.example.backend_bookingcar.Model.TrangThai;
import com.example.backend_bookingcar.Service.TaiLieuService;
import com.example.backend_bookingcar.Service.TrangThaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/manage_tailieu")
public class ManageTaiLieuController {
    @Autowired
    private TaiLieuService taiLieuService;

    @PostMapping("/add_tailieu")
    public TaiLieu newTaiLieu(@RequestBody TaiLieuDTO taiLieuDTO){
        TaiLieu taiLieu = new TaiLieu();

        taiLieu = taiLieuService.save(taiLieuDTO);

        return taiLieu;

    }

    @GetMapping("/list_tailieu")
    List<TaiLieu> getAllTaiLieu(){
        List<TaiLieu> arrayTaiLieu = taiLieuService.getAllTaiLieu();
        return arrayTaiLieu;
    }

    @GetMapping("/{id}")
    TaiLieu getTaiLieuById(@PathVariable int id){
        return taiLieuService.getTaiLieuById(id);
    }

    @PutMapping("/edit_tailieu/{id}")
    TaiLieu updateTaiLieu(@RequestBody TaiLieuDTO tailieuDTO, @PathVariable int id){
        return taiLieuService.updateTaiLieu(tailieuDTO,id);
    }

    @DeleteMapping("/delete_tailieu/{id}")
    String deleteTaiLieu(@PathVariable int id){

        return taiLieuService.deleteTaiLieu(id);
    }
}
