package selfStudyJava.recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int fibLength = 9;
        for (int i = 0; i < fibLength; i++) {
            System.out.printf("%d ", fib(i));
        }

    }

    private static int fib(int number) {
        if (number==0 || number==1) {
            return number;
        }
        return  fib(number-1) + fib(number - 2);
    }
}
