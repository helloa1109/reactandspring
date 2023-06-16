package data.service;

import data.dto.InfoDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public interface InfoServiceInter {

    public void insertInfo(InfoDto dto);
    public void updatePhoto(int num, String photo);
    public List<InfoDto> list();
    public void deleteInfo(int num);
    public InfoDto getData(int num);
}

