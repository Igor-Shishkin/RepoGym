package sda.basicsJava.dateExample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;

public class LocalDateExamples {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        IsoChronology chronology = localDate.getChronology();

        System.out.println(dayOfWeek);
        System.out.println(chronology);

        LocalDate localDate1 = LocalDate.of(1994,1,1);
        DayOfWeek dayOfWeekMy = localDate1.getDayOfWeek();
        System.out.println(dayOfWeekMy);

        System.out.println(localDate.isBefore(localDate1));

        LocalDateTime localDateTime = LocalDateTime.now();
        //SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterTwo = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //String format = formatter.format(localDateTime);
        System.out.println(formatter.format(localDateTime));
        int hour = localDateTime.getHour();
        System.out.println(hour);

        //LocalDateTime localDateTimeOne = localDateTime.
        String textDateOne = "1990-02-08";
        String textDateTwo = "2005-12-31";
        String textDateThree = "1890-04-20";

        LocalDate dateOne = LocalDate.parse(textDateOne, formatter);
        System.out.println(formatter.format(dateOne));

        LocalDate dateTwo = LocalDate.parse(textDateTwo, formatter);
        System.out.println(formatter.format(dateTwo));

        LocalDate dateThree = LocalDate.parse(textDateThree, formatter);
        System.out.println(formatterTwo.format(dateThree));
    }
}
