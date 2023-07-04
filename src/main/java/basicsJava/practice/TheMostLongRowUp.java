package basicsJava.practice;

import java.util.ArrayList;
import java.util.Scanner;
/*
Napisz program, który pobierze od użytkownika 10 liczb (zmiennych typu int) i wypisze długość najdłuższego takiego
podciągu tych liczb, który jest rosnący. Przykładowo, dla liczb: „1, 3, 8, 4, 2, 5, 6, 11, 13, 7” program powinien
wypisać „5” jako długość najdłuższego rosnącego podciągu (w przykładzie podkreślonego).
 */

public class TheMostLongRowUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Number #" + (i + 1));
            int number = scanner.nextInt();
            numbers.add(number);
        }

        System.out.println("List: ");
        System.out.println(numbers + "\n");

        int counter = 0;
        int max = 0;

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) < numbers.get(i + 1)) {
                counter++;
            } else {
                if (counter > max) {
                    max = counter;
                    counter = 0;
                }
            }
        }

        System.out.println(max + 1);
    }
}