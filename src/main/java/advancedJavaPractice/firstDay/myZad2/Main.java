package advancedJavaPractice.firstDay.myZad2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        list1.add("world");
        list1.add("2Hi");
        list1.add("hello");
        list1.add("Earth");
        list1.add("123");

        System.out.println(list1);
        System.out.println(sortCaseInsensitive(list1));
        System.out.println(sortCaseInsensitiveWithLambda(list1));
        System.out.println(sortedListCaseInsensitiveWithCollection(list1));
    }

    public static List<String> sortCaseInsensitive(List<String> list) {
        return list.stream()
                .sorted((o1, o2) -> -o1.compareToIgnoreCase(o2))
                .collect(Collectors.toList());
    }
    private static List<String> sortCaseInsensitiveWithLambda(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort((o1, o2) -> -o1.compareToIgnoreCase(o2));
        return sorted;
    }
    public static List<String> sortedListCaseInsensitiveWithCollection (List<String> list) {
        List<String> sorted = new ArrayList<>(list);
        sorted.sort(String::compareToIgnoreCase);
        sorted.sort(Comparator.reverseOrder());
        return sorted;
    }

}
