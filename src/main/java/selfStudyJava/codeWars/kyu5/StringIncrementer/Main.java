package selfStudyJava.codeWars.kyu5.StringIncrementer;

public class Main {
    public static void main(String[] args) {
        System.out.println("foobar");
        System.out.println(incrementString("foobar"));
        System.out.println("foobar0099");
        System.out.println(incrementString("foobar0099"));
        System.out.println("foobar001");
        System.out.println(incrementString("foobar001"));
        System.out.println("foobar99");
        System.out.println(incrementString("foobar99"));

    }

    public static String incrementString(String str) {
        if (!(str.charAt(str.length() - 1) < 58 && str.charAt(str.length() - 1) > 46)) {
            return str+1;
        } else if (str.charAt(str.length() - 1) =='0') {
            str = str.substring(0, str.length()-1);
            return str+1;
        }
        int numberIndex = 0;
        int number = 0;
        for (int i = str.length()-1, k=0; i > 0; i--, k++) {
            if (str.charAt(i) < 58 && str.charAt(i)> 46) {
                number += Character.getNumericValue(str.charAt(i)) * Math.pow(10, k);
                numberIndex = (str.charAt(i)!='0') ? i : numberIndex;
            } else {
                i = 0;
            }
        }
        for (int i = 1; i < 8; i++) {
            if (number == Math.pow(10,i)-1 && str.charAt(numberIndex - 1) =='0') { numberIndex--; }
        }
        str = str.substring(0,numberIndex);
        number++;
        return str + number;
    }
}
