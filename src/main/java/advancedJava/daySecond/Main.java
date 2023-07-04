package advancedJava.daySecond;
import advancedJava.daySecond.enums.Coffee;
import advancedJava.daySecond.enums.OrderCoffee;

public class Main {
    public static void main(String[] args) {
        OrderCoffee orderAmericano = new OrderCoffee(Coffee.AMERICANO, 20);
        OrderCoffee orderLate = new OrderCoffee(Coffee.LATTE, 10);
        OrderCoffee orderEspresss = new OrderCoffee(Coffee.ESPRESSO, 40);
//        OrderCoffee orderAmericano = new OrderCoffe(Coffe.FLAT_WHITE, 20);

        OrderCoffee[] orderedCoffees = {orderAmericano, orderEspresss, orderLate};
        for (OrderCoffee orderedCoffee: orderedCoffees) {
            System.out.println(orderedCoffee.getCoffee());
            System.out.println(orderedCoffee.getPrice());
            System.out.println(orderedCoffee.getCoffee().getMilk());
        }
    }

}
