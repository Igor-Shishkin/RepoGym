package advancedJava.dayFifth.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SleepingThreadIsInterruptedCheck implements Runnable{
    @Override
    public void run() {
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            ints.add(new Random().nextInt(100));
        }
        if (Thread.currentThread().isInterrupted()) {
            System.out.println("Przerwano mi");
            return;
        }
        Long sum = ints
                .stream()
                .mapToLong(x -> x)
                .sum();
        System.out.println("Summa liczb to: " + sum);
    }
}
