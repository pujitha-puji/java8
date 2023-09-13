package com.streamApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileData {
	public static void main(String[] args) throws Exception{
		String fileName = "info.txt";
		
		Stream<String> lines = Files.lines(Paths.get(fileName));
		lines.forEach(line ->System.out.println(line));
		lines.close();
	}

}
