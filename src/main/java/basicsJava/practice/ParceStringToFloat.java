package basicsJava.practice;

import java.util.Scanner;

public class ParceStringToFloat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        String textNumber = in.nextLine();
        in.close();
        double number = 0;

        int commaIndex = textNumber.indexOf(",");
        int dotIndex = textNumber.indexOf(".");
        int separateIndex = Math.max(commaIndex, dotIndex);

        for (int i = separateIndex - 1, k = 1; i >= 0; i--) {
            number += Character.getNumericValue(textNumber.charAt(i)) * k;
            k *= 10;
        }

        double k = 0.1f;
        for (int i = separateIndex + 1; i < textNumber.length(); i++) {
            number += Character.getNumericValue(textNumber.charAt(i)) * k;
            k /= 10;
        }

        System.out.printf("Number is %.12f\n", number);

    }
}