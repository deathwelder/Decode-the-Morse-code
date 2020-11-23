package ru.codewars.decoder;

import java.util.*;

public class MorseCode {
    public static String getCode (String element) {
        String bufferElement = null;
        ArrayList<String> morseCode = new ArrayList<String>();
        morseCode.add(".-"); //a
        morseCode.add("-..."); //b
        morseCode.add(".--"); //w
        morseCode.add("--."); //g
        morseCode.add("-.."); //d
        morseCode.add("."); //e
        morseCode.add("...-"); //v
        morseCode.add("--.."); //z
        morseCode.add(".."); //i
        morseCode.add(".---"); //j
        morseCode.add("-.-"); //k
        morseCode.add(".-.."); //l
        morseCode.add("--"); //m
        morseCode.add("-."); //n
        morseCode.add("---"); //o
        morseCode.add(".--."); //p
        morseCode.add(".-."); //r
        morseCode.add("..."); //s
        morseCode.add("-"); //t
        morseCode.add("..-"); //u
        morseCode.add("..-."); //f
        morseCode.add("...."); //h
        morseCode.add("-.-."); //c
        morseCode.add("--.-"); //q
        morseCode.add("-..-"); //y
        morseCode.add("-.--"); //x
        morseCode.add("\\s"); //пробел



        if (element.equals(".-")) {
            bufferElement = "a";
        } else if (element.equals("-...")) {
            bufferElement = "b";
        } else if (element.equals(".--")) {
            bufferElement = "w";
        } else if (element.equals("--.")) {
            bufferElement = "g";
        } else if (element.equals("-..")) {
            bufferElement = "d";
        } else if (element.equals(".")) {
            bufferElement = "e";
        } else if (element.equals("...-")) {
            bufferElement = "v";
        } else if (element.equals("--..")) {
            bufferElement = "z";
        } else if (element.equals("..")) {
            bufferElement = "i";
        } else if (element.equals(".---")) {
            bufferElement = "j";
        } else if (element.equals("-.-")) {
            bufferElement = "k";
        } else if (element.equals(".-..")) {
            bufferElement = "l";
        } else if (element.equals("--")) {
            bufferElement = "m";
        } else if (element.equals("-.")) {
            bufferElement = "n";
        } else if (element.equals("---")) {
            bufferElement = "o";
        } else if (element.equals(".--.")) {
            bufferElement = "p";
        } else if (element.equals(".-.")) {
            bufferElement = "r";
        } else if (element.equals("...")) {
            bufferElement = "s";
        } else if (element.equals("-")) {
            bufferElement = "t";
        } else if (element.equals("..-")) {
            bufferElement = "u";
        } else if (element.equals("..-.")) {
            bufferElement = "f";
        } else if (element.equals("....")) {
            bufferElement = "h";
        } else if (element.equals("-.-.")) {
            bufferElement = "c";
        } else if (element.equals("--.-")) {
            bufferElement = "q";
        } else if (element.equals("-..-")) {
            bufferElement = "y";
        } else if (element.equals("-.--")) {
            bufferElement = "x";
        } else System.out.println(" вы ввели не правильный код! ");


        return bufferElement;
    }
}
