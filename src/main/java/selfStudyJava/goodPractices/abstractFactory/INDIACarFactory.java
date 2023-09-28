package selfStudyJava.goodPractices.abstractFactory;

public class INDIACarFactory {
    static Car buildCar(CarType model)  {
        Car car = null;
        switch (model) {
            case MICRO -> car = new MicroCar(Location.INDIA);
            case MINI -> car = new MiniCar(Location.INDIA);
            case LUXURY -> car = new LuxuryCar(Location.INDIA);
            default -> {
            }
        }
        return car;
    }
}
