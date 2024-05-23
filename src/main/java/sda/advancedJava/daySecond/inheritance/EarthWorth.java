package sda.advancedJava.daySecond.inheritance;

public class EarthWorth extends Animal {
    public EarthWorth (String name) {
        super (name);
    }

    @Override
    public String getSound() {
        return "EarthWorth can't say";
    }
}
