package basicsJava.practice;

import java.util.Scanner;

public class IsWordsPolindrom {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine().toLowerCase();
        userInput = userInput.replaceAll("\\s", "");
        char[] array = userInput.toCharArray();

        int counter = 0;

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            if (array[i] == array[j]) {
                counter++;
            }
        }

        if (counter == array.length) {
            System.out.println("Tekst jest palindromem");
        } else {
            System.out.println("Tekst nie jest palindromem");
        }
    }


        /*Scanner keyBoardScanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = keyBoardScanner.nextLine();
        word = word.toUpperCase();
        String backwardWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            backwardWord += word.charAt(i);
        }
        System.out.println("Is your word is polydrome?  " + word.equals(backwardWord) );


        String userInput = keyBoardScanner.nextLine().toLowerCase();
        userInput = userInput.replaceAll("\\s", "");
        char[] array = userInput.toCharArray();
        int counter = 0;

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            if (array[i] == array[j]) {
                counter++;
            }
        }

        if (counter == array.length) {
            System.out.println("Tekst jest palindromem");
        } else {
            System.out.println("Tekst nie jest palindromem");
        }
    }*/

        /*
        Scanner keyBoardScanner = new Scanner(System.in);
        System.out.print("Enter word: ");

        String word = keyBoardScanner.nextLine();
        StringBuilder backwardWord = new StringBuilder();
        backwardWord.append(word).reverse();

        System.out.println("Is your word is polydrome?  " + word.equalsIgnoreCase(backwardWord.toString()) );
        */


}