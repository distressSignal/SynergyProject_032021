package ru.synergyitacademy.HomeWork9;

import java.util.Arrays;

public class Car implements Cloneable {

    private Driver[] drivers;
    private final String brand;
    private final String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setDrivers(Driver... drivers) {
        this.drivers =drivers;
    }


    public  Car clone() throws CloneNotSupportedException {

        Car newCar =(Car) super.clone();
        Driver[] newDrivers = new Driver[newCar.drivers.length];
        for (int i = 0; i < newCar.drivers.length; i++) {
            newDrivers[i] = newCar.drivers[i].clone();
        }

        newCar.setDrivers(newDrivers);
        return newCar;
    }

    static class Driver implements Cloneable{

        public Driver clone() throws CloneNotSupportedException{
            return (Driver) super.clone();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", drivers=" + Arrays.toString(drivers)+
                '}';
    }





}
