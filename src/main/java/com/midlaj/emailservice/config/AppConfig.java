package com.midlaj.emailservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class AppConfig {

    @Bean(name = "emailExecutor")
    public ExecutorService emailExecutor() {
        return Executors.newFixedThreadPool(10);
    }

}
