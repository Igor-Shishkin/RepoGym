package sda.advancedJava.daySecond.inheritance;

abstract public class Animal {
    private final String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    abstract public String getSound ();
}
