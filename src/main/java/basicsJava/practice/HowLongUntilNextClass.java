package basicsJava.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika datę najbliższych Twoich zajęć w SDA i obliczy ile dni do nich pozostało.
Podpowiedź: datę wczytaj jako typ String i przeparsuj na LocalDate. Obecną datę pobierz z metody LocalDate.now().
 */


public class HowLongUntilNextClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("podaj datę najbliższych zajęć dd-MM-yyyy");
        String data = in.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate zajęcia = LocalDate.parse(data, formatter);
        LocalDate obecnaData = LocalDate.now();

        int daysUntil = obecnaData.until(zajęcia).getDays();
        int monthUntil = obecnaData.until(zajęcia).getMonths();

        System.out.println("Pozostało " + daysUntil + " dni i " + monthUntil + " miesięcy do najbliższych zajęć.");
    }
}