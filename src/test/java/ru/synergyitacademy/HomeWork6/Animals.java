package ru.synergyitacademy.HomeWork6;

public class Animals {

    public Animals() {
    }

    public void voice() {
    }
}

class Dog extends Animals {

    public Dog() {
    }

    @Override
    public void voice() {
   System.out.println("Гав");;
    }
}

    class Cat extends Animals {
    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    public Cat() {
    }

}

class Bird extends Animals {
    public void voice() {
        System.out.println("Чик-чирик");
    }
    public Bird() {
    }
}