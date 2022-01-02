package com.teachmeskills.lesson7.task1;

public class Cat extends Animal{

    private String catColor;

    public Cat(String food, String location, String catColor) {
        super(food, location);
        this.catColor = catColor;
    }


    @Override
    public void makeNoise() {
        System.out.println("Кот мяукает.");
    }

    @Override
    public void eat() {
        System.out.println("Кот кушает. У него в миске " + food + ".");
    }

    @Override
    public void sleep() {
        System.out.println("Кот спит.");
    }

}
