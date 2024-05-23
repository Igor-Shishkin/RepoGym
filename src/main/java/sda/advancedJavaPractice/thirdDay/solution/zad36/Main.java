package sda.advancedJavaPractice.thirdDay.solution.zad36;

public class Main {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadPlaygroundRunnable("Yogi"));
		Thread thread2 = new Thread(new ThreadPlaygroundRunnable("BooBoo"));
		thread1.start();
		thread2.start();
	}

}
