package advancedJava.dayThird.collections;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,5,4,89,0));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(23,5,13,71,0));
        List<Integer> l3 = new ArrayList<>(Arrays.asList(0,0,9));
        List<Integer> l4 = new ArrayList<>(Arrays.asList(11,-9,7));

        List<Integer> l5 = new ArrayList<>(l1);
        l5.addAll(l2);
        l5.addAll(l3);
        l5.addAll(l4);
        Collections.sort(l5, Comparator.reverseOrder());

        System.out.println(l5);
    }
}
