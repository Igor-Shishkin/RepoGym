package sda.advancedJava.dayFirst.examplesIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("data.txt");
        Files.createFile(path);
        Files.write(path, "A long time ago in a galaxy far, far away....".getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "in a galaxy far, ".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, "far away....\n".getBytes(), StandardOpenOption.APPEND);
        for (String line : Files.readAllLines(path)) {
            System.out.println(line);
        }
        Files.readAllLines(path).forEach(text -> System.out.println(text));
        Files.readAllLines(path).forEach(System.out::println);
        //Files.delete(path);
    }
}
