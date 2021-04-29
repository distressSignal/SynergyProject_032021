package ru.synergyitacademy.HomeWork7;

public class Human extends Cat {
    final double MAX_RUN = 500;
    final double MAX_JUMP = 2;
    double run;
    double jump;
    String name;

    public Human() {
        this.run = 0+Math.random() * MAX_RUN;
        this.jump = 0+Math.random() * MAX_JUMP;
    }

    public Human(String name) {
        this();
        this.name = name;
    }


    public String getName() {
        return "Человек " + name;
    }

    @Override
    double run() {
        System.out.print("Человек пробежал");
        return this.run;
    }

    @Override
    double jump() {
        System.out.print("Человек пытается прыгнуть...");
        return this.jump;
    }
}
