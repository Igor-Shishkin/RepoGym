package myOwnProjects.taskManager;

public class FamilyTasks extends Tasks{

    private final FamilyMembers familyMembers;
    public FamilyTasks (String t, String d, int time, FamilyMembers familyMembers) {
        super(t, d, time);
        this.familyMembers = familyMembers;
    }

    @Override
    public String toString() {
        return super.toString().concat(String.format("You spend this time with %s", this.familyMembers.name()));
    }
}