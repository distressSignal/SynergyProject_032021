package ru.synergyitacademy.HomeWork6;

public class ArrAcc {
    public static void main(String[] args) {
        Animals[] animals = new Animals[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Bird();

        for (Animals animal : animals) {
            animal.voice();
        }
    }
}
