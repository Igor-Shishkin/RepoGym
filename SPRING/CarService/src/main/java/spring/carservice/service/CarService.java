package spring.carservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import spring.carservice.model.Car;
import spring.carservice.model.Color;
import spring.carservice.repository.CarRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class CarService {
    private final CarRepository carRepository;

    @EventListener(ApplicationReadyEvent.class)
    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    public Optional<Car> getCarById(final int id) {
        return findCarById(id);
    }

    public List<Car> getCarsByColor(final Color color) {
        final List<Car> carList = carRepository.getAllCars();
        return carList.stream()
                .filter(car -> car.getColor().equals(color))
                .collect(Collectors.toList());
    }

    public Optional<Car> addCar(final Car newCar) {
        final Optional<Car> quarifedCar = findCarById(newCar.getId());
        if (quarifedCar.isPresent()) {
            log.error("Car with id {} already exists", newCar.getId());
            return Optional.empty();
        }
        carRepository.addCar(newCar);
        return Optional.of(newCar);
    }

    public Car addOrUpdateCar(final int id, final Car newCar) {
        final Optional<Car> quarifedCar = findCarById(id);
        if (quarifedCar.isEmpty()) {
            log.info("Car with id {} not found. Creating new database entry", id);
            carRepository.addCar(newCar);
            return newCar;
        }

        log.info("Car with id {} was found. Preforming update", id);
        carRepository.updateFullCar(quarifedCar.get(), newCar);
        return newCar;
    }

    public Optional<Car> updateCarById(final int id, final Map<Object, Object> fieldsToUpdate) {
        final Optional<Car> quarifedCar = findCarById(id);
        if (quarifedCar.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(carRepository.updatePartialCarData(quarifedCar.get(), fieldsToUpdate));
    }

    public Optional<Car> deleteCarById(final int id){
        final Optional<Car> quarifedCar = findCarById(id);
        if (quarifedCar.isEmpty()) {
            return Optional.empty();
        }
        carRepository.deleteCar(quarifedCar.get());
        return Optional.of(quarifedCar.get());
    }
    private Optional<Car> findCarById(final int id) {
        final List<Car> carList = carRepository.getAllCars();
        return carList.stream()
                .filter(car -> car.getId() == id)
                .findFirst();
    }
}
