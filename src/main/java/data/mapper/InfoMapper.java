package data.mapper;

import data.dto.InfoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface InfoMapper {

    public void insertInfo(InfoDto dto);
    public void updatePhoto(HashMap<String, Object> map);
    public List<InfoDto> list();
    public void deleteInfo(int num);
    public InfoDto getData(int num);
}
