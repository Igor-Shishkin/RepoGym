package selfStudyJava.May.workWithTimeAndDate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class UsersAge {
    static  Scanner keyBoardScanner = new Scanner(System.in);
    static final LocalDate presentDate = LocalDate.now();

    public static void main(String[] args) {

        System.out.println("Please enter the date do your birthday. ");
        int year;
        byte month;
        byte day;

        year = whichYear();
        month = whichMonth(year);
        day = whichDay(year, month);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthdayDate = LocalDate.of(year, month, day);
        Period period = Period.between(birthdayDate, presentDate);

        System.out.println("You was born: ".concat(formatter.format(birthdayDate)));
        System.out.printf("Period between date of your birth and the present time is:\n%d days\n%d month\n%d years"
                ,period.getDays(), period.getMonths(), period.getYears());

        long quantityWeek = birthdayDate.until(presentDate, ChronoUnit.WEEKS);
        long quantityDays = birthdayDate.until(presentDate, ChronoUnit.DAYS);
        long quantityMonth = birthdayDate.until(presentDate, ChronoUnit.MONTHS);

        System.out.printf("\nOR:\nSince your birth has passed:\n%d days\tor\n%d weeks\tor\n%d months."
                ,quantityDays, quantityWeek, quantityMonth);
    }

    static int whichYear() {
        boolean rightFormat = false;
        int year = 0;
        while (!rightFormat) {
            System.out.print("Year: ");
            if (keyBoardScanner.hasNextInt()) {
                year = keyBoardScanner.nextInt();
                if (year <= presentDate.getYear()) {
                    rightFormat = true;
                } else {
                    System.err.println("Apparently you were born in the future. "
                            .concat("Sorry, but this program does not cater to time travelers."));
                }
            } else {
                System.err.println("Wrong format. Try once more time.");
            }
        }
        return year;
    }

    static byte whichMonth (int year) {
        boolean rightFormat = false;
        byte month = 0;
        while (!rightFormat) {
            System.out.print("Month: ");
            if (keyBoardScanner.hasNextByte()) {
                month = keyBoardScanner.nextByte();
                if (year == presentDate.getYear() && month > presentDate.getMonthValue()) {
                    System.err.println("Apparently you were born in the future. "
                            .concat("Sorry, but this program does not cater to time travelers."));
                } else {
                    if (month < 13) {
                        rightFormat = true;
                    }else {
                        System.err.println("Wrong format. Try once more time.");
                    }
                }
            } else {
                System.err.println("Wrong format. Try once more time.");
            }
        }
        return month;
    }

    static byte whichDay (int year, byte month) {
        boolean rightFormat = false;
        byte day = 0;
        while (!rightFormat) {
            System.out.print("Day: ");
            if (keyBoardScanner.hasNextByte()) {
                day = keyBoardScanner.nextByte();
                if (year == presentDate.getYear() && month == presentDate.getMonthValue() && day > presentDate.getDayOfMonth()) {
                    System.err.println("Apparently you were born in the future. "
                            .concat("Sorry, but this program does not cater to time travelers."));
                } else {
                    if (day < 32) {
                        rightFormat = true;
                    } else {
                        System.err.println("Wrong format. Try once more time.");
                    }
                }
            } else {
                System.err.println("Wrong format. Try once more time.");
            }
        }
        return day;
    }
}