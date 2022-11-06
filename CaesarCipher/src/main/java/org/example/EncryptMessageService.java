package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncryptMessageService {
	
	public String encryptMessage(String textToEncrypt) { //používat listy (praktičktější a uměj víc věcí)
		
		String[] split = textToEncrypt.split("(?!^)"); // zkratka ctrl+1 vybereš asign to local variable. // ("(?!^)") = regulerní výraz == jakýkoli character
		List<String> listOfSingleCharactersToEncrypt = Arrays.asList(split);
		List<Integer> listOfSingleBytes = new ArrayList<Integer>();
		List<String> encryptedMessage = new ArrayList<>();
		
		
		 
		
		
		
		
		
		
		  /// Loop aby se dávali char v listo {z, a, u, t, o, c, i, m,e} postupne do noveho listu {80, 52, 70......} a potom se prevedl tento list integru na encryptle list.	
																																																				
			 
			 
		 
		 
		
		
		

		return "";
	}
}
	

///  C:\Users\Jakub\Desktop\Caesar\MessageDescrypt.txt