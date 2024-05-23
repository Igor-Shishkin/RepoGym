package sda.advancedJavaPractice.thirdDay.solution.zad34;

public class Main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		Thread thread1 = new MyThread();
		Thread thread2 = new MyThread();
		thread1.start();
		thread2.start();
	}
}
