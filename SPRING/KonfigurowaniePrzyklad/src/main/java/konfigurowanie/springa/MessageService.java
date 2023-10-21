package konfigurowanie.springa;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService {

    private final MessageSource messageSource;

    public MessageService(MessageSource messageSource) {
        this.messageSource = messageSource;
        Object[] values = {"Marek", "Adamski"};
        String textEn = messageSource.getMessage("hello", values, Locale.ENGLISH);
        System.out.println(textEn);
        String textPl = messageSource.getMessage("hello", new Object[]{"Jarku", "Czaplicki"}, Locale.forLanguageTag("pl"));
        System.out.println(textPl);
    }
}
