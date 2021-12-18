package com.teachmeskills.lesson6.task1;

public abstract class Transport {
    protected int power;
    protected int speed;
    protected double weight;
    protected String brand;


    public Transport(int power, int speed, double weight, String brand) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.brand = brand;
    }
}
