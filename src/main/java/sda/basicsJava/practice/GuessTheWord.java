package sda.basicsJava.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class GuessTheWord {
    private static final Scanner keyBoardScanner = new Scanner(System.in);
    public static void main(String[] args) {

        String theWord = randomWord();
        char[] knownWord = new char [theWord.length()];
        byte livesLeft = 3;
        byte counterRight = 0;
        for (int i = 0; i < knownWord.length; i++) {
            knownWord[i] = ' ';
        }

        do {
            boolean isTrue = false;

            System.out.println("Word: ".concat(Arrays.toString(knownWord)));

            char guessLetter = guessLetter();
            for (int i = 0; i < knownWord.length; i++) {
                if (theWord.charAt(i) == guessLetter) {
                    knownWord[i] = guessLetter;
                    counterRight++;
                    isTrue = true;
                }
            }
            if (isTrue) {
                System.out.println("You guessed it!");
            } else {
                livesLeft--;
            }
            if (counterRight == theWord.length()) {
                break;
            } else {
                System.out.printf("You have %d live%s left\n", livesLeft, (livesLeft==1)?"":"s");
            }
            System.out.println("");
        } while (livesLeft>0);

        System.out.print("The word is: ");
        if (keyBoardScanner.nextLine().equals(theWord)) {
            System.out.println("You WIN!!!");
        } else {
            System.err.println("WRONG");
        }
    }

    static String randomWord () {
        String[] setOfWord = new String[] {
                "apple",
                "pear",
                "pineapple",
                "cucumber",
                "banana",
                "orange",
                "carrot"
        };
        Random generator = new Random();
        return setOfWord[generator.nextInt(setOfWord.length-1)];
    }

    static char guessLetter () {
        System.out.print("Try guess a letter: ");
        Pattern checkLetter = Pattern.compile("[a-z]");
        String tryLetter;
        do {
            tryLetter = keyBoardScanner.nextLine();
            if (!checkLetter.matcher(tryLetter).matches()) {
                System.out.println("This isn't a letter. Try once again.");
            }
        } while (!checkLetter.matcher(tryLetter).matches());
        char letter = tryLetter.charAt(0);
        return letter;
    }
}