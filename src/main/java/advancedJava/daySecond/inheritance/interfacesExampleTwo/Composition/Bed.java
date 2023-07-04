package advancedJava.daySecond.inheritance.interfacesExampleTwo.Composition;

public class Bed {
    String name;
    String type;
    public Bed(String name, String type) {
        this.name = name;
        this.type = type;
    };

    @Override
    public String toString() {
        return "Bed{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
