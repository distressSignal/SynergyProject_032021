package ru.synergyitacademy.HomeWork12;

public interface Car {
    void speedRun()throws MaxSpeedExc80,MaxSpeedExc100;

    void overelCar(KPP kpp) throws WeightException, HeightException, WidthException;

}
