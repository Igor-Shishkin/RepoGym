package selfStudyJava.May.workWithAbstractionClassAndDate;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        Meat meat1 = new Meat("Pork", true,true, LocalDate.parse("2023-05-15"), 3);
        Meat meat2 = new Meat("Chicken", true, false
                , LocalDate.parse("2023-05-12"), (float) 1.5);
        DairyProducts milk = new DairyProducts("Milk", true, true
                ,LocalDate.parse("2023-05-14"), (byte)30);
        DairyProducts butter = new DairyProducts("Butter", true, false
                ,LocalDate.parse("2023-06-09"), (byte)20);
        DairyProducts cheese = new DairyProducts("Cheese", false, false
                ,LocalDate.parse("2023-06-30"), (byte)1);
        Fruit apples = new Fruit("Apples", false, false
                ,LocalDate.parse("2023-05-20"), (byte)12);
        System.out.println(meat1);
        System.out.println(meat2);
        System.out.println(milk);
        System.out.println(butter);
        System.out.println(cheese);
        System.out.println(apples);

        freeSpase(apples.space);
    }

    static void freeSpase (byte space) {
        if (space>0) {
            System.out.printf("%d percent free space in your fridge", space);
        } else if (space == 0) {
            System.out.println("Your fridge is full.");
        } else System.out.println("There are so many things in your fridge you can't close the door!");
    }
}