package sda.advancedJava.dayFirst.examplesIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class BafferedReaderExample {
    public static void main(String[] args) {
        try (
                BufferedReader in = new BufferedReader(new FileReader("Hobbit.txt"));
                BufferedWriter out = new BufferedWriter(new FileWriter("user_output.txt"));
                ) {
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
            }

        } catch (IOException exception) {
            System.out.println("Error: ".concat(exception.toString()));
        }
    }
}
