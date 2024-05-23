package sda.advancedJavaPractice.thirdDay.solution.zad33;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class WalkingTreeImageFinder {

	public static List<String> findImages(Path path) {
		List<String> files = new ArrayList<>();
		try {
			Files.walkFileTree(path, new SimpleFileVisitor<>() {

				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
					File f = file.toFile();
					if (f.getName().endsWith(".png") || f.getName().endsWith(".jpg")) {
						files.add(f.getName());
					}
					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}

		return files;
	}
}
