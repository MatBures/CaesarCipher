package org.example;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Service for encrypting any message by using the Caesars cipher algorithm.
 */
public class EncryptMessageService {
	private int cypherKey = 5; // The key for caesar cipher algorithm. The letters in alphabet will be shifted by this number.

	/**
	 * Decrypts message using the Caesars cipher algorithm.
	 *
	 * @param textToEncrypt - Text that should be decrypted
	 * @return - Encrypted text in String format
	 */
	public String encryptMessage(String textToEncrypt) {

		//Creating lists and arrays to make this method work.
		List<Integer> listOfIntegersToCypher = new ArrayList<Integer>();
		List<Integer> listOfEncryptedIntegers = new ArrayList<Integer>();

		//Works with String (textToDecrypt) and split it to arrays [] in bytes.
		byte[] messageInBytesArray = textToEncrypt.getBytes(StandardCharsets.UTF_8);

		//Set size of an array []
		byte[] encryptedBytesArray = new byte[textToEncrypt.length()];

		//Loop that changing bytes to integers and adding to listOfIntegersToEncrypt.
		for (int i =0; i< messageInBytesArray.length; i++) {
			byte singleByte = messageInBytesArray[i];
			listOfIntegersToCypher.add(Integer.valueOf(singleByte));
		}

		//Loop that modifies integers in listOfIntegersToCypher and changing them with variable cypherKey and saving them to listOfIntegerToCypher
		for (int i =0; i< listOfIntegersToCypher.size(); i++) {
			Integer valueToCypher = listOfIntegersToCypher.get(i);
			Integer cypheredValue = valueToCypher + cypherKey;

			//This IF is needed when cypherValue is less than 122, it needs to start from the number of begging character of alphabet "a".
			if (cypheredValue > 122) {

			//To start from the first letter "a" of alphabet you need to - 26 to cypheredValue.
			cypheredValue = cypheredValue - 26;
			}
			listOfEncryptedIntegers.add(cypheredValue);
		}

		//Loop that changes integers to bytes.
		for(int i =0; i< listOfEncryptedIntegers.size(); i++) {
			byte encryptedByteValue = listOfEncryptedIntegers.get(i).byteValue();
			encryptedBytesArray[i] = encryptedByteValue;
		}

		String encryptedMessage = new String(encryptedBytesArray, StandardCharsets.UTF_8);

		return encryptedMessage;
	}
}
