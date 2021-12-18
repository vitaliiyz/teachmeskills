package com.teachmeskills.lesson6.task1;

public class MilitaryAirTransport extends AirTransport {

    private boolean isThereEjectionSystems;
    private int missilesNumber;

    public MilitaryAirTransport(int power, int speed, double weight, String brand, int wingspan, int minRunway, boolean isThereEjectionSystems, int missilesNumber) {
        super(power, speed, weight, brand, wingspan, minRunway);
        this.isThereEjectionSystems = isThereEjectionSystems;
        this.missilesNumber = missilesNumber;
    }
}
