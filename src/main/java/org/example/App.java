package org.example;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
    	Scanner scanner = new Scanner(System.in);
    	ReadTxtFileService readTxtFileService = new ReadTxtFileService();
    	DecryptMessageService decryptMessageService = new DecryptMessageService();
		EncryptMessageService encryptMessageService = new EncryptMessageService();
    	SaveIntoTxtFileService saveIntoTxtFileService = new SaveIntoTxtFileService();
    	
    	System.out.println("Greetings Great Roman Emperor Caesar, press letter E for encrypt message or letter D for descrypt message. We need to know next steps to win the war.");
    	
    	//testbranch
    	String text = scanner.next();

		switch (text) {
		case "E":
			System.out.println("Tell us the path for a txt file where is the message for encryption stored.");
			break;

		case "D":
			System.out.println("Tell us the path to a txt file where is the message for decryption stored.");
			break;
		default:
			System.out.println("Unknown command Emperor. You need to choose letter E for encrypt or D for descrypt.");
			break;
		}
		
			String fileContent = readTxtFileService.readTxtFile();
			
			System.out.println(fileContent);
		
			String encryptingMessage = encryptMessageService.encryptMessage(fileContent); //Takhle se sdílí (předává) "hodnota" proměny z metod. !!! duležitý !!!
			
    }
}


        //TODO:   C:\Users\Jakub\Desktop\Caesar\MessageEnscrypt.txt
        /**
         * OK, we played some games and had fun.
         * Let's start something more serious.
         *
         * Do you know G. J. Caesar?
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
         * 1. Ask the user if he wants to encrypt message "E" or decrypt message "D"  ----------------------DONE------------------------------
         * 2A - ENCRYPT:
         *    I. Ask user for path to a txt file where is the message for encryption stored. ----------------------DONE------------------------------
         *    II. Read the file with the message. Use ReadTxtFileService for that. To make it simple the file cannot contain empty spaces, nor numbers, just characters. -------DONE------------------------------
         *    III. Use EncryptMessageService to encrypt the message and show the encrypted message in console.
         *    IV. Ask user for path where to store the encrypted message in txt file.
         *    V. Save the encrypted message into this txt file. Use SaveIntoTxtFileService for this purpose.
         * 2B - DECRYPT:
         *    I. Ask user for path to a txt file where is the message for decryption stored.
         *    II. Read the file with the encrypted message. Use ReadTxtFileService for that. To make it simple the file cannot contain empty spaces, nor numbers, just characters.
         *    III. Use Decrypt message service to decrypt the message and show the decrypted message in console.
         *    IV. Ask user for path where to store the decrypted message in txt file.
         *    V. Save the decrypted message into this txt file. Use SaveIntoTxtFileService for this purpose.
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

