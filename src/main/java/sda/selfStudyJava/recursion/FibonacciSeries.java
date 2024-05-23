package sda.selfStudyJava.recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int fibLength = 9;
        for (int i = 0; i < fibLength; i++) {
            System.out.printf("%d ", fib(i));
        }
        System.out.println(fib2(6));

    }

    private static int fib(int number) {
        if (number==0 || number==1) {
            return number;
        }
        return  fib(number-1) + fib(number - 2);
    }
    private static int fib2(int number) {
        if (number==0 || number==1) {
            return number;
        }
        int n1 = fib2(number-1);
        int n2 = fib2(number - 2);
        System.out.println("");
        System.out.println("number-1: " + n1 + "\tnumber-2: " + n2);
        return  n1 + n2;
    }
}
