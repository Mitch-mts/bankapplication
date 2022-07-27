package com.example.bankapplication.appsecurity.jwt;

import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.crypto.SecretKey;

/**
 * @author Mitchell Tawanda Severa
 * @created 03/03/2022 - 12:36 PM
 */
@Configuration
public class JwtSecretKey {
  private final JwtConfig jwtConfig;

  @Autowired
  public JwtSecretKey(JwtConfig jwtConfig) {
    this.jwtConfig = jwtConfig;
  }

  @Bean
  public SecretKey secretKey(){
    return Keys.hmacShaKeyFor(jwtConfig.getSecretKey().getBytes());
  }

}
