package basicsJava.practice.carCatalog;

public class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private double price;
    public Car(String brand, String model, int yearOfProduction, double price) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public double getPrice() {
        return price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}