package advancedJava.daySecond.enums;

public enum Coffee {
    LATTE(10, Roast.BLOND), // Stałę będące `Singletonami`
    ESPRESSO(0, Roast.DARK),
    AMERICANO(5, Roast.MEDIUM);

    private final int milk;
    private final Roast roast;

    Coffee(int milk, Roast roast) { // konstruktor wewnętrzny, tylko dla `enum Coffee`
        this.milk = milk;
        this.roast = roast;
    }

    public int getMilk() {
        return milk;
    }

    public Roast getRoast() {
        return roast;
    }

    enum Roast { // Prosty enum wyliczający rodzaje palenia kawy
        BLOND,
        DARK,
        MEDIUM
    }
}

