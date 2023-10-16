package com.example.exampletwokonfigurowanie;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "page-info")
public class PageInfo {

    private String author;
    private int creationDate;


//    @Value("${author}")
//    private String author;
//    @Value("${creationDate}")
//    private int creationDate;

//    @Value("${page-info.author}")
//    private String author;
//    @Value("${page-info.creationDate}")
//    private int creationDate;

//    @EventListener(ApplicationReadyEvent.class)
//    public void getSOMETHING(){
//        System.out.println("Author: " + author);
//        System.out.println("Creation date: " + creationDate);
//    }

    @EventListener(ApplicationReadyEvent.class)
    public void get(){
        System.out.println("Autor: " + author);
        System.out.println("Data utworzenia: " + creationDate);
    }
}
