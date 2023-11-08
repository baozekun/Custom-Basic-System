package com.bzk.basic.system;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class BasicSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicSystemApplication.class, args);
    }

}
