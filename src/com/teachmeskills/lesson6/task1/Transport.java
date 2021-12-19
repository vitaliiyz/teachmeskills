package com.teachmeskills.lesson6.task1;

public abstract class Transport {
    protected int power;
    protected int maxSpeed;
    protected int weight;
    protected String brand;


    Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }
}
