package ru.codewars.decoder;

public class MorseCodeDecoder {

   public static void decode(String morseCode) {
       String[] words = morseCode.split("\\s\\s\\s");
       String[] words2 = new String[words.length];
       String[] words3 = new String[0];

       for (int i = 0; i < words.length ; i++) {
           words2[i] = words[i];
       }

       for (int i = 0; i < words2.length ; i++) {
           words3 = words2[i].split("\\s");
           System.out.print(" ");
           for (int j = 0; j < words3.length; j++) {
               System.out.print(MorseCode.getCode(words3[j]));
           }


       }

   }
}
