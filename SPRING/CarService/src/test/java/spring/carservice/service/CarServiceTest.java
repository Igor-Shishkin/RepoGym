package spring.carservice.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import spring.carservice.model.Car;
import spring.carservice.model.Color;
import spring.carservice.repository.CarRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CarServiceTest {

    @Mock
    private CarRepository carRepository;
    @InjectMocks
    private CarService carService;

    @BeforeEach
    void setUp(){
        //Mockito.when()
        when(carRepository.getAllCars())
                .thenReturn(getAllCars());
    }
    public Car carIdOne = Car.builder().id(1).mark("Mazda").model("CX30").color(Color.BLACK).build();

//    @Test
//    void x() {
//        //given
//
//        //when
//
//        //then
//
//    }

    @Test
    void should_return_all_cars_from_repository() {
        final List<Car> allCars = carService.getAllCars();
//        allCars.forEach(System.out::println);
        verify(carRepository).getAllCars();
        assertThat(allCars).isNotEmpty()
                .hasSize(4);
    }
    @Test
    void should_find_car_by_id(){
        final Optional<Car> carById = carService.getCarById(1);
        assertThat(carById).isNotEmpty()
                .isEqualTo(Optional.of(carIdOne));
    }
    @Test
    void should_return_optional_empty_when_car_was_not_found(){
        final Optional<Car> carById = carService.getCarById(10);
        assertThat(carById).isEmpty();
    }
    @Test
    void should_find_cars_by_color(){
        final List<Car> carsByColor = carService.getCarsByColor(Color.BLACK);
        assertThat(carsByColor)
                .isNotEmpty()
                .hasSize(2);
    }
    @Test
    void should_find_car_by_color(){
        final List<Car> carsByColor = carService.getCarsByColor(Color.YELLOW);
        assertThat(carsByColor)
                .isNotEmpty()
                .hasSize(1)
                .containsExactly(Car.builder().id(4).mark("Nissan").model("Note").color(Color.YELLOW).build());
    }
    @Test
    void should_return_empty_list_when_car_was_not_found_by_color(){
        List<Car> carsByColor = carService.getCarsByColor(Color.WHITE);
        assertThat(carsByColor).isEmpty();
    }
    @Test
    void should_add_the_car_to_database_when_car_with_same_id_not_present(){
        Car carToAdd = Car.builder().id(6).mark("Mazda").model("CX30").color(Color.BLACK).build();
        Optional<Car> car = carService.addCar(carToAdd);
        verify(carRepository).addCar(carToAdd);
        assertThat(car).isNotEmpty();
        assertThat(car.get()).isEqualTo(carToAdd);

    }
    @Test
    void should_update_car_when_car_with_same_id_not_presents_in_database(){
        Car carToUpdate = Car.builder().id(5).mark("Mazda").model("CX30").color(Color.BLACK).build();
        Car car = carService.addOrUpdateCar(5, carToUpdate);
        verify(carRepository).addCar(carToUpdate);
        assertThat(car).isEqualTo(carToUpdate);
    }
    @Test
    void should_update_full_car_when_car_with_same_id_exist_in_database(){
        Car carToUpdate = carIdOne;
        Car carToAdd = Car.builder().id(1).mark("BMW").model("Multipla").color(Color.RED).build();
        carService.addOrUpdateCar(1, carToAdd);
        verify(carRepository).updateFullCar(carToUpdate, carToAdd);
    }
    @Test
    void should_delete_car_by_id_when_car_with_same_id_exist_in_database(){
        Car carToDelete = carIdOne;
        Optional<Car> car = carService.deleteCarById(1);
        verify(carRepository).deleteCar(carToDelete);
        assertThat(car).isNotEmpty();
        assertThat(car.get()).isEqualTo(carToDelete);
    }

        @Test
    void should_return_empty_oprional_when_id_doesnt_exist_in_database(){
            Optional<Car> deletedCarById = carService.deleteCarById(10);
            verify(carRepository).getAllCars();
            verifyNoMoreInteractions(carRepository);
            assertThat(deletedCarById).isEmpty();

        }
    private List<Car> getAllCars(){
        return  Arrays.asList(
                carIdOne,
                Car.builder().id(2).mark("Ford").model("Mustang").color(Color.BLUE).build(),
                Car.builder().id(3).mark("Mazda").model("CX30").color(Color.BLACK).build(),
                Car.builder().id(4).mark("Nissan").model("Note").color(Color.YELLOW).build()
        );
    }
}