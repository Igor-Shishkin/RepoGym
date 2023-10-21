package konfigurowanie.springa.model;


import lombok.*;

// nie ma sensu by klasę modelową która obsługuje dziesiątki elementów dołączać do SPRING
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car {
    private String model;
    private String mark;

}
