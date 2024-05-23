package sda.advancedJavaPractice.firstDay.zad1;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List <String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        list1.add("world");
        list1.add("2Hi");
        list1.add("hello");
        list1.add("Earth");
        list1.add("123");

        System.out.println(list1);
        System.out.println(sortedListWithStream(list1));
        System.out.println(sortedListWithCollection(list1));
        System.out.println(sortedListWithCollection(list1));
        System.out.println(list1);
    }

    public static List<String> sortedListWithStream (List<String> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
    public static List<String> sortedListWithCollection (List<String> list) {
        List<String> sorted = new ArrayList<>(list);
        sorted.sort(Comparator.reverseOrder());
        return sorted;
    }
}
