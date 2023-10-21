package konfigurowanie.springa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class KonfigurowaniePrzykladApplication {

    public static void main(String[] args) {
        SpringApplication.run(KonfigurowaniePrzykladApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("Witaj na kursie SDA");
    }


    //Internacionalizacja = i18n
    @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
        ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
        source.setBasenames("classpath:i18n/");
        source.setDefaultEncoding("UTF-8");
        return source;
    }
}
