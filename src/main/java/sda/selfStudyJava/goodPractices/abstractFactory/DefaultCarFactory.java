package sda.selfStudyJava.goodPractices.abstractFactory;

public class DefaultCarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case MICRO -> car = new MicroCar(Location.DEFAULT);
            case MINI -> car = new MiniCar(Location.DEFAULT);
            case LUXURY -> car = new LuxuryCar(Location.DEFAULT);
            default -> {
            }
        }
        return car;
    }
}
