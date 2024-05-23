package sda.selfStudyJava.codeWars.kyu6;

/*
Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 */
public class BinaryRepresentation {
    public static void main(String[] args) {
        int number = 1234;
        String binary = Integer.toBinaryString(number);
        int counter = 0;
        for (int i = 0; i < binary.length(); i++) {
            counter = (binary.charAt(i) == '1') ? counter += 1 : counter;
        }
        System.out.println(counter);
    }
}