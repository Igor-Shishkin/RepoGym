package selfStudyJava.july.lambdaExamples.ExampleFour;

public class Main {
    public static void main(String[] args) {
        Discriminant d = (a, b, c) -> (float) Math.pow(b,2) - 4*a*c;

        System.out.println("Discriminant of quadratic equation '30x^2 + 4x - 10' is: "
                + d.discriminant(30, 4, -10));
        System.out.println("Discriminant of quadratic equation '43x^2 + 1x + 30' is: "
                + d.discriminant(43, 1, 30));
    }
}
