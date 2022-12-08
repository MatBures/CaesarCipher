package org.example;
import java.util.Scanner;

/**
 * Application that implements Caesars cipher.
 * It enables the users to both encrypt and decrypt a messages.
 *
 * Messages are read and written down to text files.
 *
 * The idea is that two people who are sharing this program,
 * can send each other encrypted information in text file and decrypt it.
 */
public class App {
    public static void main( String[] args ) {
    	Scanner scanner = new Scanner(System.in);
    	ReadTxtFileService readTxtFileService = new ReadTxtFileService();
    	DecryptMessageService decryptMessageService = new DecryptMessageService();
		EncryptMessageService encryptMessageService = new EncryptMessageService();
    	SaveIntoTxtFileService saveIntoTxtFileService = new SaveIntoTxtFileService();
    	
    	System.out.println("Greetings Great Roman Emperor Caesar, press letter E for encrypt message or letter D for decrypt message. We need to know next steps to win the war.");

    	String option = scanner.next();

		switch (option) {
		case "E":
			// 1. Read text file where the text to encrypt is located
			System.out.println("Tell us the path for a txt file where is the message for encryption stored.");
			String fileContent = readTxtFileService.readTxtFile();
			System.out.println("In text document is: " + fileContent);

			// 2. Encrypt the text and store it in encryptedTextToSaveVariable
			String encryptedTextToSave = encryptMessageService.encryptMessage(fileContent);
			System.out.println("The message was encrypted to : " + encryptedTextToSave);

			// 3. Store the encrypted text to text file.
			System.out.println("Tell us the path where you want to save your encrypted message.");
			saveIntoTxtFileService.savingEncryptedMessage(encryptedTextToSave);
			System.out.println("Your encrypted message was saved.");
			break;

		case "D":
			//1. Read text file where the text to decrypt is located
			System.out.println("Tell us the path to a txt file where is the message for decryption stored.");
			fileContent = readTxtFileService.readTxtFile();
			System.out.println("In text document is: " + fileContent);

			//2. Decrypt the text and store it in decryptedTextToSaveVariable
			String decryptedTextToSave = decryptMessageService.decryptMessage(fileContent);
			System.out.println("The message was decrypted to : " + decryptedTextToSave);

			//3. Store the decrypted text to text file.
			System.out.println("Tell us the path where you want to save your decrypted message.");
		saveIntoTxtFileService.savingDecryptedMessage(decryptedTextToSave);
			System.out.println("Your decrypted message was saved.");
			break;

			//Default message if user put unknown command. Everything except "E" or "D".
		default:
			System.out.println("Unknown command Emperor. You need to choose letter E for encrypt or D for decrypt.");
			break;
		}
    }
}

