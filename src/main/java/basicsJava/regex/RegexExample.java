package basicsJava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String nameOne = "J1an  h 21  ";
        String nameTwo = "   Barbara ";

        //String stringPattern = "[A-Z][a-z]+";
        //Pattern pattern = Pattern.compile(stringPattern);
        Pattern pattern = Pattern.compile("[A-Z][a-z 1]+");
        Pattern patternTwo = Pattern.compile("\\s+Barbara\\s+");
        Matcher matcherOne = pattern.matcher(nameOne);
        Matcher matcherTwo = pattern.matcher(nameTwo);
        Matcher matcherThree = patternTwo.matcher(nameTwo);

        System.out.println("Czy w pierwszym przypadku ciąg znakiew odpowiada wzorcowi: " + matcherOne.matches());
        System.out.println("Czy w drugim przypadku ciąg znakiew odpowiada wzorcowi: " + matcherTwo.matches());
        System.out.println("Czy w drugim przypadku ciąg znakiew odpowiada wzorcowi: " + matcherThree.matches());

        String text = "Hello_world_10";
        Pattern patternFour = Pattern.compile("[A-Za-z_0-9]+");

        Matcher matcherFour = patternFour.matcher(text);
        System.out.println(matcherFour.matches());

        String dateOne = "1-02-2024";
        String dateTwo = "14:05:2023";
        String dateThree = "26/05/2023";
        String dateFour = "19/01/1918";
        String dateFive = "19.01.1960";

        // 0?[1-9] - 01, 02, 03, 04 - 09, 1 - 9
// [12][0-9] - 10, 11, 12-19, 20, 21, 22-29
// 3[01] - 30, 31

// 1[012] - 10, 11, 12
// \\d{4} - zawiera 4 cyfry
        String regex = "(0?[1-9]|[12][0-9]|3[01])[-:/.](0?[1-9]|1[012])[-:/.]\\d{4}";
        Pattern patternDate = Pattern.compile(regex);
        Matcher matcherDateOne = patternDate.matcher(dateOne);
        System.out.println("Czy ciąg znaków dateOne odpowiada wzorcu: " + matcherDateOne.matches());

        Matcher matcherDateTwo = patternDate.matcher(dateTwo);
        System.out.println("Czy ciąg znaków dateTwo odpowiada wzorcu: " + matcherDateTwo.matches());

        Matcher matcherDateOThree = patternDate.matcher(dateThree);
        System.out.println("Czy ciąg znaków dateThree odpowiada wzorcu: " + matcherDateOThree.matches());

        Matcher matcherDateFour = patternDate.matcher(dateFour);
        System.out.println("Czy ciąg znaków dateFour odpowiada wzorcu: " + matcherDateFour.matches());

        Matcher matcherDateFive = patternDate.matcher(dateFive);
        System.out.println("Czy ciąg znaków dateFive odpowiada wzorcu: " + matcherDateFive.matches());

        String regexWithYear = "(0?[1-9]|[12][0-9]|3[01])[-:/.](0?[1-9]|1[012])[-:/.](19[7-9][0-9]|20[0-1][0-9]|202[0-3])";
        Pattern patternDateWithYear = Pattern.compile(regexWithYear);
        Matcher matcherDateOneWithYear = patternDateWithYear.matcher(dateOne);
        System.out.println("\n\nCzy ciąg znaków dateOne odpowiada wzorcu: " + matcherDateOneWithYear.matches());

        Matcher matcherDateFiveWithYear = patternDateWithYear.matcher(dateFive);
        System.out.println("Czy ciąg znaków dateFive odpowiada wzorcu: " + matcherDateFiveWithYear.matches());
    }


}
