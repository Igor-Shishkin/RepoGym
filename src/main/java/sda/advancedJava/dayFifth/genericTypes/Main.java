package sda.advancedJava.dayFifth.genericTypes;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        Cup coffeeCup = new Cup(coffee);
        coffeeCup.drink();

        Cup teaCup = new Cup(tea);
        teaCup.drink();

//        String skala = new String("Skała");
//        Cup rockCup = new Cup(skala);
//        rockCup.drink();
/*
        System.out.println("Lower Wildcard Limitations");
        List<Integer> intList = Arrays.asList(3,5,7,9);
        LowerWildcardLimitations.printLowerBounded(intList);

        List<Number> numberList = Arrays.asList(10.6, 12, 100.99);
        List<Long> longList = Arrays.asList(10L, 12L,13L);
        LowerWildcardLimitations.printLowerBounded(numberList);

        System.out.println("Upper Wildcard Limitations");
        List<Double> doubleList = Arrays.asList(10.5, 12.6, 33.33);
        System.out.println(UpperWildcardLimitations.sum(intList));
        System.out.println(UpperWildcardLimitations.sum(longList));
        System.out.println(UpperWildcardLimitations.sum(numberList));
        System.out.println(UpperWildcardLimitations.sum(numberList));
        System.out.println(UpperWildcardLimitations.sum(doubleList));

 */
    }
}
