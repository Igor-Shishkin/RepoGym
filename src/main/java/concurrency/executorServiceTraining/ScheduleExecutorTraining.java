package concurrency.executorServiceTraining;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorTraining {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        try (ScheduledExecutorService executorService = Executors.newScheduledThreadPool(cores-1)) {
            executorService.schedule(new TaskForSchedule("First"), 4, TimeUnit.SECONDS);
            executorService.schedule(new TaskForSchedule("Second"), 1, TimeUnit.SECONDS);
            executorService.schedule(new TaskForSchedule("Third"), 2, TimeUnit.SECONDS);
            executorService.schedule(new TaskForSchedule("Fourth"), 5, TimeUnit.SECONDS);
            executorService.schedule(new TaskForSchedule("Fifth"), 0, TimeUnit.SECONDS);
        } finally {
            System.out.println("Finish");
        }
    }
}
