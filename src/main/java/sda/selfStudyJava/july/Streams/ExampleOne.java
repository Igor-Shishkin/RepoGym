package sda.selfStudyJava.july.Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleOne {
    public static void main(String[] args) {
        Integer[] arr = {1,4,5,6,8,8,9};
        Stream<Integer> stream = Arrays.stream(arr);

        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(23).add(-5).add(10).add(5).add(-1);
        Stream<Integer> stream2 = streamBuilder.build();

        Stream<Integer> combinedStream = Stream.concat(stream, stream2);

        List<Integer> list1 = combinedStream
                .filter(x -> x % 5 == 0)
                .peek(n -> System.out.print("\tFiltered: " + n))
                .map(n -> n * 3)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("\n\nList1: " + list1);
        System.out.println("combineStream: " + combinedStream.toString());

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(-1);
        list2.add(2);
        list2.add(5);

        System.out.println("list2: " + list2);
        System.out.println("modified list2: " + list2
                .stream()
                .filter(n -> n>1)
                .collect(Collectors.toList()));
        System.out.println("list2: " + list2);

        int max = list2.stream()
                .max(Integer::compare).get();




    }
}
