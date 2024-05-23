package sda.advancedJavaPractice.HomeWork.Exercise14;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static final Random random = new Random();
    public static final int MAX_NUMBER = 150000;
    public static final int ARRAY_LENGTH = 100000;
    public static void main(String[] args) {
        int[] arr = new int[ARRAY_LENGTH];

        fullArray(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> uniqueElementsList = getUniqueElements(arr);
        System.out.println(uniqueElementsList);

        //to understand how many times each element occurs in the array, I create a HashMap where the keys are the
        //elements of the array. The initial values are 1. If the element in the array is repeated,
        //the key value  is increased by 1
        Map<Integer, Integer> elementsDistribution = new HashMap<>();
        fullHushMap(elementsDistribution, arr);
        System.out.println("\nHashMap: ");
        System.out.println(elementsDistribution);

        List<Integer> Most25FrequentElements = get25MostFrequentElements(elementsDistribution);
        System.out.println("\n25 most frequent elements: ");
        System.out.println(Most25FrequentElements);

        System.out.println("\nRepeated elements: ");
        List<Integer> RepeatedElements = getRepeatedElements(elementsDistribution);
        System.out.println(RepeatedElements);

        System.out.println("\nReduplicated elements: ");
        List<Integer> ChangedDuplicatedElementsToUnique = changeDuplicatedElementsToUnique(elementsDistribution);
        System.out.println(ChangedDuplicatedElementsToUnique);

        RepeatedElements =getRepeatedElements(elementsDistribution);
        System.out.println("\nRepeated elements: ");
        System.out.println(RepeatedElements);

        System.out.println(elementsDistribution.size());
    }



    public static void fullArray (int[] arr) {
//        for (int element : arr) {         //dlaczego nie działą?
//            element = random.nextInt(1000000-500000);
//        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(MAX_NUMBER);
        }
    }
    public static List<Integer> getUniqueElements (int[] arr) {
         return Arrays.stream(arr).boxed()
                 .distinct()
                 .collect(Collectors.toList());
    }

    private static void fullHushMap(Map<Integer, Integer> map, int[] arr) {
        for (int j : arr) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            } else { //If the element in the array is repeated, the key value  is increased by 1
                int newValue = map.get(j)+1;
                map.put(j, newValue);
            }
        }
    }

    public static List<Integer> getRepeatedElements (Map<Integer, Integer> map) {
                return map.entrySet().stream()
                        //check is getValue is more than 1 (element occurs at least twice)
                        .filter(set -> set.getValue()>1)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());
    }
    public static List<Integer> get25MostFrequentElements (Map<Integer, Integer> map) {
        return map.entrySet().stream()
                //to display those elements that occur most often, we need to compare the values of the keys
                .sorted((a,b) -> -1*a.getValue().compareTo(b.getValue()))
                .map(Map.Entry::getKey)
                .limit(25)
                .collect(Collectors.toList());
    }
    public static List<Integer> changeDuplicatedElementsToUnique (Map<Integer, Integer> map) {
        //create a List to hold new elements
        List<Integer> elementsToAdding = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { //check every element
            if (entry.getValue() > 1) { //if it occurs more than 1 time:
                while (entry.getValue() != 1) {
                    int newKey;
                    do { //finding a number that does not belong to the key
                        newKey = random.nextInt(MAX_NUMBER);
                        //creating a new unique element of Map
                    } while (map.containsKey(newKey)|| elementsToAdding.contains(newKey));
                    //add new element to temporary List
                    elementsToAdding.add(newKey);
                    int newValue = entry.getValue() - 1; //it means, that
                    map.put(entry.getKey(), newValue);
                }

            }
        }
        //adding new elements to MAP
        for (int i : elementsToAdding) {
            map.put(i,1);
        }

 /*        ConcurrentModificationException :(
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { //check every element
            if (entry.getValue() > 1) { //if it occurs more than 1 time:
                while (entry.getValue() != 1) {
                    int newKey = 0;
                    do { //finding a number that does not belong to the key
                        newKey = random.nextInt(MAX_NUMBER);
                    } while (map.containsKey(newKey)); //creating a new unique element of Map
                    map.put(newKey,1);
                    int newValue = entry.getValue() - 1; //it means, that
                    map.put(entry.getKey(), newValue);
                }

            }
        }*/

 /*     ConcurrentModificationException :(
        Iterator<Map.Entry<Integer, Integer>> mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()){
            Map.Entry<Integer, Integer> entry = mapIterator.next();
            if (entry.getValue() > 1) { //if it occurs more than 1 time:
                while (entry.getValue() != 1) {
                    int newKey = 0;
                    do { //finding a number that does not belong to the key
                        newKey = random.nextInt(MAX_NUMBER);
                    } while (map.containsKey(newKey)); //creating a new unique element of Map
                    map.put(newKey,1);
                    int newValue = entry.getValue() - 1; //it means, that
                    map.put(entry.getKey(), newValue);
                }

            }
        }

  */
        return new ArrayList<>(map.keySet());
    }

}
