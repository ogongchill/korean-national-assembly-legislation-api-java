package com.ogongchill.nationalAssembly;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestUtils {

	public static String readSourceFile(String fileName) {
		try {
			Path xmlPath = Paths.get(ClassLoader.getSystemResource(fileName).toURI());
			return Files.readString(xmlPath);
		} catch (IOException | URISyntaxException e) {
			throw new RuntimeException(e);
		}
	}
}
