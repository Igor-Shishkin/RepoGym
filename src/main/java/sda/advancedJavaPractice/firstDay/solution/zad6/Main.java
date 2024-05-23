package sda.advancedJavaPractice.firstDay.solution.zad6;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	//or <Object, Object>
	public static void printFirstAndLast(TreeMap<?, ?> map) {
		System.out.println(map.firstEntry());
		System.out.println(map.lastEntry());
	}

	public static void main(String[] args) {
		printFirstAndLast(new TreeMap<>(Map.of("a", 10, "z", 2, "c", 3)));
		printFirstAndLast(new TreeMap<>(Map.of(5, 10, 4, 2, 1, 3)));
	}

}
