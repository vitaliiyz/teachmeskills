package com.teachmeskills.lesson8.task1;

public class Methods<isPalindrome> {
    private String text;

    public Methods(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    //1 task
    public String cutFromString(int from, int to) {
        return text.substring(from, to);
    }

    //2 task
    public String replaceCharacter() {
        char[] arrayString = text.toCharArray();
        char oldChar = arrayString[3];
        char newChar = arrayString[0];
        return text.replace(oldChar, newChar);
    }

    //3 task
    public void printSplitString() {
        String[] wordsInSentence = text.split(" ");
        System.out.println("Слова палиндромы:");

        for (String word : wordsInSentence) {
            if (findPalindrome(word)) {
                System.out.println(word);
            }
        }
    }

    public boolean findPalindrome(String string) {
        boolean isPalindrome = false;
        int n = string.length();

        for (int i = 0; i < n / 2; i++) {
            if (Character.toLowerCase(string.charAt(i)) == Character.toLowerCase(string.charAt(n - i - 1))) {
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
        String sentence = text.replaceAll("\\. ", ".");
        String[] sentences = sentence.split("\\.");
        System.out.println("Предложение с 3 - 5 словами и/или палиндромами:");

        for (String oneSentence : sentences) {
            String[] wordsInSentence = oneSentence.split(" ");

            if (wordsInSentence.length >= 3 && wordsInSentence.length <= 5) {
                System.out.println(oneSentence);
            } else {
                for (String word : wordsInSentence) {
                    if (findPalindrome(word)) {
                        System.out.println(oneSentence);
                    }
                }
            }
        }
    }
}
