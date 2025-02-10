package com.api.yswebfluxstarterkit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YsWebfluxStarterKitApplication {

    public static void main(String[] args) {
        SpringApplication.run(YsWebfluxStarterKitApplication.class, args);
        System.out.println("Hello webflux!");
    }

}
