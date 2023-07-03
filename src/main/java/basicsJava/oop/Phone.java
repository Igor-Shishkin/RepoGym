package basicsJava.oop;

public class Phone {
    public static int numberOfPhones = 0;
    private String brand;
    private String model;

    private int year;

    public Phone(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        numberOfPhones++;
    }
    public static void decrementNumberOfPhones() {
        numberOfPhones--;
    }
}
