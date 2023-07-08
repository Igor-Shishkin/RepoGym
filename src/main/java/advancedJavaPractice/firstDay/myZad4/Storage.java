package advancedJavaPractice.firstDay.myZad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private final Map<String, List<String>> map;

    public Storage () {
        this.map = new HashMap<>();
    }

    public void findValuesByKey(String key) {
        List<String> values = map.get(key);
        if (values != null) {
            System.out.println("key: " + key + " = " + values);
        }
    }
    public void findKeysByValue(String value) {
        for (Map.Entry<String, List<String>> entry : this.map.entrySet()) {
            for (String element : entry.getValue()) {
                if (element.equalsIgnoreCase(value)) {
                    System.out.println(entry.getKey());
                }
            }
        }
//        List<String> keys = map.entrySet()
//                .stream()
//                .filter(entry -> entry.getValue().contains(value))
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//
//        if (keys.isEmpty()) {
//            System.out.println("Brak kluczy dla podanej wartości.");
//        } else {
//            System.out.println("Klucze dla wartości " + value + ": " + keys);
//        }
    }

    public void addToStorage(String key, String value) {

        boolean exists = map.containsKey(key);

        //if no => create a List with 1 element
        if(!exists) {
            List<String> values = new ArrayList<>();
            values.add(value);
            map.put(key, values);
        }
        //if yes => get the list and append the new element
        else {
            List<String> values = map.get(key);
            values.add(value);
        }

//        if (this.map.containsKey(key)) {
//            List<String> values = new ArrayList<>();
//            values. (this.map.get(key))
//            values.add(value);
//            this.map.put(key, values);
//        } else {
//            this.map.put(key, List.of(value));
//        }
    }
//    public void addToStorage(String key, List<String> value) {
//        this.map.put(key, value);
//    }

    @Override
    public String toString() {
        return "Storage{" +
                "map=" + map +
                '}';
    }
}
