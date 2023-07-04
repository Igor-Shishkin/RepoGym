package advancedJava.dayForth.models;

import com.google.common.collect.ImmutableList;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples2 {
    public static void main(String[] args) {
        List<Integer> numbers = ImmutableList.of(1,2,3,4,5,6,0,7,8,45,3434,5,4,0,0,-1,33,6);
        List<Integer> distinctNumbers = numbers
                .stream()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);

//        Set<Integer> distinctNumbers2 = numbers
//                .stream()
//                .collect(Collectors.toSet());
//        System.out.println(distinctNumbers);

        new HashSet<>(numbers).forEach(System.out::println);

        System.out.println("\n\n**********************************");
        //pobrać listę aut o kolorze 'Mauv' a potem pobrać z tych najtańsze









    }
}
