package sda.advancedJavaPractice.firstDay.solution.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	private static List<String> sortWithStream(List<String> unsorted) {
		return unsorted.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
	}

	private static List<String> sortWithCollections(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		// Collections.reverse(sorted); - not good, just reverses the order of elements
		Collections.sort(sorted, Collections.reverseOrder());
		return sorted;
	}

	private static List<String> sortWithList(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		//Collections.reverse(sorted); - not good, just reverses the order of elements
		sorted.sort(Comparator.reverseOrder());
		return sorted;
	}
	private static List<String> sortWithMyComparator(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		sorted.sort(new MyStringComparator());
		return sorted;
	}

	private static List<String> sortWithAnonymousClass(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		sorted.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		});
		return sorted;
	}

	private static List<String> sortWithLambda(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		sorted.sort((o1, o2) -> -o1.compareTo(o2));
		return sorted;
	}

	public static void main(String[] args) {
		List<String> unsorted = List.of("A", "Z", "B", "d", "a", "c");
		System.out.println(unsorted);
		System.out.println(sortWithCollections(unsorted));
		System.out.println(sortWithList(unsorted));
		System.out.println(sortWithMyComparator(unsorted));
		System.out.println(sortWithAnonymousClass(unsorted));
		System.out.println(sortWithLambda(unsorted));

		System.out.println(sortWithStream(unsorted));
	}

}
