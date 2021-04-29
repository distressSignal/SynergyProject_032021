package ru.synergyitacademy.HomeWork7;

public class Cat extends Participants {
    final double MAX_RUN = 500;
    final double MAX_JUMP = 3;
    double run;
    double jump;
    String name;

    public Cat() {
        this.run = 0 + Math.random() * MAX_RUN;
        this.jump = 0 + Math.random() * MAX_JUMP;
    }

    @Override
    public String getName() {
        return "Кот " + name;
    }

    public Cat(String name) {
        this();
        this.name = name;
    }

    @Override
    double run() {
        System.out.print("Кот " + name + " пытается бежать.... ");
        return this.run;
    }

    @Override
    double jump() {
        System.out.print("Кот " + name + " пытается прыгнуть....");
        return this.jump;
    }
}

