package selfStudyJava.codeWars.kyu5.weightForWeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

/*

 */

public class WeightForWeight {
    public static void main(String[] args) {
        String strng = "2000 10003 1234000 44444444 9999 11 11 22 123";
        strng = strng.trim();
        strng = strng.replaceAll("\\s+", " ");
        String[] textNumbers = strng.split(" ");

        String finalStrng = strng;
        List<String> newOrderedList = Arrays.stream(textNumbers)
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        if (sumOfDigits(o1) != sumOfDigits(o2)) {
                            return Integer.compare(sumOfDigits(o1), sumOfDigits(o2));
                        } else {
                            return o1.compareTo(o2);
                        }
                    }
                })
                .collect(Collectors.toList());
        String result = "";
        for (String number : newOrderedList) {
            result += " " + number;
        }
        System.out.println(result.trim());

    }

    public static int sumOfDigits(String textNumber) {
        int sumOfDigits = 0;
        long number = Long.parseLong(textNumber);
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return sumOfDigits;
    }
}
