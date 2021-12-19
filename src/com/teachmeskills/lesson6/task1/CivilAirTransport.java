package com.teachmeskills.lesson6.task1;

public class CivilAirTransport extends AirTransport implements TransportMethods{

    private int passengerNumber;
    private boolean isBusinessClass;

    CivilAirTransport(int power, int maxSpeed, int weight, String brand, double wingspan, int minRunway,
                      int passengerNumber, boolean isBusinessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minRunway);
        this.passengerNumber = passengerNumber;
        this.isBusinessClass = isBusinessClass;
    }

    @Override
    public void describeTransport() {
        System.out.println("Гражданский авиационный транспорт имеет: мощность л.с. " + power + ", максимальную скорость км/ч " + maxSpeed +
                ", вес кг " + weight + ", марку " + brand + ", размах крыльев м " + wingspan +
                ", минимальную длину взлётно-посадочной полосы для взлёта м " + minRunway + ", вместительноть пассажиров чел " +
                passengerNumber + ", является бизнес-классом: " + (isBusinessClass?"да":"нет") +
                ", мощность в киловаттах: " + calculatePowerInKilowatts(power) + ".");
    }

}
