package selfStudyJava.july.lambdaExamples.exampleTwo;

public class Main {
    public static void main (String[] args) {
        DivisionBy13 division = x -> x % 13 == 0;
        System.out.println("Is 26 evenly divisible by 13?\t" + division.isDivision(26));
        System.out.println("Is 15 evenly divisible by 13?\t" + division.isDivision(15));

    }
}
