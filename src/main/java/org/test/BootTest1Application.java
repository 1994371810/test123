package org.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.test.mapper")
@SpringBootApplication
public class BootTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(BootTest1Application.class, args);
    }

}
