package advancedJava.dayForth.lambdaExercises;

public class HelloWorldTraditional implements HelloWorldInterface{

    @Override
    public String sayHello() {
        return "Witaj się na kursie";
    }

    public static void main(String[] args) {
        HelloWorldInterface hello = new HelloWorldTraditional();
        System.out.println(hello.sayHello());
    }
}
