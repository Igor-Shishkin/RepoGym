package basicsJava.dateExample;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("yyyy-MM-dd"));
        Employee employeeOne =
                new Employee("Jan", "Nowicki",
                        LocalDate.parse("2000", formatter));
        Employee employeeTwo = new Employee
                ("Natalia", "Jakaś", LocalDate.of(1992, Month.JANUARY, 19));
    }Employee employeeThree = new Employee
            ("Ola", "Majowa", LocalDate.of(1999, 04, 1));


}
