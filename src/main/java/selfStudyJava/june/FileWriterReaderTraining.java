package selfStudyJava.june;

import java.io.*;

public class FileWriterReaderTraining {
    public static void main(String[] args) {
//        FileReader fileReader = new FileReader("src/additionalFiles/Hobbit.txt");
//        FileWriter fileWriter = new FileWriter("src/additionalFiles/forFileWriter.txt");
        try {
            writeToFile();
        } catch (IOException e) {
            System.err.println("Error");
        }

    }
    static void writerOutputFile () throws IOException {
        FileInputStream fis = new FileInputStream("src/additionalFiles/Hobbit.txt");
        Writer writer = new OutputStreamWriter(new FileOutputStream("forFileWriter.txt"));
        int c;
        while ((c=fis.read()) != -1) {
            writer.append((char)c);
        }
        fis.close();
        writer.close();
    }


    static void writeToFile () throws IOException {
        FileReader fileReader = new FileReader("Hobbit.txt");
        FileWriter fileWriter = new FileWriter("forFileWriter.txt", true);
        int c;
        while ((c=fileReader.read()) != -1) {
            fileWriter.append((char)c);
        }
        fileWriter.close();
        fileReader.close();
    }
}