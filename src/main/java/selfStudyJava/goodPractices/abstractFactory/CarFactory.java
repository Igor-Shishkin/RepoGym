package selfStudyJava.goodPractices.abstractFactory;

public class CarFactory {
    private CarFactory()
    {

    }
    public static Car buildCar(CarType type)
    {
        Car car = null;
        // We can add any GPS Function here which
        // read location property somewhere from configuration
        // and use location specific car factory
        // Currently I'm just using INDIA as Location
        Location location = Location.INDIA;

        car = switch (location) {
            case USA -> USACarFactory.buildCar(type);
            case INDIA -> INDIACarFactory.buildCar(type);
            default -> DefaultCarFactory.buildCar(type);
        };

        return car;

    }
}
