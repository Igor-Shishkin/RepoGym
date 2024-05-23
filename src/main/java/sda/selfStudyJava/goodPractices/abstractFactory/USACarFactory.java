package sda.selfStudyJava.goodPractices.abstractFactory;

public class USACarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case MICRO -> car = new MicroCar(Location.USA);
            case MINI -> car = new MiniCar(Location.USA);
            case LUXURY -> car = new LuxuryCar(Location.USA);
            default -> { }
        }
        return car;
    }
}
