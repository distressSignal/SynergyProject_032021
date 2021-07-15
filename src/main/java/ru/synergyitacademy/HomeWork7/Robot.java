package ru.synergyitacademy.HomeWork7;

public class Robot extends Human{
    final double MAX_RUN = 2500;
    final double MAX_JUMP = 20;
    double run;
    double jump;
    String name;

    public Robot(String name) {
        this.name = name;
        this.run = MAX_RUN;
        this.jump = MAX_JUMP;
    }

    public String getName() {
        return "Робот " + name;
    }

    @Override
    double run() {
        System.out.print("Робот пытается бежать...");
        return this.run;
    }

    @Override
    double jump() {
        System.out.print("Робот пытается прыгнуть...");
        return this.jump;
    }
}
