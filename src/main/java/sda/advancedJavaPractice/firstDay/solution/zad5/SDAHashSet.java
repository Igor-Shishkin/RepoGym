package sda.advancedJavaPractice.firstDay.solution.zad5;

import java.util.HashSet;
import java.util.Set;

public class SDAHashSet<E> {

	private final Set<E> set;

	public SDAHashSet() {
		set = new HashSet<>();
	}

	boolean add(E e) {
		return set.add(e);
	}
}
