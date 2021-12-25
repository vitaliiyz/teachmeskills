package com.teachmeskills.lesson8.task1;

public class Methods {
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

    //3 task split fori lengts/2
}
