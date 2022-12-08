package org.example;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

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
			System.out.println("Tell us the path for a txt file where is the message for encryption stored.");
			String fileContent = readTxtFileService.readTxtFile(); //zavola čtení text dokumentu z methody ReadTxtFileService.
			System.out.println("In text document is: " + fileContent); //zobrazí v konzoli text txt dokumentu
			String encryptedTextToSave = encryptMessageService.encryptMessage(fileContent);
			System.out.println("The message was encrypted to : " + encryptedTextToSave); //zavolá encrypting message methodu a použije ji, DULEŽITÉ !!
			System.out.println("Tell us the path where you want to save your encrypted message.");
			saveIntoTxtFileService.savingEncryptedMessage(encryptedTextToSave); //zavolá saveIntoTxtFileService metodu která naskenuje path + uloží txt dokument.
			System.out.println("Your encrypted message was saved.");
			break;

		case "D":
			System.out.println("Tell us the path to a txt file where is the message for decryption stored.");
			fileContent = readTxtFileService.readTxtFile(); //zavola čtení text dokumentu z methody ReadTxtFileService.
			System.out.println("In text document is: " + fileContent); //zobrazí v konzoli text txt dokumentu
			String decryptedTextToSave = decryptMessageService.decryptMessage(fileContent);
			System.out.println("The message was decrypted to : " + decryptedTextToSave);  //zavolá decrypting message methodu a použije ji, DULEŽITÉ !!
			System.out.println("Tell us the path where you want to save your decrypted message.");
		saveIntoTxtFileService.savingDecryptedMessage(decryptedTextToSave); //zavolá saveIntoTxtFileService metodu která naskenuje path + uloží txt dokument.
			System.out.println("Your decrypted message was saved.");
			break;

		default:
			System.out.println("Unknown command Emperor. You need to choose letter E for encrypt or D for decrypt.");
			break;
		}
    }               //-----------------------------------------------------------------//
}                  //__________________RYCHLÉ ZADÁVÁNÍ CEST V POČÍTAČI________________//
        //TODO:   C:\Users\Jakub\Desktop\Caesar\MessageEnscrypt.txt C:\Users\Jakub\Desktop\Caesar\MessageDescrypt.txt  C:\Users\Jakub\Desktop\Caesar\encrypted.txt C:\Users\Jakub\Desktop\Caesar\decrypted.txt
        /**
         * OK, we played some games and had fun.
         * Let's start something more serious.
         *
         * Do you know G. J. Caesar?   git status, git checkout (spravna branch), git add . , git commit -m "co chces napsat", git push origin jmenobranche.
         * You probably heard about his conquests and his Great Roman Empire.
         * Maybe you heard that he was stabbed many times by the members of senate and died by the hands of his own people.
         *
         * But do you know he was one of the first well known people who used cryptography in real situations?
         * When he was sending messages to his generals he used the cipher he developed, to encrypt the message.
         * Today the cipher is known, tam ta tam Caesars cipher. No surprise there, right?
         *
         * The cipher was relatively simple. You took a message, for example: AttackCityTonight
         * and shift all characters in the message using alphabet by 3. (for example from A -> D, B -> E, ...., X -> A, Y -> B, Z -> C)
         * Our encrypted message would be then: DwwdfnFlwbWrqljkw
         * The general receiving the message, would shift the numbers in alphabet by -3 to get the original message -> AttackCityTonight.
         *
         * If you want to know more about Caesars cipher: https://cs.wikipedia.org/wiki/Caesarova_%C5%A1ifra
         * 
         *TO DO TO DO TO DO
         * Your task now will be to develop complete encryption and decryption machine that is using the Caesars cipher.
         * You can call it little Enigma program...
         *
         * 1. Ask the user if he wants to encrypt message "E" or decrypt message "D" 	 ----------------------DONE------------------------------
         * 2A - ENCRYPT:
         *    I. Ask user for path to a txt file where is the message for encryption stored.	 ----------------------DONE------------------------------
         *    II. Read the file with the message. Use ReadTxtFileService for that. To make it simple the file cannot contain empty spaces, nor numbers, just characters. -------DONE------------------------------
         *    III. Use EncryptMessageService to encrypt the message and show the encrypted message in console.	 -------DONE--------------------
         *    IV. Ask user for path where to store the encrypted message in txt file. ---------------DONE---------------------
         *    V. Save the encrypted message into this txt file. Use SaveIntoTxtFileService for this purpose.  ---------------DONE---------------------
         * 2B - DECRYPT:
         *    I. Ask user for path to a txt file where is the message for decryption stored.   -------DONE--------------------
         *    II. Read the file with the encrypted message. Use ReadTxtFileService for that. To make it simple the file cannot contain empty spaces, nor numbers, just characters. -------DONE--------------------
         *    III. Use Decrypt message service to decrypt the message and show the decrypted message in console.  ---------DONE--------------------
         *    IV. Ask user for path where to store the decrypted message in txt file. ---------------DONE---------------------
         *    V. Save the decrypted message into this txt file. Use SaveIntoTxtFileService for this purpose.  ---------------DONE---------------------
         *
         * Little guide? Is it to hard? Ok...
         * How to read txt file from java:
         * https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
         *
         * How to save into txt file from java:
         * https://stackoverflow.com/questions/1053467/how-do-i-save-a-string-to-a-text-file-using-java
         *
         * How to convert String (Or character) to Byte (number representation of the character) and back:
         * https://www.geeksforgeeks.org/java-program-to-convert-char-to-byte/
         *
         * How to split a string into characters:
         * https://stackoverflow.com/questions/5235401/split-string-into-array-of-character-strings
         *
         * Is this not enough? Well ok, I give you 1 joker card.
         * You can call me 1 time with any specific problem, and I will solve it with you.
         *
         * Is this too challenging? Yes it is. However, if you will solve it by yourself and only with the guide I provided till the end of this week (25.9.2022),
         * you will get a real reward!!
         *
         * Good Luck!
         */

