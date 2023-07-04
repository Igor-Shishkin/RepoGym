package advancedJava.dayForth.models;

import java.util.Objects;

public class Car {


        private Integer id;
        private String make;
        private String model;
        private Double price;
        private Integer year;
        private String color;

    public Car() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(year, car.year) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make, model, price, year, color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(Integer id, String make, String model, Double price, Integer year, String color) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", year=" + year +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
