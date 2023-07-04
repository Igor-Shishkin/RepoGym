package selfStudyJava.june;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PictureToConsole {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/additionalFiles/PictureAscii.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}