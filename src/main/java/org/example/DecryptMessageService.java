package org.example;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DecryptMessageService {
    private Charset charset = StandardCharsets.UTF_8;
    private int cypherMod = 5; //Tady se upravuje (modifikuje) podle čeho se šifruje

    public String decryptMessage(String textToDecrypt) {

        List<Integer> listOfIntegersToDecrypt = new ArrayList<Integer>();
        List<Integer> listOfDecryptedIntegers = new ArrayList<Integer>();
        byte[] messageInBytesArray = textToDecrypt.getBytes(StandardCharsets.UTF_8); //Veme to String (textToEncrypt) a rozdělí to ten String na pole [] v bytech.
        byte[] decryptedBytesArray = new byte[textToDecrypt.length()]; //vytvoří se array bytů a musí se určit jak je velký, to je potřeba vždy. Když se vytváří pole, musíš mu říct jak je velký!

        for (int i =0; i< messageInBytesArray.length; i++) {
            byte singleByte = messageInBytesArray[i];
            listOfIntegersToDecrypt.add(Integer.valueOf(singleByte)); // převadí číslo bytu na číslo v integru aby se s ním lépe pracovalo a přídává se do listu.
        }

        for (int i =0; i< listOfIntegersToDecrypt.size(); i++) {
            Integer valueToCypher = listOfIntegersToDecrypt.get(i);
            Integer cypheredValue = valueToCypher - cypherMod; // modifikuje integry v listu proměnou cypherKey a ukládá do listOfEncryptedIntegers
            if (cypheredValue < 97) { //kdyz je cypheredValue menší než 97 (aby se převedlo do jiného znaku, MUSÍ začit znova po zpátku abecedy (logicky)
                cypheredValue = cypheredValue + 26; //kdyz je cypheredValue menší než 97 (aby se převedlo do jiného písmene, MUSÍ začit znova po zpátku abecedy (logicky)
            }
            listOfDecryptedIntegers.add(cypheredValue);
        }
        for(int i =0; i< listOfDecryptedIntegers.size(); i++) {
            byte encryptedByteValue = listOfDecryptedIntegers.get(i).byteValue(); // Z listu se vezme 1. pozice = index i a .bytevalue = se změní zpátky na byte.
            decryptedBytesArray[i] = encryptedByteValue; //do pole encryptedBytesArray přidá se 1. hodnota
        }

        String decryptedMessage = new String(decryptedBytesArray, StandardCharsets.UTF_8);
        System.out.println(decryptedMessage);

        return decryptedMessage;
// C:\Users\Jakub\Desktop\Caesar\MessageDescrypt.txt zkouška
    }
}
