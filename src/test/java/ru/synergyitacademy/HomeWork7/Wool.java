package ru.synergyitacademy.HomeWork7;

public class Wool implements Obstacles {
    double distance;

    public Wool(double distance) {
        this.distance = distance;
    }

    public boolean passed(double d) {
        if (this.distance >= d) {
            System.out.println(" не получилось ");
            return false;
        } else {
            System.out.println("успешно прыгнул");
            return true;
        }
    }
}
