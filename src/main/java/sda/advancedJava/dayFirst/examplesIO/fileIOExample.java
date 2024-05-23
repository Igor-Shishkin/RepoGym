package sda.advancedJava.dayFirst.examplesIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileIOExample {
    public static void main (String[] args) {
        try {
            copyFile();
        } catch (IOException e) {
            System.out.println("Error: ".concat(e.toString()));
        }
        System.out.println("The program continues");
    }

    static void copyFile () throws IOException {
        FileReader in = new FileReader("Hobbit.txt");
        FileWriter out = new FileWriter("writer_user_output.txt");
        int nextChar;
        while ((nextChar = in.read()) != -1) {
            System.out.println("Char: " + nextChar + "\tor: " + (char)nextChar);
            out.append((char)nextChar);
        }
        in.close();
        out.close();
    }
}
