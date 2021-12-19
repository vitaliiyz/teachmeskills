package com.teachmeskills.lesson6.task1;

public class PassengerTransport extends GroundTransport implements TransportMethods {

    private String bodyType;
    private int passengerNumber;

    PassengerTransport(int power, int maxSpeed, int weight, String brand, int wheelsNumber,
                       double fuelConsumption, String bodyType, int passengerNumber) {
        super(power, maxSpeed, weight, brand, wheelsNumber, fuelConsumption);
        this.bodyType = bodyType;
        this.passengerNumber = passengerNumber;
    }

    @Override
    public void describeTransport() {
        System.out.println("Легковой автомобиль имеет: " + "мощность (л.с.) " + power + ", максимальную скорость (км/ч) " +
                maxSpeed + ", вес (кг) " + weight + ", марку " + brand + ", количетво колес " + wheelsNumber +
                ", расход топлива (л/100км) " + fuelConsumption + ", тип кузова: " + bodyType + ", количество пассажирских мест " + passengerNumber +
                ", мощность в киловаттах: " + calculatePowerInKilowatts(power) + ".");
    }

    public void printDistanceAndFuelForTimeWithMaxSpeed(double hours) {
        double distance = maxSpeed * hours;

        System.out.println("За время " + hours + " ч, автомобиль " + brand + " двигаясь с максимальной скоростью " +
                maxSpeed + " км/ч проедет " + distance + " км и израсходует " + calculateFuel(distance) + " литров топлива.");
    }

    private double calculateFuel(double distance) {
        return distance / 100 * fuelConsumption;
    }


}
