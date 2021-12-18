package com.teachmeskills.lesson6.task1;

public class CivilAirTransport extends AirTransport{

    private int passengerNumber;
    private boolean isBusinessClass;

    public CivilAirTransport(int power, int speed, double weight, String brand, int wingspan, int minRunway, int passengerNumber, boolean isBusinessClass) {
        super(power, speed, weight, brand, wingspan, minRunway);
        this.passengerNumber = passengerNumber;
        this.isBusinessClass = isBusinessClass;
    }
}
