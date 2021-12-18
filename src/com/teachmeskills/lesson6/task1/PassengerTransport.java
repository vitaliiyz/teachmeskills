package com.teachmeskills.lesson6.task1;

public class PassengerTransport extends GroundTransport{

    private String bodyType;
    private int passengerNumber;

    public PassengerTransport(int power, int speed, double weight, String brand, int wheelsNumber, int fuelConsumption, String bodyType, int passengerNumber) {
        super(power, speed, weight, brand, wheelsNumber, fuelConsumption);
        this.bodyType = bodyType;
        this.passengerNumber = passengerNumber;
    }
}
