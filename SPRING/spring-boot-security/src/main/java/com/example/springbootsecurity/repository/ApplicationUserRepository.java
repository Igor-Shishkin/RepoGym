package com.example.springbootsecurity.repository;

import com.example.springbootsecurity.User.entity.ApplicationUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationUserRepository extends JpaRepository<ApplicationUserEntity, Long> {
}
