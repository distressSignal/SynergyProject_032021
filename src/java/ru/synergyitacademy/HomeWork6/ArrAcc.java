package ru.synergyitacademy.HomeWork6;

public class ArrAcc extends Animals {
    public static void main(String[] args) {
        Animals[] animals = new Animals[3];
        animals[0] = new Cat("Марфа");
        animals[1] = new Dog("Фэйри");
        animals[2] = new Bird("Тефтеля");
    }
}
