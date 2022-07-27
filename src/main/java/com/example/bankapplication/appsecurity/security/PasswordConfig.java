package com.example.bankapplication.appsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Mitchell Tawanda Severa
 * @created 01/03/2022 - 11:12 AM
 */
@Configuration
public class PasswordConfig {

  @Bean
  public PasswordEncoder  passwordEncoder(){
    return new BCryptPasswordEncoder(10);
  }
}
