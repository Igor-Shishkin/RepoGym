package selfStudyJava.june.hashMapTraining;

import java.util.HashMap;

public class TrainingOne {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("John", 33);
        hashMap.put("George", 7);
        hashMap.put("Tom", 50);

        System.out.println(hashMap.size());
        System.out.println(hashMap.get("John"));
        System.out.println(hashMap.get("Tom"));
        System.out.println(hashMap.containsKey("Tom"));
        hashMap.remove("Tom");
        System.out.println(hashMap.containsKey("Tom"));
        System.out.println(hashMap.containsValue(7));
    }
}