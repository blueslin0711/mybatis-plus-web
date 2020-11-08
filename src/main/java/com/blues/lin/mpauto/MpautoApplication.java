package com.blues.lin.mpauto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.blues.lin.mpauto.mapper")
public class MpautoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpautoApplication.class, args);
    }

}
