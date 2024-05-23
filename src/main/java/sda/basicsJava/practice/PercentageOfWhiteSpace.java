package sda.basicsJava.practice;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika tekst (zmienną typu String) i policzy jakim procentem wszystkich
znaków tekstu był znak spacji.
 */

public class PercentageOfWhiteSpace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("this program calculates the percentage of the number of spaces in the text.\n"
                .concat("If there are two spaces in a row, they don't count. As well as spaces at the beginning and end."));
        System.out.println("Enter text:");
        String text = in.nextLine().trim();
        int counterSpace = 0;
        int length = text.length();

        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == ' ' && text.charAt(i+1) == ' ') {
                length--;
            }
            if (text.charAt(i) == ' ' && text.charAt(i+1) != ' ') {
                counterSpace++;
            }
        }

        if (counterSpace != 0) {
            float percentage =  ((float) counterSpace / text.length()) * 100;
            System.out.printf("Percentage of WhiteSpaces is: %.1f", percentage);
        } else {
            System.out.println("There aren't whiteSpaces in your text.");
        }
    }
}