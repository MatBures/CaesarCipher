package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadTxtFileService {

	public String readTxtFile() {
		Scanner scanner = new Scanner(System.in);
		String path = scanner.next();
		String fileContent = "";

		try {
			File file = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(file));

			boolean wholeFileHasBeenRead = false;
			while (!wholeFileHasBeenRead) { 
				String lineText = br.readLine();
				if (lineText != null) {
					fileContent = fileContent + lineText;
				} else {
					wholeFileHasBeenRead = true;
				}
			
			} 

		} catch (Exception e) {
			System.out.println("Reading txt file failed");

		}

		return fileContent;

	}
}
