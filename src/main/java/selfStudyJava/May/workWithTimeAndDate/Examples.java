package selfStudyJava.May.workWithTimeAndDate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Examples {
        public static void main(String[] args) {
            Date date = new Date();
            System.out.println(date);
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
            System.out.println(dateFormat.format(date));

            LocalDate localData = LocalDate.now();
            System.out.println("Year: " + localData.getYear());
            System.out.println("Month: " + localData.getMonth());
            System.out.println("Day: " + localData.getDayOfMonth());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");
            LocalDateTime localDayTime = LocalDateTime.now();
            System.out.println(formatter.format(localDayTime));

            String textDateOne = "31/12/1999";
            String textDateTwo = "20/05/2010";
            String textDateThree = "30/02/2023";

            DateTimeFormatter formatterForText = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataFromTextOne = LocalDate.parse(textDateOne, formatterForText);
            LocalDate dataFromTextTwo = LocalDate.parse(textDateTwo, formatterForText);
            LocalDate dataFromTextThree = LocalDate.parse(textDateThree, formatterForText);

            System.out.println(textDateOne.concat("\n").concat(textDateTwo).concat("\n")
                    .concat(textDateThree.concat("\n")));

            DateTimeFormatter formatterForProject = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            System.out.println(formatterForProject.format(dataFromTextOne));
            System.out.println(formatterForProject.format(dataFromTextTwo));
            System.out.println(formatterForProject.format(dataFromTextThree));

            System.out.println(dataFromTextOne.isBefore(dataFromTextTwo));
            System.out.println(dataFromTextOne.compareTo(dataFromTextTwo));
            System.out.println(dataFromTextThree.plusMonths(33));


            LocalDateTime dateTime1 = LocalDateTime.parse("2018-08-02T15:14");
            LocalDateTime dateTime2 = LocalDateTime.parse("2019-02-14T12:45");
            Duration duration = Duration.between(dateTime1, dateTime2);
            System.out.println(duration.toDays());

        }
}
