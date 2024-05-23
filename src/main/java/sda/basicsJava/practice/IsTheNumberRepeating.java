package sda.basicsJava.practice;

import java.util.ArrayList;
import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika dwie małe litery alfabetu łacińskiego (typ char) i wyliczy,
ile znaków stoi w alfabecie pomiędzy podanymi literami. Podpowiedź – skorzystaj z tablicy kodów ASCII
i traktuj znaki jak liczby int.
 */

public class IsTheNumberRepeating {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String textNumber;

        do {
            System.out.println("Enter a number (enter 'q' for ending):");
            textNumber = in.nextLine();
            try {
                numbers.add(Integer.parseInt(textNumber));
            } catch (NumberFormatException e) {
                if (!textNumber.equalsIgnoreCase("q")) {
                    System.out.println("Wrong number");
                }
            }
        } while (!textNumber.equalsIgnoreCase("q"));


        System.out.println("These numbers are repeated");
        boolean check;
        for (int i = 0; i < numbers.size() - 1; i++) {
            check = false;
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    if (check) {
                        numbers.remove(j);
                    } else {
                        check = true;
                        System.out.println(numbers.get(j));
                    }
                }
            }
        }

    }

}