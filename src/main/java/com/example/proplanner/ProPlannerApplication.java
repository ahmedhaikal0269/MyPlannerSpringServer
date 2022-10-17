package com.example.proplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ProPlannerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProPlannerApplication.class, args);
    }

}