package sda.basicsJava.dateExample;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());

        long dateInMilli = date.getTime();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        System.out.println("Obecna data oraz godzina: " + simpleDateFormat.format(date));
    }
}
