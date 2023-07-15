package advancedJavaPractice.thirdDay.solution.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Playground {

	public static void main(String[] args) throws IOException {
		String absolutPath = "C:\\priv\\dev\\SDA\\zdjavapol146\\src\\main\\resources\\zad30\\someTextFile.txt";
		String workingDir = "src/main/resources/zad30";
		String relativePath = workingDir + "someTextFile.txt";
		String destinationPath = workingDir + "destination.txt";

		Path resourceDir = Paths.get("src", "main", "resources");
		Path zad30dir = resourceDir.resolve("src/AdditionalFiles/zad30");

		Path relativePath2 = zad30dir.resolve("someTextFile.txt");
		System.out.println("nazwa pliku: " + relativePath2.getFileName());

		System.out.println(Files.readString(relativePath2));

		List<String> lines = Files.readAllLines(relativePath2);
		System.out.println(lines);

		Files.writeString(zad30dir.resolve("newFile.txt"), "cokolwiek3", StandardOpenOption.CREATE);

		System.out.println(new StringBuilder("abc").reverse().toString());

	}

}
