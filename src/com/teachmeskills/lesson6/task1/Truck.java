package com.teachmeskills.lesson6.task1;

public class Truck extends GroundTransport{

    private double loadCapacity;

    public Truck(int power, int speed, double weight, String brand, int wheelsNumber, int fuelConsumption, double loadCapacity) {
        super(power, speed, weight, brand, wheelsNumber, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }
}
