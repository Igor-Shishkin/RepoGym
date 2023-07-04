package advancedJava.daySecond.inheritance.interfacesExampleTwo.Composition;

public class Room {
    private final Bed bed;
    private final Tv tv;

    public Room (Bed bed, Tv tv) {
        this.bed = bed;
        this.tv = tv;
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", tv=" + tv +
                '}';
    }
}
