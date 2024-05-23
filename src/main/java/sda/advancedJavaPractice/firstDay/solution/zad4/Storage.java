package sda.advancedJavaPractice.firstDay.solution.zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {

	private final Map<String, List<String>> map;

	public Storage() {
		this.map = new HashMap<>();
	}

	public void addToStorage(String key, String value) {
		//check if the map contains the key
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

		/* Solution that uses specialized computeIfAbsent method
		List<String> strings = map.computeIfAbsent(key, s -> new ArrayList<>());
		strings.add(value);*/
	}

	public void printValues(String key) {
		List<String> values = map.get(key);
		if (values != null) {
			System.out.println("key: " + key + " = " + values);
		}
	}

	public void findKeysByValue(String value) {

		List<String> keys = new ArrayList<>();
		//iterate through values/entries (lists/entries)
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			//if list contains value, collect/print the key
			if(entry.getValue().contains(value)) {
				keys.add(entry.getKey());
			}
		}

		System.out.println(keys);
	}

	public void findKeysByValueWithStream(String value) {
		List<String> keys = map.entrySet()
				.stream()
				.filter(entry -> entry.getValue().contains(value))
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());

		if (keys.isEmpty()) {
			System.out.println("Brak kluczy dla podanej wartości.");
		} else {
			System.out.println("Klucze dla wartości " + value + ": " + keys);
		}
	}


}