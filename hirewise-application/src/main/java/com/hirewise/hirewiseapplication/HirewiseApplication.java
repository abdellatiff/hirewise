package com.hirewise.hirewiseapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hirewise")
public class HirewiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(HirewiseApplication.class, args);
    }

}
