package advancedJavaPractice.firstDay.solution.zad3;

import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	private static void print(Map<String, Integer> map) {
		/*
		//Can be also done like this
		for (String key : map.keySet()) {
			Integer value = map.get(key);
		}*/

		int index = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			boolean isLastElement = index == map.size() - 1;
			if (isLastElement) {
				System.out.println("Klucz: " + key + ", Wartość: " + value + ".");
			} else {
				System.out.println("Klucz: " + key + ", Wartość: " + value + ",");
				//System.out.printf("Klucz: %s, Wartość: %d,\n", key, value);
			}
			index++;
		}
	}

	private static void printWithStream(Map<String, Integer> map) {
		System.out.println(map.entrySet().stream()
				.map(e -> "Klucz: " + e.getKey() + ", Wartość: " + e.getValue())
				.collect(Collectors.joining(",\n", "", ".")));
	}

	private static void printWithStreamKrzysiek(Map<String, Integer> map) {
		map.entrySet().stream()
				.peek(e -> System.out.println("Klucz: " + e.getKey() + ", Wartość: " + e.getValue()))
				.forEach( ignored -> {});
	}

	public static void main(String[] args) {
		/*Map<String, Integer> map = new HashMap<>();
		map.put("Java", 18);
		map.put("Python", 1);
		map.put("PHP", 0);*/
		Map<String, Integer> map = Map.of("Java", 18, "Python", 1, "PHP", 0);

		print(map);
		//printWithStream(map);
		//printWithStreamKrzysiek(map);
	}

}
