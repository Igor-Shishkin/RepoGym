package sda.advancedJavaPractice.thirdDay.solution.zad36;

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
				Thread.sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
