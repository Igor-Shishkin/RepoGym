package spring.carservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import spring.carservice.model.Car;
import spring.carservice.model.Color;
import spring.carservice.service.CarService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Slf4j
@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public ResponseEntity<CollectionModel<Car>> getAllCars() {
        final List<Car> allCars = carService.getAllCars();

        if (CollectionUtils.isEmpty(allCars)) {
            log.error("There are no cars in database");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        allCars.forEach(this::applyLinkToCar);
        final Link link = linkTo(CarController.class).withSelfRel();

        return ResponseEntity.ok(CollectionModel.of(allCars, link));
    }

    @GetMapping(path = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Car> getCarById(@PathVariable int id) {
        final Optional<Car> carById = carService.getCarById(id);
        final String errorMessage = String.format("Car with id %d not found", id);
        return getCarResponseEntity(carById, errorMessage, HttpStatus.OK, HttpStatus.NOT_FOUND);
    }

    @GetMapping(path = "/color", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public ResponseEntity<CollectionModel<Car>> getCarByColor(@RequestParam final Color color) {
        final List<Car> carsByCollor = carService.getCarsByColor(color);

        if (CollectionUtils.isEmpty(carsByCollor)) {
            log.error("No car with color {} was found", color);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        carsByCollor.forEach(this::applyLinkToCar);
        final Link link = linkTo(CarController.class).withSelfRel();
        return ResponseEntity.ok(CollectionModel.of(carsByCollor, link));
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public ResponseEntity<Car> addCar(@Validated @RequestBody final Car car) {
        final Optional<Car> addedCar = carService.addCar(car);
        final String errorMessage = String.format("Car with id %d already exists", car.getId());
        return getCarResponseEntity(addedCar, errorMessage, HttpStatus.CREATED, HttpStatus.FORBIDDEN);
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity<Car> addOrUpdateCar(@PathVariable final int id,@Validated @RequestBody final Car car){
        Car updateCar = carService.addOrUpdateCar(id, car);
        applyLinkToCar(updateCar);
        return ResponseEntity.ok().body(updateCar);
    }

    @PatchMapping(path = "/{id}")
    @ResponseBody
    public ResponseEntity<Car> updateCarById(@PathVariable final int id,@RequestBody final Map<Object, Object> fieldsToUpdate ){
        final Optional<Car> car = carService.updateCarById(id, fieldsToUpdate);
        final String errorMessage = String.format("Car with id %d not found", id);
        return getCarResponseEntity(car, errorMessage, HttpStatus.OK, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Car> deleteCarById(@PathVariable final int id){
        Optional<Car> car = carService.deleteCarById(id);
        String errorMessage = String.format("Car with id %d not found", id);
        return getCarResponseEntity(car, errorMessage, HttpStatus.ACCEPTED, HttpStatus.NOT_FOUND);
    }

    private ResponseEntity<Car> getCarResponseEntity(final Optional<Car> car, final String errorMessage,
                                                     final HttpStatus successCode, final HttpStatus errorCode) {
        return car.map(
                queriedCar -> {
                    applyLinkToCar(queriedCar);
                    return ResponseEntity.status(successCode).body(queriedCar);
                }).orElseGet(
                () -> {
                    log.error(errorMessage);
                    return ResponseEntity.status(errorCode).build();
                });
    }

    private void applyLinkToCar(final Car car) {
        car.addIf(!car.hasLinks(), () -> linkTo(CarController.class).slash(car.getId()).withSelfRel());
    }

}
