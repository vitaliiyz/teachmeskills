package com.teachmeskills.lesson6.task1;

public class Truck extends GroundTransport implements TransportMethods{

    private int loadCapacity;

    Truck(int power, int maxSpeed, int weight, String brand, int wheelsNumber, double fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, brand, wheelsNumber, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void describeTransport() {
        System.out.println("Грузовой автомобиль имеет: " + "мощность (л.с.) " + power + ", максимальную скорость (км/ч) " +
                maxSpeed + ", вес (кг) " + weight + ", марку " + brand + ", количетво колес " + wheelsNumber +
                ", расход топлива (л/100км) " + fuelConsumption + ", грузоподъемность (кг) " + loadCapacity +
                ", мощность в киловаттах: " + calculatePowerInKilowatts(power) + ".");
    }

    @Override
    public void checkCapacity(int loadingAmount, int capacity, String transportType) {
        TransportMethods.super.checkCapacity(loadingAmount, capacity, transportType);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
