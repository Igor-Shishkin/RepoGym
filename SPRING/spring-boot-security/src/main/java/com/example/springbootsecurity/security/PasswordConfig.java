package com.example.springbootsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {
    @Bean // Metoda zwraca obiekt Bean-a
    public PasswordEncoder passwordEncoder(){
        // Spring domyślnie używa do kodowania 'String encode(CarSequence var)'
        return new BCryptPasswordEncoder(10); // jedna z najpopularniejszych implementacji 'PasswordEncoder'
    }
}
