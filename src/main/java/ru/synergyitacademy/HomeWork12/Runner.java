package ru.synergyitacademy.HomeWork12;

public class Runner extends RuntimeException {
    public static void main(String[] args) throws MaxSpeedExc100, MaxSpeedExc80, WeightException, WidthException {
        Kpp kpp = new Kpp();

        Car[] car = new Car[30];
        for (int i = 0; i < 30; i++) {
            int x = 1 + (int) (Math.random() * 2);
            if (x == 1) {
                car[i] = new Pass();
            } else {
                car[i] = new Cargo();
            }
        }

        kpp.checkCar(car);

    }
}
