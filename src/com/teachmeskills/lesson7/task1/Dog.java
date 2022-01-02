package com.teachmeskills.lesson7.task1;

public class Dog extends Animal{

    private String dogType;

    public Dog(String food, String location, String dogType) {
        super(food, location);
        this.dogType = dogType;
    }


    @Override
    public void makeNoise() {
        System.out.println("Собака гавкает.");
    }

    @Override
    public void eat() {
        System.out.println("Собака кушает. У неё в миске " + food + ".");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит.");
    }
}
