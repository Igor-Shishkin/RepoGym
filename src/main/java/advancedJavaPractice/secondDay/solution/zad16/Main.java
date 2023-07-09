package advancedJavaPractice.secondDay.solution.zad16;

import java.time.Duration;

public class Main {

	public static void main(String[] args) {
		System.out.println(Runner.getFitnessLevel(Duration.ofMinutes(300)));
		System.out.println(Runner.getFitnessLevel(Duration.ofMinutes(180)));
		System.out.println(Runner.getFitnessLevel(Duration.ofMinutes(150)));
		System.out.println(Runner.getFitnessLevel(Duration.ofMinutes(149)));

		System.out.println(Runner.INTERMEDIATE.getMax());
	}
}
