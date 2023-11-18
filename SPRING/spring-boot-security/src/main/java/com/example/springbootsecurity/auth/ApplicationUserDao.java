package com.example.springbootsecurity.auth;

import java.util.List;
import java.util.Optional;

public interface ApplicationUserDao {
   Optional<ApplicationUser> selectApplicationUserByUsername(String username);

    List<ApplicationUser> getAllUsers();
}
