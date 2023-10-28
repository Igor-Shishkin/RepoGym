package com.example.springbootsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static com.example.springbootsecurity.security.ApplicationUserRole.*;

@Configuration
@EnableWebSecurity // adnotacja która określa że klasa konfiguracyjna dotyczy "Security"
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
    private final PasswordEncoder passwordEncoder;

    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests() // każde żądanie musi być autoryzowane (czyli odpowiednie prawa dostępu do zasobu)
                .antMatchers("/", "index").permitAll()
                .antMatchers("/api/**").hasRole(STUDENT.name())
                .anyRequest() // każde żądanie
                .authenticated() // musi prejść autentykację (logi i hasło)
                .and()
                .httpBasic(); // używamy podstawowej autentykacji czyli mechanizmu BasicAuth

    }

    @Override
    @Bean // Metoda zwraca obiekt będący Bean-en i będzie zarządzany przez kontekst springa
    protected UserDetailsService userDetailsService() {
        // Stworzymy jednego użytkownika STUDENT
        UserDetails annaSmithUser = User.builder()
                .username("annaSmith")
                .password(passwordEncoder.encode("password"))
                .roles(STUDENT.name())
                .build();

        // Stworzymy jednego użytkownika ADMIN
        UserDetails lindaUser = User.builder()
                .username("linda")
                .password(passwordEncoder.encode("password123"))
                .roles(ADMIN.name())
                .build();

        return new InMemoryUserDetailsManager(annaSmithUser, lindaUser);// Implementacja interfejsu 'UserDetailsService'
    }
}
