package sda.advancedJava.daySecond.inheritance.interfacesExampleTwo;
@FunctionalInterface
public interface MediaPlayer {
    String NAME_OF_INTERFACES = "Interface Media Player";
    void stop();
    public default void next() {
        System.out.println("I'm default method");
    }
    public static  String getNameOfInterfaces () {
        return NAME_OF_INTERFACES;
    }
}
