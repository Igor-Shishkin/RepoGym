package myOwnProjects.taskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(new FamilyTasks("Romantic dinner", "talking, relaxing", 60, FamilyMembers.WIFE));
        taskManager.addTask(new FamilyTasks("Walk", "walk to a park, breath fresh air.", 90, FamilyMembers.SON));
        taskManager.addTask(new HouseholdTasks("Cleaning", "putting things in order", 30));
        taskManager.addTask(new StudyTasks("Learning JAVA", "working with materials of the course", 120,
                Priority.HIGH, 2023, 7, 31));
        taskManager.addTask(new HouseholdTasks("Cooking", "cooking meals for the family", 30));
        taskManager.addTask(new FamilyTasks("Talking to parents", "via WhatsUpp", 30, FamilyMembers.PARENTS));
        taskManager.addTask(new WorkTask("Teacher job", "teach kids math", 480, "school", Priority.MIDDLE));
        taskManager.addTask(new WorkTask("Сlass teacher job", "organize an excursion", 40,
                "school", Priority.MIDDLE));

        System.out.println("It's your TASK MANAGER. ");

        boolean exit = false;
        do {
            System.out.println("What would you like?\n"
                    .concat("1 - view tasks\n2 - add task\n3 - delete task\n4 - how much time for tasks per day\n0 - exit"));
            switch (in.nextLine()) {
                case "1" :
                    System.out.println();
                    taskManager.showTasks(taskManager.listOfTask);
                    System.out.println();
                    break;
                case "2" :
                    System.out.println();
                    taskManager.addTask();
                    System.out.println();
                    break;
                case "3" :
                    System.out.println();
                    taskManager.deleteTask();
                    System.out.println();
                    break;
                case "4" :
                    System.out.println();
                    System.out.println(taskManager.freeTime());
                    System.out.println();
                    break;
                case "0" :
                    exit = true;
                    System.out.println();
                    break;
            }

        } while (!exit);
        System.out.println("Good day :)");
    }
}