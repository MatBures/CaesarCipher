package org.example;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Service for decrypting any message by using the Caesars cipher algorithm.
 */
public class DecryptMessageService {
    private int cypherMod = 5; // The key for caesar cipher algorithm. The letters in alphabet will be shifted by this number.

    /**
     * Decrypts message using the Caesars cipher algorithm.
     *
     * @param textToDecrypt - Text that should be decrypted
     * @return - Decrypted text in String format
     */
    public String decryptMessage(String textToDecrypt) {

        //Creating lists and arrays to make this method work.
        List<Integer> listOfIntegersToDecrypt = new ArrayList<>();
        List<Integer> listOfDecryptedIntegers = new ArrayList<>();

        //Works with String (textToDecrypt) and split it to arrays [] in bytes.
        byte[] messageInBytesArray = textToDecrypt.getBytes(StandardCharsets.UTF_8);

        //Set size of an array []
        byte[] decryptedBytesArray = new byte[textToDecrypt.length()];

        //Loop that changing bytes to integers and adding to listOfIntegersToDecrypt.
        for (int i =0; i< messageInBytesArray.length; i++) {
            byte singleByte = messageInBytesArray[i];
            listOfIntegersToDecrypt.add(Integer.valueOf(singleByte));
        }
        //Loop that modifies integers in listOfIntegersToDecrypt and changing them with variable cypherKey and saving them to listOfEncryptedIntegers
        for (int i =0; i< listOfIntegersToDecrypt.size(); i++) {
            Integer valueToCypher = listOfIntegersToDecrypt.get(i);
            Integer cypheredValue = valueToCypher - cypherMod;

        //This IF is needed when cypherValue is less than 97, it needs to start from the number of begging character of alphabet "a".
        if (cypheredValue < 97) {

        //To start from opposite way of alphabet you need to add +26 to cypheredValue.
            cypheredValue = cypheredValue + 26;
        }
        listOfDecryptedIntegers.add(cypheredValue);
        }

        //Loop that changes integers to bytes.
        for(int i =0; i< listOfDecryptedIntegers.size(); i++) {
            byte encryptedByteValue = listOfDecryptedIntegers.get(i).byteValue();
            decryptedBytesArray[i] = encryptedByteValue;
        }

        String decryptedMessage = new String(decryptedBytesArray, StandardCharsets.UTF_8);

        return decryptedMessage;
    }
}
