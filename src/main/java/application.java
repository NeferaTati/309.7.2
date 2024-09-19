package com.lab30972;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.glab30972")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}