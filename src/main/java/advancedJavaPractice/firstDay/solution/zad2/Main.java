package advancedJavaPractice.firstDay.solution.zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	private static List<String> sortCaseInsensitive(List<String> unsorted) {
		ArrayList<String> sorted = new ArrayList<>(unsorted);
		Collections.sort(sorted, String.CASE_INSENSITIVE_ORDER.reversed());
		return sorted;
	}

	private static List<String> sortCaseInsensitiveWithLambda(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		sorted.sort((o1, o2) -> -o1.compareToIgnoreCase(o2));
		return sorted;
	}

	private static List<String> sortWithStream(List<String> unsorted) {
		return unsorted.stream()
				//.sorted(String.CASE_INSENSITIVE_ORDER.reversed())
				.sorted((o1, o2) -> -o1.compareToIgnoreCase(o2))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<String> unsorted = List.of("A", "Z", "B", "d", "a", "c");
		System.out.println(unsorted);
		System.out.println(sortCaseInsensitive(unsorted));
		System.out.println(sortCaseInsensitiveWithLambda(unsorted));
	}

}
