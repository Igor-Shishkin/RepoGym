package selfStudyJava.codeWars.kyu5.StringIncrementer;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(incrementString(""));
        System.out.println("foobar");
        System.out.println(incrementString("foobar"));
        System.out.println("foobar0099");
        System.out.println(incrementString("foobar0099"));
        System.out.println("foobar001");
        System.out.println(incrementString("foobar001"));
        System.out.println("foobar99");
        System.out.println(incrementString("foobar99"));
        System.out.println("1");
        System.out.println(incrementString("1"));
        System.out.println("pUW~Po0k^6yn)<(G(*r-vff/");
        System.out.println(incrementString("pUW~Po0k^6yn)<(G(*r-vff/"));

    }

    public static String incrementString(String str) {
        // if str is "" or "0" or null
        if (Objects.equals(str, "") || Objects.equals(str, "0") || Objects.equals(str, null)) {
            return "1";
        }
        // if the last character is not a digit
        if (!(str.charAt(str.length() - 1) < 58 && str.charAt(str.length() - 1) > 47)) {
            return str+1;
        } else  // if the last character is '0'
            if (str.charAt(str.length() - 1) =='0') {
                str = str.substring(0, str.length()-1);
                return str+1;
            }
        int numberIndex = 0;
        int number = 0;
        // look at each character from the end and check if it is a digit
        for (int i = str.length()-1, k=0; i >= 0; i--, k++) {
            if (!(str.charAt(i) < 58 && str.charAt(i) > 47)) {
                break;
            }
            // calculate the number at the end
            number += Character.getNumericValue(str.charAt(i)) * Math.pow(10, k);

            numberIndex = (str.charAt(i) != '0') ? i : numberIndex;
            // if the digit isn't '9'
            if (str.charAt(i) != '9') {
                break;
            }
        }
        // if the whole str is a number
        if (numberIndex == 0) {
            return String.valueOf(number+1);
        }
        // if the whole number is 9 or 99 or 999 ...
        for (int i = 1; i < 8; i++) {
            if (number == Math.pow(10,i)-1 && str.charAt(numberIndex - 1) =='0') { numberIndex--; }
        }
        // cut the number
        str = str.substring(0,numberIndex);
        number++;
        return str + number;
    }
}
