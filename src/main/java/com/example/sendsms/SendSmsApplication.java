package com.example.sendsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SendSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SendSmsApplication.class, args);
    }

}
