package sda.selfStudyJava.july.lambdaExamples.ExampleThree;

public class Main {
    public static void main(String[] args) {
        CompareStrings compareStrings = (s1, s2) -> (s1.length()>s2.length())?s1:s2;

        System.out.println("'Hello, world!' vs 'Hello, Sun!'");
        System.out.println(compareStrings.longer("Hello, world!", "Hello, Sun!"));

        System.out.println("'Hello, world!' vs 'Good morning, Earth!'");
        System.out.println(compareStrings.longer("Hello, world!", "Good morning, Earth!"));
    }
}
