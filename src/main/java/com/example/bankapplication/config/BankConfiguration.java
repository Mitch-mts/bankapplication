package com.example.bankapplication.config;

import com.example.bankapplication.appsecurity.jwt.JwtConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfiguration {

    @Bean
    JwtConfig jwtConfig(){
        return new JwtConfig();
    }
}
