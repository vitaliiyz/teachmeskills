package com.teachmeskills.lesson6.task1;

public interface TransportMethods {

    void describeTransport();

    default double calculatePowerInKilowatts(int power) {
        return (double) power * 0.74;
    }

}
