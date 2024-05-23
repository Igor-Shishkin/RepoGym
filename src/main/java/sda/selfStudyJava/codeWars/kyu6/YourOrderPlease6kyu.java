package sda.selfStudyJava.codeWars.kyu6;

public class YourOrderPlease6kyu {
    /*
    Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
     */


    public static void main(String[] args) {
        String words = "is2 Thi1s T4est 3a";
        String[] separateWords = words.split(" ");
        words = "";

        for (int i = 0, k = 1; i < separateWords.length; i++){
            for (int j = 0; j < separateWords[i].length(); j++) {
                if (separateWords[i].charAt(j) == Character.forDigit(k, 10) ) {
                    words = words.concat(separateWords[i]);
                    if (k != separateWords.length) {
                        words = words.concat(" ");
                    }
                    k++;
                    i = -1;
                    break;
                }
            }
        }
        System.out.println(words);
    }
}
