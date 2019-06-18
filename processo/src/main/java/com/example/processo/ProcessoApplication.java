package com.example.processo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class ProcessoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProcessoApplication.class, args);
    }

}
