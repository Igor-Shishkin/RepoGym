package advancedJavaPractice.thirdDay.myZad31;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        String text = "";
        try (Reader reader = new FileReader("Hobbit.txt")){
            int c;
            while ((c = reader.read()) != -1) {
                text = text.concat(Character.toString(c));
            }
        } catch (IOException e) {
            System.out.println("The file isn't found");
        }

        Map<String, Integer> wordsMap = new HashMap<>();
        text = text.trim().replaceAll("[.,:\\-+\n]]", "").replaceAll("\\s+", " ");
        System.out.println(text);
        List<String> words = new ArrayList<>(List.of(text.split("\\s+")));
        System.out.println(words.toString());



        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                int value = wordsMap.get(word);
                wordsMap.put(word,value+1);
            } else {
                wordsMap.put(word,1);
            }
        }

        List<String> listForFile = wordsMap.entrySet().stream()
                .filter(entry -> entry.getValue()>1)
                .sorted((x1,x2) -> Integer.compare(x2.getValue(), x1.getValue()))
                .map(entry -> String.format("%s - %d\n", entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        Path newFilePath = Path.of("src", "main", "resources");
        Files.writeString(newFilePath.resolve("src/AdditionalFiles/wordsFrequency1.txt"), listForFile.toString(), StandardOpenOption.CREATE);
//        Files.writeString(newFilePath.resolve("wordFrequency.txt"), "listForFile.toString()", StandardOpenOption.APPEND);

    }
}
