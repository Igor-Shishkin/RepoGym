package selfStudyJava.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.printf("Factorial of 5 (recursion method): %d", countFactorialByRecursionMethod(-2));
        System.out.printf("\nFactorial of 5 (for method): %d", countFactorialByForMethod(5));
        System.out.println("\n\n");

//        for (int i = 1; i < 15; i++) {
//            System.out.printf("Factorial of %d (recursion method): %d\n", i, countFactorialByRecursionMethod(i));
//
//        }
    }



    public static long countFactorialByRecursionMethod(int number) {
        if (number == 1) {
            return number;
        }
        System.out.println(number);
        return number*countFactorialByRecursionMethod(number-1);
    }
    public static int countFactorialByForMethod(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
