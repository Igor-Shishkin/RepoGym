package sda.basicsJava.practice;

import java.util.Scanner;

/*
Napisz program, który „się jąka”, to znaczy pobiera użytkownika tekst (zmienną typu String),
a następnie wypisuje podany tekst, w którym każde słowo wypisane jest po dwa razy. Przykładowo,
dla wejścia: „To jest mój test” program powinien wypisać „To To jest jest mój mój test test”.
 */

public class StutteringProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = in.nextLine().trim();

        System.out.println("how many times should I stutter?");
        int stutter = in.nextInt();

        text = text.replaceAll(" +"," ");

        String[] separatedWords = text.split(" ");
        for (String word : separatedWords) {
            for (int j = 0; j < stutter; j++) {
                String print = word;
                if (j != 0 && word.charAt(0) >= 65 && word.charAt(0) <= 90) {
                    print = word.toLowerCase();
                }
                if (j != stutter - 1 && word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == ',') {
                    print = word.substring(0, word.length() - 1);
                }
                System.out.print(print.concat(" "));
            }
        }
    }

}