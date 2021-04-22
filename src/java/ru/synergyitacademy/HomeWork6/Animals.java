package ru.synergyitacademy.HomeWork6;

public class Animals {
    public String name = " ";
    public Animals(String name) {
        this.name = name;
        voice();
    }

    public Animals() {
    }

    public void voice() {
        System.out.println("");
    }
}

class Dog extends Animals {
    @Override
    public void voice() {
        System.out.println("Гав");
    }

    public Dog(String name) {
        this.name = name;
        voice();
    }

}

class Cat extends Animals {
    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    public Cat(String name) {
        this.name = name;
        voice();
    }

}

class Bird extends Animals {
    public void voice() {
        System.out.println("Чик-Чирик");
    }

    public Bird(String name) {
        this.name = name;
        voice();
    }

}