package sda.selfStudyJava.codeWars.kyu4;

import java.util.Arrays;

/*
Given an n x n array, return the array elements arranged from outermost elements to the middle element,
traveling clockwise.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]
For better understanding, please follow the numbers of the next array consecutively:

array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]
This image will illustrate things more clearly:


NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array
in a clockwise snailshell pattern.

NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].
 */
public class Snail4kyu {
    public static void main(String[] args) {
        int[][] array = new int[0][0];
//                = {{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
        int[] result = new int[(int) Math.pow(array.length, 2)];

        if (array.length == 0) {
            result = new int[0];
        } else {

            int upperBound = 0;
            int lowerBound = array.length - 1;
            int leftBound = 0;
            int rightBound = array[0].length - 1;

            // 1-right  2-down  3-left  4-up
            int direction = 1;
            int x = 0;
            int y = 0;

            for (int i = 0; i < result.length; i++) {
                result[i] = array[y][x];
                switch (direction) {
                    case 1:
                        x++;
                        if (x == rightBound) {
                            direction = 2;
                            upperBound++;
//                        y++; x--;
                        }
                        break;
                    case 2:
                        y++;
                        if (y == lowerBound) {
                            direction = 3;
                            rightBound--;
//                        y--; x--;
                        }
                        break;
                    case 3:
                        x--;
                        if (x == leftBound) {
                            direction = 4;
                            lowerBound--;
                        }
                        break;
                    case 4:
                        y--;
                        if (y == upperBound) {
                            direction = 1;
                            leftBound++;
//                        y++; x++;
                        }
                        break;
                }
            }
        }
        System.out.println(Arrays.toString(result));

        System.out.println((int)Math.pow(0,2));

    }
}
























