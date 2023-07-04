package selfStudyJava.june.streamTraining;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TrainingOne {
    public static void main(String[] args) {

        int[] arrayInt = new int[]
                {21, 30, 49, 52, 66, 7, 85, 90, 101};
        IntStream streamInt = Arrays.stream(arrayInt);
        streamInt.filter(x -> x%2==1).limit(3).forEach(System.out::println);
        System.out.println(Arrays.toString(arrayInt));

        String[] daysOfWeek = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Sutterday", "Sunday"};
        Stream weekDays = Arrays.stream(daysOfWeek);
        weekDays.filter(day -> day.toString().length()>6).forEach(System.out::println);

        String[] array = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray = Arrays.stream(array);
        streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
                .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
                .collect(Collectors.toList()).forEach(System.out::println);

        String[] array1 = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray1 = Arrays.stream(array1);
        streamOfArray1.map(s->s.split("")) //Преобразование слова в массив букв
                .map(Arrays::stream).distinct() //Сделать массив в отдельный поток
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}