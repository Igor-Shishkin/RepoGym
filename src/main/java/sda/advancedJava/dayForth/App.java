package sda.advancedJava.dayForth;

import advancedJava.dayForth.animals.Lion;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //porównywanie 2 wartości x oraz y
       //jeżeli x.hashCode() == y.hashCode - x może być równy y
       // są równe tylko kiedy i hashCode i equals

       int x = 10;
       int y = 10;
        boolean comparisonOfPrimitives = x==y;
        System.out.println(comparisonOfPrimitives);

        Lion lion1 = new Lion("Simba", 3);
        Lion lion2 = new Lion("Kosma", 12);
        Lion lion3 = lion1;
        Lion lion4 = new Lion("Simba", 3);

        System.out.println(lion1);
        System.out.println(lion2);
        System.out.println(lion3);

        System.out.println("lion1=lion2: " + (lion1==lion2));
        System.out.println("lion1=lion3: " + (lion1==lion3));
        System.out.println("lion1=lion4: " + (lion1==lion4));

        System.out.println("lion1 equals lion4: " + (lion1.equals(lion4)));




        Car car1 = new Car("Syrenka", "Sport");
        Car car2 = new Car("Syrenka", "Sport");
        Car car3 = car1;

        System.out.println("________CARS_________");
        boolean equals1 = car1.equals(car2);
        boolean equals2 = car1.equals(car3);

        System.out.println("car1 ? car2 : " + equals1);
        System.out.println("car1 ? car3 : " + equals2);


    }

    private static class Car {
        private final String name;
        private final String type;
        public Car(String name, String type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Car)) return false;
            Car car = (Car) o;
            return Objects.equals(name, car.name) && Objects.equals(type, car.type);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, type);
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}






























