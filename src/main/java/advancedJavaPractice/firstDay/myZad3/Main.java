package advancedJavaPractice.firstDay.myZad3;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 31);
        map.put("February", 28);
        map.put("March", 31);
        map.put("April", 30);
        map.put("May", 31);

        print(map);
        System.out.printf("\n\n");
        printStringFormat(map);

    }

    public static void print (Map<String,Integer> map) {
        map.forEach((key, value) -> System.out.printf("\"Klucz: %s, wartość: %d\n", key, value));
    }
    public static void printStringFormat (Map<String,Integer> map) {
        String result = "";
        for (Map.Entry <String,Integer> entry : map.entrySet()) {
            result += String.format("Klucz: %s, wartość: %d,\n", entry.getKey(), entry.getValue());
        }
        result = result.substring(0,result.length()-2);
        result += ".";
        System.out.print(result);
    }
    public static void printWithStream (Map<String,Integer> map) {
        System.out.printf(map.entrySet().stream()
                .map(e -> String.format("Klucz: %s, wartość: %d", e.getKey(), e.getValue()))
                .collect(Collectors.joining("\n",",",".")));
    }
}
