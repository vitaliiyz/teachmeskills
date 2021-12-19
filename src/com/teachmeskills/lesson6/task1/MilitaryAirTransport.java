package com.teachmeskills.lesson6.task1;

public class MilitaryAirTransport extends AirTransport implements TransportMethods{

    private boolean isThereEjectionSystems;
    private int missilesNumber;

    MilitaryAirTransport(int power, int maxSpeed, int weight, String brand, double wingspan, int minRunway,
                         boolean isThereEjectionSystems, int missilesNumber) {
        super(power, maxSpeed, weight, brand, wingspan, minRunway);
        this.isThereEjectionSystems = isThereEjectionSystems;
        this.missilesNumber = missilesNumber;
    }

    @Override
    public void describeTransport() {
        System.out.println("Военный авиационный транспорт имеет: мощность л.с. " + power + ", максимальную скорость км/ч " + maxSpeed +
                ", вес кг " + weight + ", марку " + brand + ", размах крыльев м " + wingspan +
                ", минимальную длину взлётно-посадочной полосы для взлёта м " + minRunway + ", система катапультрования: " +
                (isThereEjectionSystems?"да":"нет") + ", количество ракет: " + missilesNumber +
                ", мощность в киловаттах: " + calculatePowerInKilowatts(power) + ".");
    }

    public void fireByMissile() {
        if (missilesNumber == 0) {
            System.out.println("Боеприпасы отсутствуют");
        } else {
            System.out.println("Ракета пошла...");
            missilesNumber--;
        }
    }

    public void eject() {
        if (isThereEjectionSystems) {
            System.out.println("Катапультрование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
