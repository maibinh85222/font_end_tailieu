package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.DTO.TheTagDTO;
import com.example.backend_bookingcar.DTO.UserDTO;
import com.example.backend_bookingcar.Model.TheTag;
import com.example.backend_bookingcar.Model.User;
import com.example.backend_bookingcar.Service.TheTagService;
import com.example.backend_bookingcar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/manage_tag")
public class ManageTheTagController {
    @Autowired
    private TheTagService theTagService;
    @PostMapping("/add_tag")
    public TheTag newTag(@RequestBody TheTagDTO theTagDTO){
        TheTag thetag = new TheTag();

        thetag = theTagService.save(theTagDTO);
        return thetag;

    }
    @GetMapping("/list_tag")
    List<TheTag> getAllTag(){
        List<TheTag> arraytag = theTagService.getAllTheTag();
        return arraytag;
    }
    @GetMapping("/{id}")
    TheTag getTagById(@PathVariable int id){

        return theTagService.getTheTagById(id);
    }
    @PutMapping("/edit_user/{id}")
    TheTag updateTag(@RequestBody TheTagDTO theTagDTO, @PathVariable int id){
        return theTagService.updateTheTag(theTagDTO,id);
    }
    @DeleteMapping("/delete_tag/{id}")
    String deleteTag(@PathVariable int id){
        return theTagService.deleteTheTag(id);
    }
}
