package com.ogongchill.nationalAssembly;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class TestUtils {

	public static String readSourceFile(String fileName) {
		try {
			Path xmlPath = Paths.get(ClassLoader.getSystemResource(fileName).toURI());
			return Files.readString(xmlPath);
		} catch (IOException | URISyntaxException e) {
			throw new RuntimeException(e);
		}
	}

	public static String readKey() {
		Map<String, String> yamlData = readYaml("src/test/resources/testKey.yaml");
		return yamlData.get("key");
	}

	private static Map<String, String> readYaml(String filePath) {
		Map<String, String> yamlData = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				line = line.trim();
				if (line.startsWith("#") || line.isEmpty()) {
					continue;
				}
				String[] parts = line.split(":", 2);
				if (parts.length == 2) {
					String key = parts[0].trim();
					String value = parts[1].trim();
					yamlData.put(key, value);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return yamlData;
	}
}
