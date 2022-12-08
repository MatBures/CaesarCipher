package org.example;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * This service is providing the reading of the text files.
 */
public class ReadTxtFileService {

	/**
	 * Takes user input in the console -> Path to file that should be read.
	 * Then file is read from this location.
	 * @return - String represeting the content of the file that was read.
	 */
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
