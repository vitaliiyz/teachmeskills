package com.teachmeskills.lesson6.task1;

public abstract class AirTransport extends Transport{

    protected double wingspan;
    protected int minRunway;

    AirTransport(int power, int maxSpeed, int weight, String brand, double wingspan, int minRunway) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunway = minRunway;
    }
}
