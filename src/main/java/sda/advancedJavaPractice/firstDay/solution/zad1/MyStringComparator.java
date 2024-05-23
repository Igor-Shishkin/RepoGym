package sda.advancedJavaPractice.firstDay.solution.zad1;

import java.util.Comparator;

public class MyStringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
}
