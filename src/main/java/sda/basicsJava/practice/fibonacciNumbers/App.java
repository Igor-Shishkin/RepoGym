package sda.basicsJava.practice.fibonacciNumbers;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i obliczy liczbę Fibonacciego o wskazanym
indeksie. Przykładowo, jeśli użytkownik poda liczbę 5, Twój program powinien wypisać piątą liczbę Fibonacciego.
Kolejne liczby Fibonacciego powstają poprzez zsumowanie dwóch poprzednich liczb Fibonacciego.
Przykładowo, kilka pierwszych liczb Fibonacciego wynosi kolejno:

1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377…
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Java podstawy - Zadanie 7");
        Scanner in = new Scanner(System.in);
        int input = Integer.parseInt(in.nextLine());

        Obliczenia obl = new Obliczenia();

        int result = obl.Fib(input + 1);
        System.out.println("Liczba fib nr " + input + " to: " + result);

        result = obl.FibNieRekursywna(input);
        System.out.println("Liczba fib nr " + input + " to: " + result);

        // KalkulatorFibonacciego kalkulator = new KalkulatorFibonacciego();
        // int result = kalkulator.obliczKolejnaLiczbeFib(input);

        // System.out.println("Liczba fib: " + result);
        in.close();

    }
}