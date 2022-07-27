package com.example.bankapplication.appsecurity.security;

/**
 * @author Mitchell Tawanda Severa
 * @created 01/03/2022 - 11:32 AM
 */

public enum ApplicationUserPermission {
  ADMIN_READ("admin:read"),
  ADMIN_WRITE("admin:write");

  private final String permission;

  ApplicationUserPermission(String permission) {
    this.permission = permission;
  }

  public String getPermission() {
    return permission;
  }
}
