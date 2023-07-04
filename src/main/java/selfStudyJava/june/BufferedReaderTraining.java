package selfStudyJava.june;

import java.io.*;

public class BufferedReaderTraining {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/additionalFiles/ChurchAscii.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/additionalFiles/BufferedStreamTest.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line, 5, 5);
                bufferedWriter.write("\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}