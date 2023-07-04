package advancedJava.daySecond.inheritance.interfacesExampleTwo.Composition;

public class Tv {
    String manufacturer;
    int size;

    public Tv(String manufacturer, int size) {
        this.manufacturer = manufacturer;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                '}';
    }
}
