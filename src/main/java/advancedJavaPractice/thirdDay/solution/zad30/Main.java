package advancedJavaPractice.thirdDay.solution.zad30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

	public static void main(String[] args) throws IOException {

		Path workingDir = Paths.get("src", "main", "resources", "src/AdditionalFiles/zad30");
		Path originalFile = workingDir.resolve("someTextFile.txt");
		String originalContent = Files.readString(originalFile);
		String reversedContent = reverse(originalContent);
		Path destinationFile = reverseFileName(originalFile);
		Files.writeString(destinationFile, reversedContent, StandardOpenOption.CREATE);

	}

	public static String reverse(String originalContent) {
		return new StringBuilder(originalContent).reverse().toString();
	}

	public static Path reverseFileName(Path originalFile) {
		String name = originalFile.getFileName().toString();
		int i = name.lastIndexOf('.');
		String rawName = name.substring(0, i);
		String extension = name.substring(i);

		return originalFile.getParent().resolve(reverse(rawName) + extension);
	}

}
