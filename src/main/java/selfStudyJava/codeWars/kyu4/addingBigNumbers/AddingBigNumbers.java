package selfStudyJava.codeWars.kyu4.addingBigNumbers;

import java.math.BigInteger;


// Using classes from java.math is not allowed! (((
public class AddingBigNumbers {
    public static void main(String[] args) {
        String numberOne = "0000056";
        String numberTwo = "77";

        System.out.printf("%s + %s = %s", numberOne, numberTwo, addWithoutBigIntegers(numberOne, numberTwo));
    }

    // Using classes from java.math is not allowed! (((
    public static String add(String a, String b) {
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        return A.add(B).toString();
    }
    public static String addWithoutBigIntegers(String a, String b) {
        StringBuilder result = new StringBuilder("");
        boolean remainder = false;

        if (a.length()>1) {
            a = deleteZeroAtTheBeginning(a);
        }
        if (b.length()>1) {
            b = deleteZeroAtTheBeginning(b);
        }
        System.out.println(a + " : " + b);

        for (int i = a.length()-1, k = b.length()-1; i >= 0 || k >= 0 ; i--, k--) {
            int number1 = (i>=0) ? Character.getNumericValue(a.charAt(i)) : 0;
            int number2 = (k>=0) ? Character.getNumericValue(b.charAt(k)) : 0;

            int sum = (remainder) ? number1+number2+1 : number1+number2;
            remainder = false;
            if (sum > 9) {
                sum %= 10;
                remainder = true;
            }
            result.append(sum);
        }
        if (remainder) {
            result.append(1);
        }
        result.reverse();
        return result.toString();
    }

    public static String deleteZeroAtTheBeginning(String number) {
        for (int i = 0; i < number.length()-1; i++) {
            if (number.charAt(i) != '0') {
                return number.substring(i);
                }
        }
        return number;
    }
}
