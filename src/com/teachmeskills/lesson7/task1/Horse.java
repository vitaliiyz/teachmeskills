package com.teachmeskills.lesson7.task1;

public class Horse extends Animal{

    private boolean isFoal;

    public Horse(String food, String location, boolean isFoal) {
        super(food, location);
        this.isFoal = isFoal;
    }
}
