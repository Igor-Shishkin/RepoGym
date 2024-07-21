package training.readWrite;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Bases {
    public static void main(String[] args) throws IOException {
        String property = System.getProperty("user.dir");
        System.out.println("\n" + property + "\n");

        Properties properties = System.getProperties();
        System.out.println(properties);

        System.out.println(Arrays.toString(System.lineSeparator().getBytes(StandardCharsets.UTF_8)));
        System.out.println(File.separator);

        Worker workerOne = new Worker("John", 23, "126 5757 43");
        Worker workerTwo = new Worker("Tom", 19, "656 5712 43");
        Worker workerThree = new Worker("Jane", 25, "651 2757 43");

        try (var printWriter =
                     new PrintWriter(
                             new OutputStreamWriter(
                              new FileOutputStream("src/main/java/training/readWrite/test.txt"), StandardCharsets.UTF_8),
                                     false)){
            printWriter.println((List.of(workerOne, workerTwo, workerThree).toString()));
            printWriter.println((List.of(workerOne, workerTwo, workerThree).toString()));
            printWriter.println((List.of(workerOne, workerTwo, workerThree).toString()));
        }



    }

    private static record Worker(String name, int age, String phoneNumber) {}
}
