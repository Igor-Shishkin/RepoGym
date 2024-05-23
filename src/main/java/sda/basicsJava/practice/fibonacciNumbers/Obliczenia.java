package sda.basicsJava.practice.fibonacciNumbers;

public class Obliczenia {
    int Fib(int ktora) {
        if (ktora <= 1) {
            return ktora;
        }

        return Fib(ktora - 1) + Fib(ktora - 2);
    }

    int FibNieRekursywna(int ktora) {
        if (ktora <= 1) {
            return ktora;
        }

        int fibNMinus1 = 1;
        int fibNMinus2 = 1;
        int fibN = 0;

        // fibNMinus2 -> fibNMinus1 -> fibN
        // fibN <- fibNMinus2 + fibNMinus1

        for (int i = 2; i <= ktora; i++) {
            fibN = fibNMinus1 + fibNMinus2;
            fibNMinus2 = fibNMinus1;
            fibNMinus1 = fibN;
        }

        return fibN;
    }

}