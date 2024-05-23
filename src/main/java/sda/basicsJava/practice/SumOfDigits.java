package sda.basicsJava.practice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        String textNumber = in.nextLine();
        in.close();
        int number = 0;
        int sum = 0;

        for (int i = textNumber.length() - 1, k = 0; i >= 0 ; i--) {
            if (textNumber.charAt(i) > 47 && textNumber.charAt(i) < 58) {
                number += (textNumber.charAt(i) - 48) * Math.pow(10, k);
                k++;
            }
        }
        System.out.println("Your number is ".concat(String.valueOf(number)));

        for (int i = textNumber.length() - 1; i >= 0 ; i--) {
            sum += number % 10;
            number /= 10;
        } ;
        System.out.println("Sum of digits is ".concat(String.valueOf(sum)));
    }
}