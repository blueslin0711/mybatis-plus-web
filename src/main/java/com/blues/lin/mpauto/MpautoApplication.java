package com.blues.lin.mpauto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gitee.sunchenbin.mybatis.actable.manager.*"})
@MapperScan({"com.blues.lin.mpauto.mapper", "com.gitee.sunchenbin.mybatis.actable.dao.*"})
public class MpautoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MpautoApplication.class, args);
    }

}
