package bit.study.reactbootproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"data.*","naver.cloud"})
@MapperScan({"data.mapper"})
public class ReactBootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactBootProjectApplication.class, args);
    }

}
