package com.teachmeskills.lesson8.task1;

public class Main {
    public static void main(String[] args) {
        Methods string = new Methods("Я изучаю программирование. Java - интересный язык, но сложный для новичка.");
        Methods string2 = new Methods("Дед казак пошел в шалаш и услышал топот");
        Methods string3 = new Methods("Привет. Я иду гулять. Хочу сходить на улицу Ленинскую. Слышу топот. Там идет какой-то человек с собакой.");

        System.out.println(string.cutFromString(27, 49));
        System.out.println();

        System.out.println(string.replaceCharacter());
        System.out.println();

        string2.printSplitString();
        System.out.println();

        System.out.println(string3.getText());
        string3.getSentencesWithThreeFiveWords();
        System.out.println();

        System.out.println("Количество слов в строке '" + string2.getText() + "': " + TextFormatterUtils.findWordsNumber(string2.getText()));
        System.out.println("Есть ли в строке '" + string.getText() + "' слово-палиндром: " + TextFormatterUtils.isTherePalindrome(string.getText()));

    }
}
