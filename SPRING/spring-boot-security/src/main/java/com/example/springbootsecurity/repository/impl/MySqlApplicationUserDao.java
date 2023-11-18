package com.example.springbootsecurity.repository.impl;

import com.example.springbootsecurity.auth.ApplicationUser;
import com.example.springbootsecurity.auth.ApplicationUserDao;
import com.example.springbootsecurity.repository.ApplicationUserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("mysql")
public class MySqlApplicationUserDao implements ApplicationUserDao {
    private final ApplicationUserRepository applicationUserRepository;

    public MySqlApplicationUserDao(ApplicationUserRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }




    @Override
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public List<ApplicationUser> getAllUsers() {
        return null;
    }
}
