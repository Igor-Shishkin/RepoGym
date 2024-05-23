package sda.advancedJavaPractice.thirdDay.myZad30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path songPath = Path.of("src", "main", "resources");
        String text = Files.readString(songPath.resolve("src/AdditionalFiles/TheSongOfHiawatha.txt"));
        //System.out.println(line);
        List<String> lines = new ArrayList<>(List.of(text.split("\n")));



        for (int i = lines.size()-1; i >=0 ; i--) {
            Files.writeString(songPath.resolve("src/AdditionalFiles/reversSong.txt"), reverseOrder(lines.get(i)), StandardOpenOption.APPEND);
        }
    }
    public static String reverseOrder (String line) {
        String reverseLine = "";
        for (int i = line.length()-1; i >=0; i--) {
            reverseLine = reverseLine.concat(Character.toString(line.charAt(i)));
        }
        //reverseLine = reverseLine.concat("\n");
        return reverseLine;
    }
}
