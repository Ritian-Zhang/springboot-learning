package com.ritian.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.ritian.springboot.mapper")
public class SpringbootMybatisMapperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisMapperApplication.class, args);
    }

}

