package data.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

@Data
@Alias("InfoDto")
public class InfoDto {

    private int num;
    private String irum;
    private String address;
    private String photo;
    private String birthday;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Seoul")
    private Timestamp gaipday;

}
