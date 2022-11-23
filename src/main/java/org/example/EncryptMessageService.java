package org.example;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncryptMessageService {
	private Charset charset = StandardCharsets.UTF_8;
	private int cypherKey = 5; //Tady se upravuje (modifikuje) podle čeho se šifruje
	public String encryptMessage(String textToEncrypt) { //používat listy (praktičktější a uměj víc věcí)
		List<Integer> listOfIntegersToCypher = new ArrayList<Integer>();
		List<Integer> listOfEncryptedIntegers = new ArrayList<Integer>();
		byte[] messageInBytesArray = textToEncrypt.getBytes(StandardCharsets.UTF_8); //Veme to String (textToEncrypt) a rozdělí to ten String na pole [] v bytech.
		byte[] encryptedBytesArray = new byte[textToEncrypt.length()]; //vytvoří se array bytů a musí se určit jak je velký, to je potřeba vždy. Když se vytváří pole, musíš mu říct jak je velký!

		for (int i =0; i< messageInBytesArray.length; i++) {
			byte singleByte = messageInBytesArray[i];
			listOfIntegersToCypher.add(Integer.valueOf(singleByte)); // převadí číslo bytu na číslo v integru aby se s ním lépe pracovalo a přídává se do listu.
		}

		for (int i =0; i< listOfIntegersToCypher.size(); i++) {
			Integer valueToCypher = listOfIntegersToCypher.get(i);
			Integer cypheredValue = valueToCypher + cypherKey; // modifikuje integry v listu proměnou cypherKey a ukládá do listOfEncryptedIntegers
			if (cypheredValue > 122) { //kdyz je cypheredValue větší než 122 (aby se převedlo do jiného písmene, MUSÍ začit znova od abecedy (logicky)
				cypheredValue = cypheredValue - 26; //kdyz je cypheredValue větší než 122 (aby se převedlo do jiného písmene, MUSÍ začit znova od abecedy (logicky)
			}
			listOfEncryptedIntegers.add(cypheredValue);
		}

		for(int i =0; i< listOfEncryptedIntegers.size(); i++) {
			byte encryptedByteValue = listOfEncryptedIntegers.get(i).byteValue(); // Z listu se vezme 1. pozice = index i a .bytevalue = se změní zpátky na byte.
			encryptedBytesArray[i] = encryptedByteValue; //do pole encryptedBytesArray přidá se 1. hodnota
		}

		String encryptedMessage = new String(encryptedBytesArray, StandardCharsets.UTF_8);
		System.out.println(encryptedMessage);

		return encryptedMessage;
	}
}

///  C:\Users\Jakub\Desktop\Caesar\MessageEnscrypt.txt