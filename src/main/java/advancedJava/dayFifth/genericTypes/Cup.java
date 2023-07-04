package advancedJava.dayFifth.genericTypes;

public class Cup<T extends Liquid> {
    T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    void drink() {
        System.out.println("I'm drinking");
    }
}
