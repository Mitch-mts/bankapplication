package com.example.bankapplication.appsecurity.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.example.bankapplication.appsecurity.security.ApplicationUserRole.ADMIN;


/**
 * @author Mitchell Tawanda Severa
 * @created 03/03/2022 - 9:29 AM
 */
@Repository("fake")
public class FakeApplicationUserDaoService implements ApplicationUserDao {

  private final PasswordEncoder passwordEncoder;

  @Autowired
  public FakeApplicationUserDaoService(PasswordEncoder passwordEncoder) {
    this.passwordEncoder = passwordEncoder;
  }

  @Override
  public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
    return getApplicationUsers().stream()
        .filter(applicationUser -> username.equals(applicationUser.getUsername()))
        .findFirst();
  }

  private List<ApplicationUser> getApplicationUsers() {
    List<ApplicationUser> applicationUsers = new ArrayList<>();

    applicationUsers.add(new ApplicationUser(ADMIN.getGrantedAuthorities(),
        passwordEncoder.encode("password"),
        "admin",
        true,
        true,
        true,
        true));
    return applicationUsers;
  }
}
