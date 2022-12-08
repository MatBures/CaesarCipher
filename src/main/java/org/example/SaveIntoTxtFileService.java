package org.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class SaveIntoTxtFileService {

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


