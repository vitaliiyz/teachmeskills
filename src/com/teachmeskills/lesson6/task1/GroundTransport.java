package com.teachmeskills.lesson6.task1;

public abstract class GroundTransport extends Transport{

    protected int wheelsNumber;
    protected int fuelConsumption;

    public GroundTransport(int power, int speed, double weight, String brand, int wheelsNumber, int fuelConsumption) {
        super(power, speed, weight, brand);
        this.wheelsNumber = wheelsNumber;
        this.fuelConsumption = fuelConsumption;
    }
}
