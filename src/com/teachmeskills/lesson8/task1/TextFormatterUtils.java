package com.teachmeskills.lesson8.task1;

public class TextFormatterUtils {

    public static int findWordsNumber(String text) {
        String[] wordsInText = text.split(" ");
        return wordsInText.length;
    }

    public static boolean isTherePalindrome(String text) {
        boolean isPalindrome = false;
        String allText = text.replaceAll("\\. ", " ");
        String[] textInArray = allText.split(" ");

        for (String word : textInArray) {
            int n = word.length();
            for (int i = 0; i < n / 2; i++) {
                if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(word.charAt(n - i - 1))) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                break;
            }
        }
        return isPalindrome;
    }
}
