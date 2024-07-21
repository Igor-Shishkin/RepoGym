package training.trWithStream;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CitiesInfo {

    public static Stream<City> readCities(String filePath) throws IOException {
        NumberFormat formatForPopulation = NumberFormat.getNumberInstance(Locale.US);
        return Files.readAllLines(Path.of(filePath))
                .stream()
                .skip(2)
                .map(String::trim)
                .filter(line -> !line.isEmpty())
                .map(line -> line.split("\\s+"))
                .filter(line -> line.length == 3)
                .map(line -> {
                    try {
                        return new City(line[0], line[1], formatForPopulation.parse(line[2]).intValue());
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    public static void main(String[] args) throws IOException {

        Stream<City> cityStream = readCities("src/main/java/training/trWithStream/ListOfCities.txt");
        Map<String, IntSummaryStatistics> popInfo = cityStream
                .collect(Collectors.groupingBy
                (City::state, Collectors.summarizingInt(City::population)));

        popInfo.entrySet().forEach(System.out::println);

        System.out.println("\n");

        cityStream = readCities("src/main/java/training/trWithStream/ListOfCities.txt");
        Map<String, String> collect = cityStream.collect(Collectors
                .groupingBy(City::state, Collectors.mapping(City::name, Collectors.joining(", "))));
        collect.entrySet().forEach(System.out::println);



    }
}
