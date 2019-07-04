package com.example.tokemdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TokemdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TokemdemoApplication.class, args);
    }

}
