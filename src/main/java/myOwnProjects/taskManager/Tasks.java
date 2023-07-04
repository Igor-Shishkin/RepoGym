package myOwnProjects.taskManager;
import java.time.LocalDate;

abstract class Tasks {
    private final int minutesADay;
    private final String task;
    private final String description;

    public Tasks (String t, String d, int time) {
        task = t;
        description = d;
        minutesADay = time;
    }

    public String toString() {
        return String.format("%s: %s. You dedicate %d minutes a day for it."
                ,task, description, minutesADay);
    };

    public String getName () {
        return this.task;
    }
    public int getMinutesADay() { return this.minutesADay; }
}