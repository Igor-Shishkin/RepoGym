package konfigurowanie.springa.service;


import konfigurowanie.springa.model.Car;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

// Nie potrzebujemy więcej niż jedną instancję tej klasy, dlatego powinna być "Singlethonem"
// Aby kontekst Spring mógł zarządzać tą klasą musimy zastosować jedną z adnotacji:
// @Component - najbardziej ogólny, może być wykorzystywany w definicji beanów typu DTO
// @Repository - dedykowany dla klas, których zadaniem jest przechowywanie, generowanie danych
// @Service - sugerowane dla klas, które dostarczają usługi
// @Controller / @RestController - przeznaczony do warstwy prezentacji lub/i dla API aplikacji

@Service
public class CarService {
    private List<Car> carList;

    public CarService() {
        Car carOne = new Car("Syrenka", "Sport");
        Car carTwo = new Car("Warszawa", "1800");
        Car carThree = new Car("Żuk", "2.2");

        carList = Arrays.asList(carOne, carTwo, carThree);
    }

    //W SPRING main nie jest potrzebny
//    public static void main(String[] args) {
//        CarService carService = new CarService();
//        carService.showCars();
//    }

    @EventListener(ApplicationReadyEvent.class)
    private void showCars() {
        carList.forEach(System.out::println);
    }

    public List<Car> getCars() {
        return carList;
    }
}
