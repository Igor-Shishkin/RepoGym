package selfStudyJava.goodPractices.bridge;

public class TeaPurchase implements DrinkPurchase{
    @Override
    public Drink buy(Double cost) {
        System.out.println("Buying a tea for: " + cost);
        return new Tea();
    }
}
