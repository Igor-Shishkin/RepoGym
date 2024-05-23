package sda.advancedJava.dayForth.lambdaExercises;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface hello = new HelloWorldInterface() {
            @Override
            public String sayHello() {
                return "Jestem w klasie abstrakcyjnej";
            }
        };
        System.out.println(hello.sayHello());

        HelloWorldInterface helloLambda = () -> "Hello LAMBDA";
        System.out.println(helloLambda.sayHello());
    }
}
