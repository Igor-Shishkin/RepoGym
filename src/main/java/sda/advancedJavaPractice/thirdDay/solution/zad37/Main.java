package sda.advancedJavaPractice.thirdDay.solution.zad37;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 10; i++) {
			executorService.submit(new ThreadPlaygroundRunnable("Yogi_"+i));
			System.out.println("submitted: "+ i);
		}
		System.out.println("All submitted");
	}
}
