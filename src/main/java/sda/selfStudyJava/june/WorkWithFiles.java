package sda.selfStudyJava.june;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkWithFiles {
    public static void main(String[] args) throws IOException {
        File file1 = new File("myFile.txt");
        Path path1 = Paths.get("myFile.txt");
        if (!file1.exists()) {
            Files.createFile(path1);
        }
        if (file1.exists()) {
            System.out.println("File exist");
            System.out.println("Path: " + file1.getPath());
            System.out.println("Absolute Path: " + file1.getAbsolutePath());
            System.out.println("File: " + file1.isFile());
//            file1.delete();
        }
//        System.out.println(file1.delete());

        try (
                FileInputStream fileInputStream = new FileInputStream("src/additionalFiles/Hobbit.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("src/additionalFiles/myFile.txt");
        ) {
            int c;
            while ((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c);
            }
            fileOutputStream.write(13);
            String forEnd = "This was my text input training.";
            for (char a : forEnd.toCharArray()) {
                fileOutputStream.write(a);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }


//        InputStream inputStream = new FileInputStream("myFile.txt");
//        inputStream.close();


}