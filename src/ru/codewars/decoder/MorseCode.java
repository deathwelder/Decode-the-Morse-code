package ru.codewars.decoder;

import java.util.*;

public class MorseCode {
    public static String getCode (String element) {
        String bufferElement = null;
        Map<String, String> morseCode = new HashMap<>();

        morseCode.put(".-", "a"); //a
        morseCode.put("-...", "b"); //b
        morseCode.put(".--", "w"); //w
        morseCode.put("--.", "g"); //g
        morseCode.put("-..", "d"); //d
        morseCode.put(".", "e"); //e
        morseCode.put("...-", "v"); //v
        morseCode.put("--..", "z"); //z
        morseCode.put("..", "i"); //i
        morseCode.put(".---", "j"); //j
        morseCode.put("-.-", "k"); //k
        morseCode.put(".-..", "l"); //l
        morseCode.put("--", "m"); //m
        morseCode.put("-.", "n"); //n
        morseCode.put("---", "o"); //o
        morseCode.put(".--.", "p"); //p
        morseCode.put(".-.", "r"); //r
        morseCode.put("...", "s"); //s
        morseCode.put("-", "t"); //t
        morseCode.put("..-", "u"); //u
        morseCode.put("..-.", "f"); //f
        morseCode.put("....", "h"); //h
        morseCode.put("-.-.", "c"); //c
        morseCode.put("--.-", "q"); //q
        morseCode.put("-..-", "y"); //y
        morseCode.put("-.--", "x"); //x



        return bufferElement = morseCode.get(element);
    }
}
