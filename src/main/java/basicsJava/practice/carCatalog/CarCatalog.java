package basicsJava.practice.carCatalog;

import java.util.List;
import java.util.ArrayList;
public class CarCatalog {
    private List<Car> carList;
    public CarCatalog() {
        carList = new ArrayList<>();
    }
    public void addCar(Car car) {
        carList.add(car);
    }
    public void showAllCars() {
        int counter = 1;
        for (Car car : carList) {
            System.out.println(counter + ". Marka: " + car.getBrand() + ", Model: " + car.getModel() +
                    ", Rok produkcji: " + car.getYearOfProduction() + ", Cena: " + car.getPrice());
            counter++;
        }
    }
    public void showCarsFromYear(int year) {
        int counter = 1;
        for (Car car : carList) {
            if (car.getYearOfProduction() == year) {
                System.out.println(counter + ". Marka: " + car.getBrand() + ", Model: " + car.getModel() +
                        ", Rok produkcji: " + car.getYearOfProduction() + ", Cena: " + car.getPrice());
                counter++;
            }
        }
    }
}