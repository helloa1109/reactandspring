package data.controller;

import data.dto.TestDto;
import data.mapper.TestMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
@Api(value = "TestController v1")
public class TestController {

    private TestMapper testMapper;

    @PostMapping("/test/insert")
    public String insert(@RequestBody TestDto dto)
    {
        testMapper.testInsert(dto);
        return "success";
    }

    @GetMapping("/test/list")
    public List<TestDto> list()
    {
        System.out.println("react>>list");
        return testMapper.getAllDatas();
    }

//    @ApiOperation(value = "1",notes = "삭제할 num 값")
//    @DeleteMapping("/test/delete")
//    public String delete(@RequestParam int num)
//    {
//        System.out.println("delete>>"+num);
//        testMapper.testDelete(num);
//        return "success";
//    }

    @DeleteMapping("/test/delete/{num}")
    public String delete(@PathVariable int num)
    {
        System.out.println("delete>>"+num);
        testMapper.testDelete(num);
        return "success";
    }
}
