package com.example.bankapplication.appsecurity.jwt;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Mitchell Tawanda Severa
 * @created 03/03/2022 - 10:15 AM
 */
@Data
@NoArgsConstructor
public class UsernameAndPasswordAuthenticationRequest {
  private String username;
  private String password;
}
