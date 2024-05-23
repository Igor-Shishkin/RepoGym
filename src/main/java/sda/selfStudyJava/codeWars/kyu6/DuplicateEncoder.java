package sda.selfStudyJava.codeWars.kyu6;

public class DuplicateEncoder {
    public static void main(String[] args) {
        String word = "   ()(   abA";
        System.out.println("))))()))))()");
        word.toLowerCase()
                .chars()
                .mapToObj(i -> String.valueOf((char)i))
                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                .forEach(System.out::print);




        /*
        word = word.toUpperCase();
        String result = "";
        for (int i = 0; i < word.length()-1; i++) {
            char c = word.charAt(i);
            result += (word.indexOf(c)==word.lastIndexOf(c)) ? "(" : ")";
        }
        System.out.println(result);
        */

        /*
        int exc = -1;
        if (word.indexOf(')')==word.lastIndexOf(')')){
            exc = word.indexOf(')');
        }
        for (char c : word.toCharArray()) {
            if (c!=')') {
                if (word.indexOf(c) != word.lastIndexOf(c)) {
                    word = word.replace(Character.toString(c), ")");
                }
            }
        }
        word = word.replaceAll("[^)]", "(");

        if (exc!=-1) {
            System.out.println(word.substring(0, exc) + "(" + word.substring(exc+1));
        } else {
            System.out.println(word);
        }
        System.out.println("))))())))");
        */
    }
}
