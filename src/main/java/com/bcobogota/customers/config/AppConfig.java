package com.bcobogota.customers.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${app.message}")
    private String message;

    @PostConstruct
    public void init() {
        System.out.println(">>> " + message);
    }
}