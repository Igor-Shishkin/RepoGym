package konfigurowanie.springa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "page-info")
public class PageInfo {
//    @Value("${page-info.autor}")
    private String author;
//    @Value("${page-info.creationDate}")
    private int creationDate;

    private String company;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get(){
        System.out.println("Autor: " + author);
        System.out.println("Data utworzenia: " + creationDate);
        System.out.println("Firma: " + company);
    }
}
