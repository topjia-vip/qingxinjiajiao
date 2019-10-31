package com.it.qingxin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.it.qingxin.mapper")
@SpringBootApplication
public class QingxinApplication {
    public static void main(String[] args) {
        SpringApplication.run(QingxinApplication.class, args);
    }
}
