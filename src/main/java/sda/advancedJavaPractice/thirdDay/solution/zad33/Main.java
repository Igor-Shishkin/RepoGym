package sda.advancedJavaPractice.thirdDay.solution.zad33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		Path workingDir = Paths.get("src", "main", "resources", "src/AdditionalFiles/zad33");
		System.out.println(findImagesWithWalk(workingDir));
	}

	private static List<Path> findImagesWithWalk(Path workingDir) throws IOException {
		try (Stream<Path> walk = Files.walk(workingDir)) {
			return walk
					.filter(path -> path.getFileName().toString().endsWith(".png")
							|| path.getFileName().toString().endsWith(".jpg"))
					.collect(Collectors.toList());
		}
	}

}
