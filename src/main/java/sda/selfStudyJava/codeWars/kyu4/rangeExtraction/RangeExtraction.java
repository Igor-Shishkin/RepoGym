package sda.selfStudyJava.codeWars.kyu4.rangeExtraction;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class RangeExtraction {
    public static void main(String[] args) {
        int[] array = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20, 22,23,24};
        System.out.println(rangeExtraction(array));
        System.out.println("-10--8,-6,-3-1,3-5,7-11,14,15,17-20");
        System.out.println(Arrays.toString(array));

    }
    //it was not necessary to use the Deque, just wanted to remember a little and practice with it
    public static String rangeExtraction(int[] arr) {
        String result = "";
        Deque<Integer> rowIntegers = new LinkedList<>();
        boolean isRow = false;
        for (int i = 0; i < arr.length; i++) {
            //if a row of numbers continues
            if (isRow) {
                //is it the end of row?
                    if (arr[i-1] + 1 == arr[i]) {
                        rowIntegers.add(arr[i]);
                        //is it the end of array?
                        if (i == arr.length-1) {
                            result = String.format("%s,%d-%d", result, rowIntegers.getFirst(), rowIntegers.getLast());
                        }
                    } else {
                        //add to result
                        result = String.format("%s,%d-%d", result, rowIntegers.getFirst(), rowIntegers.getLast());
                        //go to current element
                        i--;
                        isRow = false;
                    }

            } else {
                if (i < arr.length-2) {
                    // is it row?
                    if (arr[i] + 1 == arr[i + 1] && arr[i] + 2 == arr[i + 2]) {
                        //isn't it the end of the array?
                        if (i < arr.length-3) {
                            //does the row consist from 3 elements?
                            if (arr[i] + 3 == arr[i + 3]) {
                                rowIntegers = new LinkedList<>();
                                rowIntegers.add(arr[i]);
                                isRow = true;
                            } else {
                                result = String.format("%s,%d-%d", result, arr[i], arr[i + 2]);
                                i+=2;
                            }
                        } else {
                            result = String.format("%s,%d-%d", result, arr[i], arr[i + 2]);
                            i+=2;
                        }

                    } else {
                        //add to result
                        result = result.concat(",").concat(Integer.toString(arr[i]));
                    }
                } else {
                    //add to result
                    result = result.concat(",").concat(Integer.toString(arr[i]));
                }
            }
        }
        //delete ',' at the beginning
        result = result.substring(1);
        return result;
    }

}
