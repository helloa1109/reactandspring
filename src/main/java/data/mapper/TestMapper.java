package data.mapper;

import data.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    public void testInsert(TestDto dto);
    public List<TestDto> getAllDatas();
    public void testDelete(int num);
}
