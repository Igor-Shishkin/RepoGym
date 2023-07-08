package advancedJavaPractice.firstDay.solution.zad7;

import java.util.ArrayDeque;
import java.util.Queue;

public class Jacket {

	private final Queue<String> stack;
	private final int size;

	public Jacket(int size) {
		this.size = size;
		this.stack = new ArrayDeque<>();
	}

	public boolean loadBullet(String bullet) {
		if (stack.size() >= size) {
			return false;
		}

		stack.add(bullet);
		return true;
	}

	public boolean isLoaded() {
		return false;
	}

	public void shot() {

	}
}
