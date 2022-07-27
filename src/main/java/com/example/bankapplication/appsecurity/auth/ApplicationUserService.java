package com.example.bankapplication.appsecurity.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Mitchell Tawanda Severa
 * @created 03/03/2022 - 9:21 AM
 */
@Service
public class ApplicationUserService implements UserDetailsService {

  private final ApplicationUserDao applicationUserDao;

  @Autowired
  public ApplicationUserService(@Qualifier("fake") ApplicationUserDao applicationUserDao) {
    this.applicationUserDao = applicationUserDao;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return applicationUserDao.selectApplicationUserByUsername(username)
        .orElseThrow(()-> new UsernameNotFoundException("Username " + username + " not found"));
  }
}
