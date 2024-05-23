package sda.advancedJavaPractice.thirdDay.solution.zad31;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		Path workingDir = Paths.get("src", "main", "resources", "src/AdditionalFiles/zad31");
		Path inputFile = workingDir.resolve("zadania.txt");
		Path outputFile = inputFile.getParent().resolve("out.txt");
		//byMichal(inputFile.toString(), outputFile.toString());
		withNio(inputFile, outputFile);
	}

	private static void withNio(Path inputFile, Path outputFile) throws IOException {
		Map<String, Integer> wordCountMap = getWordCountMap(inputFile);
		List<String> outputLines = wordCountMap.entrySet().stream()
				.map(e -> "|" + e.getKey() + "|" + e.getValue() + '|')
				.collect(Collectors.toList());
		Files.write(outputFile, outputLines);
	}

	private static Map<String, Integer> getWordCountMap(Path inputFile) throws IOException {
		Map<String, Integer> wordCountMap = new HashMap<>();
		for (String line : Files.readAllLines(inputFile)) {
			String[] words = line.split("\\s+");
			for (String word : words) {
				wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
			}
		}
		return wordCountMap;
	}

	private static void byMichal(String inputFile, String outputFile) throws IOException {
		Map<String, Integer> wordCountMap = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {

			String line;
			while ((line = reader.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (String word : words) {
					if (wordCountMap.containsKey(word)) {
						int count = wordCountMap.get(word);
						wordCountMap.put(word, count + 1);
					} else {
						wordCountMap.put(word, 1);
					}
				}
			}
		}

		try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
			for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
				String word = entry.getKey();
				int count = entry.getValue();
				writer.write(word + "\t\t" + count);
				writer.newLine();
			}
		}
	}

}
