package com.example.bankapplication.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mitchell Tawanda Severa
 * @created 02/03/2022 - 11:33 AM
 */
@Controller
@RequestMapping("/login")
public class LoginController {

  @GetMapping
  public String getLoginView(){
    return "login";
  }

}
