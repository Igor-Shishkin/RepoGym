package com.example.springbootsecurity.security;

import com.example.springbootsecurity.auth.ApplicationUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.concurrent.TimeUnit;

import static com.example.springbootsecurity.security.ApplicationUserRole.*;

@Configuration
@EnableWebSecurity // adnotacja która określa że klasa konfiguracyjna dotyczy "Security"
@EnableGlobalMethodSecurity(prePostEnabled = true)
// dodać aby zadziałały adnotacje nad enpoint-ami w 'StudentManagementController'
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
    private final PasswordEncoder passwordEncoder;
    private final ApplicationUserService applicationUserService;

    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder, ApplicationUserService applicationUserService) {
        this.passwordEncoder = passwordEncoder;
        this.applicationUserService = applicationUserService;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // https://docs.spring.io/spring-security/reference/features/exploits/csrf.html
        http
                .csrf().disable()
                .authorizeRequests() // każde żądanie musi być autoryzowane (czyli odpowiednie prawa dostępu do zasobu)
                .antMatchers("/", "index", "/css/*", "/js/*").permitAll()
                .antMatchers("/api/**").hasRole(STUDENT.name())
                .anyRequest() // każde żądanie
                .authenticated() // musi prejść autentykację (logi i hasło)
                .and()
                .formLogin()
                    .loginPage("/login")
                    .permitAll()
                    .defaultSuccessUrl("/courses", true)
                    .passwordParameter("password") // jeśli chcemy użyć innej nazwy niż w pliku html
                    .usernameParameter("username")  // jeśli chcemy użyć innej nazwy niż w pliku html
                .and()
                .rememberMe()
                    .tokenValiditySeconds((int)TimeUnit.DAYS.toSeconds(21))
                    .key("somethingverysecured") // szyfrowanie to MD5
                    .rememberMeParameter("remember-me") // jeśli chcemy użyć innej nazwy niż w pliku html
                .and()
                .logout()
                    .logoutUrl("/logout")
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout", "GET"))
                    .clearAuthentication(true)
                    .invalidateHttpSession(true)
                    .deleteCookies("JSESSIONID","remember-me")
                    .logoutSuccessUrl("/login")
        ; // wskazanie indywidualnej strony logowania
    }
    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(passwordEncoder);
        provider.setUserDetailsService(applicationUserService);
        return provider;
    }

//    @Override
//    @Bean // Metoda zwraca obiekt będący Bean-en i będzie zarządzany przez kontekst springa
//    protected UserDetailsService userDetailsService() {
//        // Stworzymy jednego użytkownika STUDENT
//        UserDetails annaSmithUser = User.builder()
//                .username("annaSmith")
//                .password(passwordEncoder.encode("password"))
////                .roles(STUDENT.name()) // ROLE_STUDENT
//                .authorities(STUDENT.getGrantedAuthorities())
//                .build();
//
//        // Stworzymy jednego użytkownika ADMIN
//        UserDetails lindaUser = User.builder()
//                .username("linda")
//                .password(passwordEncoder.encode("password123"))
////                .roles(ADMIN.name()) //ROLE_ADMIN
//                .authorities(ADMIN.getGrantedAuthorities())
//                .build();
//
//        // Stworzymy jednego praktykanta dla admina
//        UserDetails tomUser = User.builder()
//                .username("tom")
//                .password(passwordEncoder.encode("password123"))
////                .roles(ADMINTRAINEE.name()) //ROLE_ADMINTRAINEE
//                .authorities(ADMINTRAINEE.getGrantedAuthorities())
//                .build();
//
//        UserDetails guestUser = User.builder()
//                .username("guest")
//                .password(passwordEncoder.encode("guest"))
//                .authorities(GUEST.getGrantedAuthorities())
//                .build();
//
//        return new InMemoryUserDetailsManager(annaSmithUser, lindaUser, tomUser, guestUser);// Implementacja interfejsu 'UserDetailsService'
//
//    }

    public static void main(String[] args) {
        System.out.println(TimeUnit.DAYS.toSeconds(1));
    }
}
