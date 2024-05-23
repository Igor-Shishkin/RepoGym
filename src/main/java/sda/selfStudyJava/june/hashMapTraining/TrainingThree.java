package sda.selfStudyJava.june.hashMapTraining;

import java.util.HashMap;
import java.util.Map;

public class TrainingThree {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name","Igor");
        map.put("Address", "Polska");

        System.out.println("Map :".concat(map.toString()));

        map.compute("name", (key,val) -> (val != null) ? val.concat(" Shishkin") : val);
        map.compute("Address", (key,val) -> val.concat(", Poznań"));

        System.out.println("New Map :".concat(map.toString()));


        Map<String, Integer> m2 = new HashMap<>();

        m2.put("Key1", 20);
        m2.put("Key2", 7);

        System.out.println(m2);

        m2.compute("Key1", (k,v) -> (v==null) ? 1 : v-10);
        m2.compute("Key2", (k,v) -> (v==null) ? 0 : v+5);

        System.out.println(m2);

    }
}