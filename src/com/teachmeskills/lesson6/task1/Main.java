package com.teachmeskills.lesson6.task1;

public class Main {
    public static void main(String[] args) {
        CivilAirTransport civilAirTransport = new CivilAirTransport(25000, 890, 42100,
                "Airbus A320", 35.8, 2090, 180, false);
        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport(100000, 2400, 14750,
                "МиГ-29", 11.36, 260, true, 6);
        PassengerTransport passengerTransport = new PassengerTransport(177, 228, 1550,
                "Audi A6 2.0 TDI (4G,C7)", 4, 4.9, "седан", 5);
        Truck truck = new Truck(150, 130, 3400, "MERCEDES-BENZ Atego 815",
                4, 18, 4100);

        civilAirTransport.describeTransport();
        militaryAirTransport.describeTransport();
        passengerTransport.describeTransport();
        truck.describeTransport();
    }
}
