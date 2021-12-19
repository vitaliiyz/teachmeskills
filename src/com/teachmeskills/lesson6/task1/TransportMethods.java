package com.teachmeskills.lesson6.task1;

public interface TransportMethods {

    void describeTransport();

    default double calculatePowerInKilowatts(int power) {
        return (double) power * 0.74;
    }

    default void checkCapacity(int loadingAmount, int capacity, String transportType) {
        if (loadingAmount > capacity) {
            System.out.println("Вам нужен " + transportType + " побольше.");
        } else {
            System.out.println(transportType + " загружен.");
        }
    }

}
