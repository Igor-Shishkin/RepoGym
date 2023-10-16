package com.example.exampletwokonfigurowanie;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService {

    private final MessageSource messageSource;

    public MessageService(MessageSource messageSource) {
        this.messageSource = messageSource;

        String textEn = messageSource.getMessage("hello", new Object[]{"Marek", "Adamski"}, Locale.ENGLISH);
        System.out.println(textEn);
        String textPl = messageSource.getMessage("hello", new Object[]{"Jack", "London"}, Locale.forLanguageTag("pl"));
        System.out.println(textPl);

    }
}
