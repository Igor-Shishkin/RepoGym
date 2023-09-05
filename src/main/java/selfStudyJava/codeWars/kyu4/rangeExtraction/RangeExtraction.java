package selfStudyJava.codeWars.kyu4.rangeExtraction;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class RangeExtraction {
    public static void main(String[] args) {
        int[] array = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        System.out.println(rangeExtraction(array));
        System.out.println("-10--8,-6,-3-1,3-5,7-11,14,15,17-20");
        System.out.println(Arrays.toString(array));

    }
    public static String rangeExtraction(int[] arr) {
        String result = "";
        Deque<Integer> rowIntegers = new LinkedList<>();
        boolean isRow = false;
        for (int i = 0; i < arr.length; i++) {
            if (isRow) {
                    if (arr[i-1] + 1 == arr[i]) {
                        rowIntegers.add(arr[i]);
                        if (i == arr.length-1) {
                            result = String.format("%s,%d-%d", result, rowIntegers.getFirst(), rowIntegers.getLast());
                        }
                    } else {
                        result = String.format("%s,%d-%d,%d", result, rowIntegers.getFirst(), rowIntegers.getLast(),
                                arr[i]);
                        isRow = false;
                    }

            } else {
                if (i < arr.length-2) {
                    if (arr[i] + 1 == arr[i + 1] && arr[i] + 2 == arr[i + 2]) {
                        rowIntegers = new LinkedList<>();
                        rowIntegers.add(arr[i]);
                        isRow = true;
                    } else {
                        result = result.concat(",").concat(Integer.toString(arr[i]));
                    }
                } else {
                    result = result.concat(",").concat(Integer.toString(arr[i]));
                }
            }
        }

        return result;
    }

}
