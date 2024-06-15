package concurrency.executorServiceTraining;

public class TaskForSchedule implements Runnable{
    private final String name;

    public TaskForSchedule(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("Name: %s. TASK IS DONE%n", name);
    }
}
