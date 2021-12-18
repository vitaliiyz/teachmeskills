package com.teachmeskills.lesson6.task1;

public abstract class AirTransport extends Transport{

    protected int wingspan;
    protected int minRunway;

    public AirTransport(int power, int speed, double weight, String brand, int wingspan, int minRunway) {
        super(power, speed, weight, brand);
        this.wingspan = wingspan;
        this.minRunway = minRunway;
    }
}
