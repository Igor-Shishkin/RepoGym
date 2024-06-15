package concurrency.executorServiceTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        List<Integer> list = new ArrayList<>();

        try (ExecutorService executorService = Executors.newSingleThreadExecutor()
             ) {
            Random random = new Random();
            for (int i = 0; i < 1_000_000; i++) {
                executorService.submit(() -> list.add(random.nextInt(1000)+1));
            }
        } finally {
            long endTime = System.currentTimeMillis();
            long duration = endTime-startTime;
            OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
            System.out.println("average: " + average.toString() + "\nsize: " + list.size() + "\ntime: " + duration);
        }
    }
}
