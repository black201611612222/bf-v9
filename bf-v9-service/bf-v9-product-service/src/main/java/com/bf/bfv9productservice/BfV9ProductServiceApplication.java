package com.bf.bfv9productservice;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class BfV9ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BfV9ProductServiceApplication.class, args);
    }

}
