package myOwnProjects.taskManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskManager {
    public final Scanner in = new Scanner(System.in);

    public final ArrayList<Tasks> listOfTask;

    public TaskManager() {
        listOfTask = new ArrayList<>();
    }

    public void addTask(FamilyTasks f) {
        listOfTask.add(f);
    }

    public void addTask(WorkTask w) {
        listOfTask.add(w);
    }

    public void addTask(StudyTasks s) {
        listOfTask.add(s);
    }

    public void addTask(HouseholdTasks h) {
        listOfTask.add(h);
    }

    public void addTask() {

        Priority priority = Priority.LOW;
        System.out.println("Please choose kind:\n1 - Family\n2 - Work\n3 - Study\n4 - House\nAny other symbol - come back");
        switch (in.nextLine()) {
            case "1":
                listOfTask.add(newFamilyTask());
                break;
            case "2":
                listOfTask.add(newWorkTask());
                break;
            case "3":
                listOfTask.add(newStudyTask());
                break;
            case "4" :
                listOfTask.add(newHouseHoldTask());
        }
    }

    public void showTasks(ArrayList<Tasks> l) {
        System.out.println("FAMILY TASKS:");
        for (Tasks t : l) {
            if (t instanceof FamilyTasks) {
                System.out.println(t);
            }

        }
        System.out.println("STUDY TASKS:");
        for (Tasks t : l) {
            if (t instanceof StudyTasks) {
                System.out.println(t);
            }

        }
        System.out.println("WORK TASKS:");
        for (Tasks t : l) {
            if (t instanceof WorkTask) {
                System.out.println(t);
            }

        }
        System.out.println("HOUSEHOLD TASKS:");
        for (Tasks t : l) {
            if (t instanceof HouseholdTasks) {
                System.out.println(t);
            }

        }
    }


    public int enterINT () {
        int a = 0;
        boolean check = false;
        while (!check) {
            try {
                a = in.nextInt();
                check  =true;
            } catch (InputMismatchException e) {
                System.out.println("It's not number");
                in.nextLine();
            }
        }
        in.nextLine();
        return a;
    }

    public FamilyTasks newFamilyTask () {
        String name = "";
        String description = "";
        int minutes = 0;
        System.out.print("Name of task: ");
        name = in.nextLine();
        System.out.print("Description: ");
        description = in.nextLine();
        System.out.print("How long is it in minutes per day: ");
        minutes = enterINT();
        System.out.print("Who of your family you will be with:\n1 - Wife\n2 - Son\n3 - Parents\n");
        FamilyMembers who = FamilyMembers.WIFE;
        switch (in.nextLine()) {
            case "2":
                who = FamilyMembers.SON;
                break;
            case "3":
                who = FamilyMembers.PARENTS;
        }
        return new FamilyTasks(name, description, minutes, who);
    }
    public WorkTask newWorkTask () {
        String name = "";
        String description = "";
        int minutes = 0;
        Priority priority = Priority.LOW;
        System.out.print("Name of task: ");
        name = in.nextLine();
        System.out.print("Description: ");
        description = in.nextLine();
        System.out.print("How long is it in minutes per day: ");
        minutes = enterINT();
        System.out.print("Where do you work: ");
        String workPlace = in.nextLine();
        System.out.print("What priority:\n1 - High\n2 - Middle\n3 - Low\n");
        switch (in.nextLine()) {
            case "2":
                priority = Priority.MIDDLE;
                break;
            case "1":
                priority = Priority.HIGH;
                break;
        }
        return new WorkTask(name, description, minutes, workPlace, priority);
    }
    public StudyTasks newStudyTask () {
        String name = "";
        String description = "";
        int minutes = 0;
        Priority priority = Priority.LOW;
        System.out.print("Name of task: ");
        name = in.nextLine();
        System.out.print("Description: ");
        description = in.nextLine();
        System.out.print("How long is it in minutes per day: ");
        minutes = enterINT();
        System.out.print("What priority:\n1 - High\n2 - Middle\n3 - Low\n");
        switch (in.nextLine()) {
            case "2":
                priority = Priority.MIDDLE;
                break;
            case "1":
                priority = Priority.HIGH;
                break;
        }
        int year = 0;
        int mouth = 0;
        int day = 0;
        System.out.print("Please enter the date by which you must complete the task\nYear: ");
        do {
            year = enterINT();
            if (year<LocalDate.now().getYear()) {
                System.out.print("There is no point to putting task in the past. Enter again: ");
            }
        } while (year<LocalDate.now().getYear());
        System.out.print("Mouth: ");
        do {
            mouth = enterINT();
            if (year==LocalDate.now().getYear() && mouth<LocalDate.now().getMonth().getValue()) {
                System.out.print("There is no point to putting task in the past. Enter again: ");
            }
        } while (year==LocalDate.now().getYear() && mouth<LocalDate.now().getMonth().getValue());
        System.out.print("Day: ");
        do {
            day = enterINT();
            if (year==LocalDate.now().getYear() && mouth==LocalDate.now().getMonth().getValue()
                    && day<LocalDate.now().getDayOfMonth()) {
                System.out.print("There is no point to putting task in the past. Enter again: ");
            }
        } while (year==LocalDate.now().getYear() && mouth==LocalDate.now().getMonth().getValue()
                && day<LocalDate.now().getDayOfMonth());
        return new StudyTasks(name, description, minutes, priority, year, mouth, day);
    }
    public HouseholdTasks newHouseHoldTask () {
        String name = "";
        String description = "";
        int minutes = 0;
        System.out.print("Name of task: ");
        name = in.nextLine();
        System.out.print("Description: ");
        description = in.nextLine();
        System.out.print("How long is it in minutes per day: ");
        minutes = enterINT();

        return new HouseholdTasks(name, description, minutes);
    }
    public void deleteTask () {
        for (int i = 0; i < listOfTask.size(); i++) {
            System.out.printf("%d. %s\n", i+1, listOfTask.get(i).getName());
        }
        System.out.print("Enter the number of the task you would like to delete: ");
        int number = enterINT();
        if (number>0 && number<= listOfTask.size()) {
            System.out.printf("Task '%s' is deleted\n",listOfTask.get(number-1).getName());
            listOfTask.remove(number-1);
        }
    }

    public String freeTime () {
        int freeTime = 1320;
        for (Tasks t : listOfTask) {
            freeTime -= t.getMinutesADay();
        }
        int freeHours = freeTime / 60;
        int freeMinutes = freeTime % 60;
        String sForHours = (freeHours != 1) ? "s" : "";
        return String.format
                ("You have %d hour%s and %d minutes to sleep.\n"
                                .concat("P.S. Two hours are reserved for meals and other routine activities.")
                        ,freeHours, sForHours, freeMinutes);
    }
}