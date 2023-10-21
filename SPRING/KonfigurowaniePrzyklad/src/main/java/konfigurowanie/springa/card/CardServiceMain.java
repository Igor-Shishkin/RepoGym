package konfigurowanie.springa.card;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CardServiceMain {
    private final Card card;

    public CardServiceMain(@Qualifier("visaCardService") Card card) {
        this.card = card;

        String info = card.getInfo();
        System.out.println(info);
    }
}
