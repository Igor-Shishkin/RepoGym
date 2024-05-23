package sda.basicsJava.practice;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {


    public static void main(String[] args) {
        int[] array = generateRandomArray();
        int temp = 0;
        boolean done = false;


        do {
            done = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    done = false;
                }
            }

            System.out.println(Arrays.toString(array));
        } while (!done);

    }


    public static int[] generateRandomArray() {
        int[] randomArray = new int[20];
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(20);
        }

        return randomArray;
    }
}