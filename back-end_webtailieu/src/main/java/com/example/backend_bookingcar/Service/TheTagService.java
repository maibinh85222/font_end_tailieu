package com.example.backend_bookingcar.Service;

import com.example.backend_bookingcar.DTO.TheTagDTO;
import com.example.backend_bookingcar.DTO.TrangThaiDTO;
import com.example.backend_bookingcar.Model.TheTag;
import com.example.backend_bookingcar.Model.TrangThai;

import java.util.List;

public interface TheTagService {
    TheTag save(TheTagDTO theTagDTO);
    List<TheTag> getAllTheTag();
    TheTag getTheTagById(int id);
    TheTag updateTheTag(TheTagDTO theTagDTO, int id);
    String deleteTheTag(int id);

}
