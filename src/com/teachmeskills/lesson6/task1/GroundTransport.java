package com.teachmeskills.lesson6.task1;

public abstract class GroundTransport extends Transport{

    protected int wheelsNumber;
    protected double fuelConsumption;

    GroundTransport(int power, int maxSpeed, int weight, String brand, int wheelsNumber, double fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.wheelsNumber = wheelsNumber;
        this.fuelConsumption = fuelConsumption;
    }
}
