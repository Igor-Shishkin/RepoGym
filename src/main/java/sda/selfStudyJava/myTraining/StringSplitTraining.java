package sda.selfStudyJava.myTraining;

public class StringSplitTraining {
    public static void main(String[] args) {
        String textOne = "In a hole in the ground there lived a hobbit.";
        String textTwo = "In    a hole in the ground there lived a hobbit.";
        String textThree = " In a hole in the ground there lived a hobbit.";
        String textFour = "In a hole in the ground there lived a hobbit.  ";

        System.out.println(textOne.concat("\n")
                .concat(textTwo).concat("\n")
                .concat(textThree).concat("\n")
                .concat(textFour).concat("\n"));

        String[] wordsOne = textOne.split(" ");
        String[] wordsTwo = textTwo.split(" ");
        String[] wordsThree = textThree.split(" ");
        String[] wordsFour = textFour.split(" ");

        for (String word : wordsOne) {
            System.out.print(word.concat("|"));
        }
        System.out.println("");
        for (String word : wordsTwo) {
            System.out.print(word.concat("|"));
        }
        System.out.println("");for (String word : wordsThree) {
            System.out.print(word.concat("|"));
        }
        System.out.println("");for (String word : wordsFour) {
            System.out.print(word.concat("|"));
        }
        System.out.println("");
    }
}