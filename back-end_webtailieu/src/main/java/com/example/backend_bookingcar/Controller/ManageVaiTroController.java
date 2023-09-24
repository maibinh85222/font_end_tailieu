package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.DTO.VaiTroDTO;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Model.VaiTro;
import com.example.backend_bookingcar.Service.UserService;
import com.example.backend_bookingcar.Service.VaiTroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/manage_vaitro")
public class ManageVaiTroController {
    @Autowired
    private VaiTroService vaiTroService;

    @PostMapping("/add_vaitro")
    public VaiTro newVaiTro(@RequestBody VaiTroDTO vaiTroDTO){
        VaiTro vaitro = new VaiTro();
        if(!vaiTroService.checkVaiTroByMaVtro(vaiTroDTO.getMavtro())){
            vaitro = vaiTroService.save(vaiTroDTO);
        }

        else {
            throw new RuntimeException("ma vai tro Existed");
        }
        return vaitro;

    }
    @GetMapping("/list_vaitro")
    List<VaiTro> getAllVaitro(){
        List<VaiTro> arrayVaiTro = vaiTroService.getAllVaiTro();
        return arrayVaiTro;
    }
    @GetMapping("/{id}")
    VaiTro getVaiTroById(@PathVariable int id){

        return vaiTroService.getVaiTroById(id);
    }
    @GetMapping("/list_vaitro/{mavtro}")
    VaiTro getVaiTroByLogin(@PathVariable String mavtro){
        int id = vaiTroService.findUidByLogin(mavtro);
        return vaiTroService.getVaiTroById(id);
    }

    @PutMapping("/edit_vaitro/{mavtro}")
    VaiTro updateVaiTro(@RequestBody VaiTroDTO vaiTroDTO, @PathVariable String mavtro){
        int id = vaiTroService.findUidByLogin(mavtro);
        return vaiTroService.updateVaiTro(vaiTroDTO,id);
    }
    @DeleteMapping("/delete_vaitro/{mavtro}")
    String deleteVaitro(@PathVariable String mavtro){
        int id = vaiTroService.findUidByLogin(mavtro);
        return vaiTroService.deleteVaiTro(id);
    }
}
