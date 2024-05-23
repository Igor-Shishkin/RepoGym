package sda.selfStudyJava.codeWars.kyu6;

import java.util.ArrayList;


public class RectangleIntoSquares6kyu {
    public static void main(String[] args) {
        int lng = 5, wdth = 3;
        ArrayList<Integer> squares = new ArrayList<>();
        if (lng != wdth) {
            int min = Math.min(lng,wdth), max = Math.max(lng,wdth), temp1, temp2;
            while (min != max) {
                squares.add(min);
                temp1 = min;
                temp2 = max - min;
                min = Math.min(temp1,temp2);
                max = Math.max(temp1,temp2);
            }
            squares.add(min);
            System.out.println(squares);
        } else {
            System.out.println("null");
        }
    }
}
/*
The drawing below gives an idea of how to cut a given "true" rectangle into squares ("true" rectangle meaning that the
two dimensions are different).

Can you translate this drawing into an algorithm?
You will be given two dimensions

a positive integer length
a positive integer width
You will return a collection or a string (depending on the language; Shell bash, PowerShell, Pascal and Fortran return
a string) with the size of each of the squares.

Examples in general form:
(depending on the language)

  sqInRect(5, 3) should return [3, 2, 1, 1]
  sqInRect(3, 5) should return [3, 2, 1, 1]

  You can see examples for your language in **"SAMPLE TESTS".**
Notes:
lng == wdth as a starting case would be an entirely different problem and the drawing is planned to be interpreted
with lng != wdth. (See kata, Square into Squares.
Protect trees! http://www.codewars.com/kata/54eb33e5bc1a25440d000891 for this problem).

When the initial parameters are so that lng == wdth, the solution [lng] would be the most obvious but not in the
spirit of this kata so, in that case, return None/nil/null/Nothing or return {} with C++, Array() with Scala,
[] with Perl, Raku.
 */