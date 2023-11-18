package com.example.springbootsecurity.User.controller;

import com.example.springbootsecurity.auth.ApplicationUser;
import com.example.springbootsecurity.auth.ApplicationUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/management/api/v1/users")
public class UserManagementController {

    private final ApplicationUserService userService;

    public UserManagementController(ApplicationUserService userService) {
        this.userService = userService;
    }

    public List<ApplicationUser> getAllUsers() {
        return userService.getAllUsers();
    }
}
