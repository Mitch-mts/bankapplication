package com.example.bankapplication.appsecurity.security;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.example.bankapplication.appsecurity.security.ApplicationUserPermission.ADMIN_READ;
import static com.example.bankapplication.appsecurity.security.ApplicationUserPermission.ADMIN_WRITE;

/**
 * @author Mitchell Tawanda Severa
 * @created 01/03/2022 - 11:31 AM
 */

public enum ApplicationUserRole {
  ADMIN(Sets.newHashSet(ADMIN_READ,
      ADMIN_WRITE));

  private final Set<ApplicationUserPermission> permissions;

  ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
    this.permissions = permissions;
  }

  public Set<ApplicationUserPermission> getPermissions() {
    return permissions;
  }

  public Set<SimpleGrantedAuthority> getGrantedAuthorities(){
    Set<SimpleGrantedAuthority>  permissions = getPermissions().stream()
                                              .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                                              .collect(Collectors.toSet());
    permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
    return permissions;
  }
}
