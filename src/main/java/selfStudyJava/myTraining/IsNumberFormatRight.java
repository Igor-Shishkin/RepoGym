package selfStudyJava.myTraining;

import java.util.regex.Pattern;

public class IsNumberFormatRight {
    public static void main(String[] args) {
        String numberOne = "+4878g948332";
        String numberTwo = "+4894888859";
        String numberThree = "+47888948332";
        String numberFour = "889483320";
        String regex = "(\\+?48)?\\d{9}";
        Pattern rightFormat = Pattern.compile(regex);

        System.out.printf("Format of number %s is right: %b\n", numberOne, rightFormat.matcher(numberOne).matches());
        System.out.printf("Format of number %s is right: %b\n", numberTwo, rightFormat.matcher(numberTwo).matches());
        System.out.printf("Format of number %s is right: %b\n", numberThree, rightFormat.matcher(numberThree).matches());
        System.out.printf("Format of number %s is right: %b\n", numberFour, rightFormat.matcher(numberFour).matches());
    }
}