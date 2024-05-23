package sda.basicsJava.practice;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.temporal.ChronoUnit;

/*
Napisz program, który pobierze od użytkownika datę najbliższych Twoich zajęć w SDA i obliczy ile dni do nich pozostało.
Podpowiedź: datę wczytaj jako typ String i przeparsuj na LocalDate. Obecną datę pobierz z metody LocalDate.now().
 */

public class HowLongUntilNextClassII {
    public static void main(String[] args) {
        System.out.println("Java podstawy zadanie 17.");
        String regex = "(\\d{4})-(\\d{2})-(\\d{2})";
        Pattern pattern = Pattern.compile(regex);

        int year = -1;
        int month = -1;
        int day = -1;

        LocalDate najblizsze_zajecia = null;

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj date najblizszych zajec w formacie RRRR-MM-DD.");
        String data = in.nextLine();
        Matcher matcher = pattern.matcher(data);



        if (matcher.matches()) {
            System.out.println(Integer.parseInt(matcher.group(1)));
            System.out.println(Integer.parseInt(matcher.group(2)));
            System.out.println(Integer.parseInt(matcher.group(3)));
            year = Integer.parseInt(matcher.group(1));
            month = Integer.parseInt(matcher.group(2));
            day = Integer.parseInt(matcher.group(3));

            najblizsze_zajecia = LocalDate.of(year, month, day);

        } else {
            System.out.println("Nie udalo sie przeparsowac daty.");
            System.exit(1);
        }

        long roznica_dni = ChronoUnit.DAYS.between(LocalDate.now(), najblizsze_zajecia);

        System.out.println(data);
        System.out.println(LocalDate.now());
        System.out.println("Roznica dni: " + roznica_dni);
    }
}