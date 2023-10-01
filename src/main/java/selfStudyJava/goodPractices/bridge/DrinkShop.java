package selfStudyJava.goodPractices.bridge;

public class DrinkShop {
    public static void main(String[] args) {
        DrinkPurchase cupOfCoffee = new CoffeePurchase();
        cupOfCoffee.buy(5.0);
    }
}
