package com.teachmeskills.lesson8.task1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Methods<isPalindrome> {
    private String string;

    public Methods(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    //1 task
    public String cutFromString(int from, int to) {
        return string.substring(from, to);
    }

    //2 task
    public String replaceCharacter() {
        char[] arrayString = string.toCharArray();
        char oldChar = arrayString[3];
        char newChar = arrayString[0];
        return string.replace(oldChar, newChar);
    }

    //3 task
    public void printSplitString() {
        String[] wordsInSentence = string.split(" ");
        System.out.println("Слова палиндромы:");

        for (String word : wordsInSentence) {
            if (findPalindrome(word)) {
                System.out.println(word);
            }
        }
    }

    public boolean findPalindrome(String string) {
        boolean isPalindrome = false;
        string.replace(".", "");

        for (int i = 0; i < string.length() / 2; i++) {
            if (Character.toLowerCase(string.charAt(i)) == Character.toLowerCase(string.charAt(string.length() - i - 1))) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    //4 task
    public void getSentencesWithThreeFiveWords() {
        String[] sentences = string.split("\\. ");
        System.out.println("Предложение с 3 - 5 словами и/или палиндромами:");

        for (String sentence : sentences) {
            String[] wordsInSentence = sentence.split(" ");

            if (wordsInSentence.length >= 3 && wordsInSentence.length <= 5) {
                System.out.println(sentence);
            } else {
                for (String word : wordsInSentence) {
                    if (findPalindrome(word)) {
                        System.out.println(sentence);
                    }
                }
            }
        }
    }
}
