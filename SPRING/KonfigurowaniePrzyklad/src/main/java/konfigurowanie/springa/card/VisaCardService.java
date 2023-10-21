package konfigurowanie.springa.card;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service
public class VisaCardService implements Card{

    public String getInfo(){
        return "VisaCardService";
    }
}
