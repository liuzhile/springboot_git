package com.baizhi.lzl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.baizhi.lzl.mapper")
public class SpringbootGitApplication {

    public static void main(String[] args) {
        System.out.println("this is liu ");
        SpringApplication.run(SpringbootGitApplication.class, args);
    }

}

