package advancedJava.dayThird.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Jarek");
        names.add("Marek");
        names.add("Tadeusz");
        names.add("Arek");
        names.add("Jarek");

        if (names.contains("Marek")) {
            System.out.println("Element istnieje");
        }
        for (String name : names) {
            System.out.println(name);
        }
        /*
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.);
        }

        names.forEach(value -> System.out.println(value));
        names.forEach(System.out::println);
        */

        Set <Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.forEach(System.out::println);

        System.out.println("\n\nTree set (sort!): ");
        /*TreeSet*/Set <Integer> sortedSet = new TreeSet<>();
        sortedSet.add(1);
        sortedSet.add(17);
        sortedSet.add(3);
        sortedSet.add(2);
        sortedSet.add(23);
        sortedSet.forEach(System.out::println);

        System.out.println("\n\nSorting String (Tree): ");

        Set <String> sortedString = new TreeSet<>();
        sortedString.add("Igor");
        sortedString.add("igor");
        sortedString.add("igor");
        sortedString.add("Jan");
        sortedString.add("Jakub");
        sortedString.add("Piotr");
        sortedString.add("piotr");
        sortedString.add("IGOR");
        sortedString.add("Jaś");
        sortedString.forEach(System.out::println);

        System.out.println("\n\nLinkedHashSet (queue adding): ");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(13);
        linkedHashSet.add(13);
        linkedHashSet.add(13);
        linkedHashSet.add(13);
        linkedHashSet.add(41);
        linkedHashSet.add(17);
        linkedHashSet.add(991);
        linkedHashSet.add(61);
        linkedHashSet.add(1);
        linkedHashSet.forEach(number -> System.out.println(number));

        System.out.println("\n\nList - ArrayList -> mogą przechowywać powtarzalne elementy");
        List<Float> transfers = new ArrayList<>();
        System.out.println("Size: " + transfers.size());
        transfers.add(100.0f);
        transfers.add(110.2f);
        transfers.add(120.3f);
        transfers.add(100.0f);
        System.out.println("Size: " + transfers.size());
//        transfers.forEach(System.out::println);
        System.out.println("element[1] = " + transfers.get(1));
        transfers.add(1, 140.5f);
        System.out.println("Size: " + transfers.size());
        System.out.println("element[1] = " + transfers.get(1) + "\n");
        transfers.forEach(System.out::println);

        System.out.println("\n\nList -> LinkedList");
        List<String> letters = new LinkedList<>();
        System.out.println("LL.size: " + letters.size());
        letters.add("a");   // null | a | b
        letters.add("b");   // a | b | c
        letters.add("c");   // b | c | d
        letters.add("d");
        letters.add("e");
        letters.add("f");
        System.out.println("LL.size: " + letters.size());
        System.out.println("The first element: " + letters.get(1));
        letters.forEach(System.out::println);

        letters.add(1, "x");
        System.out.println("LL.size: " + letters.size());
        System.out.println("The first element: " + letters.get(1));
        letters.forEach(System.out::println);

        System.out.println("\n----------------queue---------------------\n");
        System.out.println("FIFO");
        Queue<String> surnames = new LinkedList<>();
        surnames.offer("Kowalski");
        surnames.offer("Marciniak");
        surnames.offer("Taciak");
        surnames.offer("Konski");
        surnames.offer("Webb");

        System.out.println(surnames.peek());
        System.out.println(surnames.peek());
        System.out.println(surnames.peek());
        System.out.println(surnames.poll());
        System.out.println("\n");
        System.out.println(surnames.remove());
        System.out.println(surnames.element());
        System.out.println("\n");

        surnames.forEach(System.out::println);

        System.out.println("\n----------------queue---------------------\n");
        Deque<Integer> deQueue = new ArrayDeque<>();
        deQueue.addFirst(10);
        deQueue.offerFirst(20);
        deQueue.addLast(30);
        deQueue.offerLast(40);
        deQueue.addLast(30);
        deQueue.offerLast(40);

        deQueue.forEach(System.out::println);

        System.out.println("\n----------------queue---------------------\n");
        Queue<Integer> lifoQueue = Collections.asLifoQueue(new ArrayDeque<>());
        lifoQueue.offer(1);
        lifoQueue.offer(2);
        lifoQueue.offer(3);
        lifoQueue.offer(1);
        lifoQueue.forEach(System.out::println);


        System.out.println("\n\n----------------MAPS---------------------\n");

        Map<String, Float> employees = new HashMap<>();
        employees.put(null, 3000.0f);
        employees.put("Jarek Cz", 3000.0f);
        employees.put("Piotr Ł", 3000.0f);
        employees.put("Mark K", 2500.0f);
        employees.put("Artur C", 3500.0f);
        employees.put("Adrian H", null);

        employees.entrySet().forEach(System.out::println);
        System.out.println("\n");
        employees.remove("Artur C");
        employees.entrySet().forEach(System.out::println);

        System.out.println("\n");
        System.out.println(employees.containsKey(null));

        for (Float value : employees.values()) {
            System.out.println("Salary: " + value);
        }

        System.out.println("\n\n----------------TreesMap---------------------\n");
        Map<Integer,Integer> sumOfDigits = new TreeMap<>();
        sumOfDigits.put(44, 8);
        sumOfDigits.put(11, 2);
        sumOfDigits.put(24, 6);
        sumOfDigits.put(13, 4);
        sumOfDigits.put(40, 4);
        sumOfDigits.entrySet().forEach(System.out::println);

        System.out.println("\n");

        Map<String,Integer> keyAsString = new TreeMap<>();
        keyAsString.put("a", 1);
        keyAsString.put("b", 1);
        keyAsString.put("aB", 1);
        keyAsString.put("ab", 1);
        keyAsString.put("A", 1);
        keyAsString.put("AaB", 1);
        keyAsString.put("AAA", 1);
        keyAsString.put("Ba", 1);
        keyAsString.entrySet().forEach(System.out::println);

        System.out.println("\n");
        System.out.println("\n\n----------------LinkedHashsMap---------------------\n");
        Map<Integer, String> employeesAge = new LinkedHashMap<>();
        employeesAge.put(33, null);
        employeesAge.put(23, "Jan");
        employeesAge.put(31, "Alek");
        employeesAge.put(29, "Michał");
        employeesAge.put(53, "Anna");
        employeesAge.put(19, null);
//        employeesAge.values().forEach(System.out::println);
//        employeesAge.keySet().forEach(System.out::println);
        employeesAge.entrySet().forEach(System.out::println);



        System.out.println("\n");


    }
}





























