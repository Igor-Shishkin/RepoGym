package advancedJavaPractice.thirdDay.solution.zad30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LineBasedApproach {

	public static void main(String[] args) throws IOException {
		Path workingDir = Paths.get("src", "main", "resources", "src/AdditionalFiles/zad30");
		Path originalFile = workingDir.resolve("someTextFile.txt");
		List<String> lines = Files.readAllLines(originalFile);
		List<String> reversedLines = reverse(lines);
		Files.write(Main.reverseFileName(originalFile), reversedLines, StandardOpenOption.CREATE);
	}

	private static List<String> reverse(List<String> lines) {
		List<String> result = new ArrayList<>(lines.size());
		// we could have used
		// Collections.reverse

		for (int i = lines.size() - 1; i >= 0; i--) {
			result.add(Main.reverse(lines.get(i)));
		}
		return result;
	}

}
