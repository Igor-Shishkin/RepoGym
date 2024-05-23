package sda.selfStudyJava.codeWars.kyu6;

/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
which is the number of times you must multiply the digits in num until you reach a single digit.

For example (Input --> Output):

39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
4 --> 0 (because 4 is already a one-digit number)
 */

public class PersistentBugger {
    public static void main(String[] args) {

        long n = 999;
        System.out.println(persistence(n));


        /*
        int pb = 0;
        int temp = 1;
        while (n > 9) {
            String nText = Long.toString(n);
            for (int i = 0; i < nText.length(); i++) {
                temp *= n%10;
                n /= 10;
            }
            n = temp;
            temp = 1;
            pb++;
        }
        System.out.println(pb);*/
    }

    public  static int persistence (long n) {
        long m = 1, r = n;
        if (r/10 == 0) { return 0; }
        for (r=n; r != 0; r/=10) {
            m *= r%10;
        }
        return persistence(m) + 1;
    }
}