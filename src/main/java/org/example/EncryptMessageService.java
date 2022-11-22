package org.example;

import java.util.Arrays;
import java.util.List;

public class EncryptMessageService {
	
	public String encryptMessage(String textToEncrypt) { //používat listy (praktičktější a uměj víc věcí)
		
		String[] split = textToEncrypt.split("(?!^)"); // zkratka ctrl+1 vybereš asign to local variable. // ("(?!^)") = regulerní výraz == jakýkoli character
		List<String> listOfSingleCharactersToEncrypt = Arrays.asList(split);
//		List<String> encryptedMessage = new ArrayList<>();
		
		
		  /// Loop aby se dávali char v listo {z, a, u, t, o, c, i, m,e} postupne do noveho listu {80, 52, 70......} a potom se prevedl tento list integru na encryptle list.	
												
		 
			 
		char a='1';
		char b='2';
		char c='3';
		char d='4';
		char e='5';
		char f='6';
		
		for (int i = 0; i < listOfSingleCharactersToEncrypt.size(); i++) {
			listOfSingleCharactersToEncrypt.get(i);
			int bytes=Integer.parseInt(String.valueOf(listOfSingleCharactersToEncrypt.get(i)));  
			System.out.println(bytes);
		}

		 
	//	System.out.println(listOfSingleCharactersToEncrypt);
		 
	

		return "";
	}
}
	

///  C:\Users\Jakub\Desktop\Caesar\MessageEnscrypt.txt