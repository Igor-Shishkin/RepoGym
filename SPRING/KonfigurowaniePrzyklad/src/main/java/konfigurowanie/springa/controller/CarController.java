package konfigurowanie.springa.controller;

import konfigurowanie.springa.model.Car;
import konfigurowanie.springa.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

/*    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }*/

    @GetMapping
    public List<Car> getCars(){
        return carService.getCars();
    }
}
