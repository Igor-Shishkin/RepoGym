package myOwnProjects.taskManager;

public class WorkTask extends Tasks {
    private final String workPlace;
    private final Priority priority;
    public WorkTask (String t, String d, int time, String workPlace, Priority priority) {
        super(t, d, time);
        this.workPlace = workPlace;
        this.priority = priority;
    }
    public String toString () {
        return super.toString().concat("Place of work is ").concat(workPlace)
                .concat(". Priority of work: ").concat(getPriority().name());
    }

    public Priority getPriority() {
        return priority;
    }

}