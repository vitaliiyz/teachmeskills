package com.teachmeskills.lesson7.task1;

public class Horse extends Animal{

    private boolean isFoal;

    public Horse(String food, String location, boolean isFoal) {
        super(food, location);
        this.isFoal = isFoal;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржёт.");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь кушает. У неё в миске " + food + ".");
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит.");
    }


}
