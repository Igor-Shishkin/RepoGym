package myOwnProjects.taskManager;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class StudyTasks extends Tasks{
    private final LocalDate deadLine;
    private final Priority priority;
    public StudyTasks (String t, String d, int time, Priority priority, int year, int mouth, int day) {
        super(t, d, time);
        this.priority = priority;
        this.deadLine = LocalDate.of(year, mouth, day);
    }
    public long howLong (LocalDate date) {
        return ChronoUnit.DAYS.between(LocalDate.now(), date);
    }

    public String toString() {
        return super.toString()
                .concat(String.format(" Prioriry: %s\nDeadLine: %td %tb %tY\t\tDay left: %d", priority.name()
                        ,deadLine, deadLine, deadLine, howLong(deadLine)));
    }


}