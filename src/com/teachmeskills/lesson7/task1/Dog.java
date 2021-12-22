package com.teachmeskills.lesson7.task1;

public class Dog extends Animal{

    private String dogType;

    public Dog(String food, String location, String dogType) {
        super(food, location);
        this.dogType = dogType;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
