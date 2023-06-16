package data.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

@Data
@Alias("TestDto")
public class TestDto {


    @ApiModelProperty(example = "1")
    private int num;
    @ApiModelProperty(example = "페이커")
    private String irum;
    @ApiModelProperty(example = "나너무잘해")
    private String message;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "Asia/Seoul")
    private Timestamp writeday;
}
