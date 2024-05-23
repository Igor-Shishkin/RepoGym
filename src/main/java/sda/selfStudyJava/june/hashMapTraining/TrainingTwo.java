package sda.selfStudyJava.june.hashMapTraining;

import java.util.HashMap;
import java.util.Map;

public class TrainingTwo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1 = new HashMap<>();
        HashMap<Integer,String> hm2 = new HashMap<>();

        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        System.out.println(hm1);
        System.out.println(hm2);

        for (Map.Entry<Integer,String> hm : hm1.entrySet()) {
            System.out.println(hm.getKey() + " ".concat(hm.getValue()) );
        }

        System.out.println();

        for (int e : hm2.keySet()) {
            System.out.print(e+"\t");
            System.out.println(hm2.get(e));
        }

        System.out.println(hm1.hashCode());
    }
}