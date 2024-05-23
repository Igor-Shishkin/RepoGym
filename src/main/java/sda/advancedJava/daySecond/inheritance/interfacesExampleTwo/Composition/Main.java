package sda.advancedJava.daySecond.inheritance.interfacesExampleTwo.Composition;

public class Main {
    // living room
    // bedroom (name, type)
    // TV (brand, size)
    public static void main(String[] args) {

        String name = "King Size";
        String type = "LUX";

        Bed bed = new Bed(name, type);
        Tv tv = new Tv("Samsung", 34);
        Room room = new Room(bed, tv);

        System.out.println(room);

    }
}
