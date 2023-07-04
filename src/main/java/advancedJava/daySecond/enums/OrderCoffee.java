package advancedJava.daySecond.enums;

public class OrderCoffee { // klasa korzystająca z Enuma `Coffee`, komponując go z ceną
    private Coffee coffee;
    private int price;

    public OrderCoffee(Coffee coffee, int price) {
        this.coffee = coffee;
        this.price = price;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "OrderCoffee{" +
                "coffee=" + coffee +
                ", price=" + price +
                '}';
    }
}
