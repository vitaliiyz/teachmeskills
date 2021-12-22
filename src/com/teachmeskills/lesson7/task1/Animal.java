package com.teachmeskills.lesson7.task1;

public abstract class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {

    }

    public void eat() {

    }

    public void sleep(Animal animal) {
        System.out.println(animal + " спит.");
    }

}
