package com.ogongchill.nationalAssembly;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestUtils {

	public static String readSourceFile(String fileName) {
		Path xmlPath = Paths.get(ClassLoader.getSystemResource(fileName).getPath());
		try {
			return Files.readString(xmlPath);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
