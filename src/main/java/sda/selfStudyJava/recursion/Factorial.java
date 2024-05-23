package sda.selfStudyJava.recursion;

public class Factorial {
    public static void main(String[] args) {
//        System.out.printf("Factorial of 5 (recursion method): %d", getFactorial(5));
////        System.out.printf("\nFactorial of 5 (for method): %d", countFactorialByForMethod(5));
//        System.out.println("\n\n");
//
//        printFactorialsRow(5);

//        for (int i = 1; i < 15; i++) {
//            System.out.printf("Factorial of %d (recursion method): %d\n", i, countFactorialByRecursionMethod(i));
//
//        }
        System.out.println(isEven(11));
    }



    public static int getFactorial(int number) {
        if (number == 1) {
            return number;
        }
        return number * getFactorial(number-1);
    }


    public static void printFactorialsRow(int number){
        System.out.println("Factorial of " + number + " is " + getFactorial(number));
        if (number > 1) {
            printFactorialsRow(number - 1);
        }
    }


    public static int countFactorialByForMethod(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isEven (int number) {
        if (number == 0) {
            return true;
        } else if (number == 1) {
            return false;
        }
        System.out.println(number);
        return isEven(number - 2);
    }
}
