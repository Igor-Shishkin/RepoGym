package sda.advancedJavaPractice.thirdDay.solution.zad37;

import java.util.Random;

public class ThreadPlaygroundRunnable implements Runnable {

	private final String name;

	public ThreadPlaygroundRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + name + ":" + i);
			try {
				Thread.sleep(new Random().nextInt(100));
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
