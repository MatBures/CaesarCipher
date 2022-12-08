package org.example;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This service is providing the saving of the text files.
 */
public class SaveIntoTxtFileService {
    /**
     * Takes user input in the console -> Path where to save the file.
     * Then the file is saved.
     */

    public void savingEncryptedMessage(String encryptedTextToSave) {
        Scanner scanner = new Scanner(System.in);
        String savePath = scanner.next();
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(savePath, "UTF-8");
        } catch (Exception e) {
            System.out.println("Writer failed " + e.getMessage());
        }

        writer.println(encryptedTextToSave);
        writer.close();

    }

    public void savingDecryptedMessage(String decryptedTextToSave) {
        Scanner scanner = new Scanner(System.in);
        String savePath = scanner.next();
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(savePath, "UTF-8");
        } catch (Exception e) {
            System.out.println("Writer failed " + e.getMessage());
        }
        writer.println(decryptedTextToSave);
        writer.close();
    }
}


