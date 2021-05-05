package ru.synergyitacademy.HomeWork9;

import ru.synergyitacademy.HomeWork9.Car.Driver;


public class Runner {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Hyundai", "veloster");
        Driver driver = new Driver();
        Driver newDriver = new Driver();

        car.setDrivers(driver, newDriver);

        Car anotherCar = car.clone();

        System.out.println(driver);
        System.out.println(newDriver);
        System.out.println(anotherCar);
        System.out.println(car);

    }
}