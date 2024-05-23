package sda.selfStudyJava.codeWars.kyu6;

/*
assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, variabonacci.tribonacci(new double []{1,1,1},10), precision);
assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, variabonacci.tribonacci(new double []{0,0,1},10), precision);
assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, variabonacci.tribonacci(new double []{0,1,1},10), precision);
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class TribonacciSequence {
    public static void main(String[] args) {
        double[] s = new double[] {3.0, 2.0, 5.0};
        int n = 27;
        double[] t = new double [n];
        if (n < 4) {
            for (int i = 0; i < n; i++) {
                t[i] = s[i];
            }
        } else {
            for (int i = 0; i < 3; i++) {
                t[i] = s[i];
            }
            for (int i = 3; i < n; i++){
                t[i] = t[i-1] + t[i-2] + t[i-3];
            }
        }
        System.out.println(Arrays.toString(t));

    }
}
/*
Well, you may have guessed it by now, but to be clear: you need to create a fibonacci function that given a signature
array/list, returns the first n elements - signature included of the so seeded sequence.

Signature will always contain 3 numbers; n will always be a non-negative number; if n == 0, then return an empty array
 (except in C return NULL) and be ready for anything else which is not clearly specified ;)

If you enjoyed this kata more advanced and generalized version of it can be found in the Xbonacci kata

[Personal thanks to Professor Jim Fowler on Coursera for his awesome classes that I really recommend to any math
enthusiast and for showing me this mathematical curiosity too with his usual contagious passion :)]
 */