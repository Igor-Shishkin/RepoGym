package konfigurowanie.springa.card;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service
@Primary
public class MasterCardService implements Card{

    public String getInfo(){
        return "MasterCardService";
    }
}
