package com.example.bankapplication.appsecurity.auth;

import java.util.Optional;

/**
 * @author Mitchell Tawanda Severa
 * @created 03/03/2022 - 9:23 AM
 */

public interface ApplicationUserDao {
  Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
