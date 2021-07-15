package ru.synergyitacademy.HomeWork7;

public class Treadmill implements Obstacles {
    double distance;

    public Treadmill(double distance) {
        this.distance = distance;
    }

    public boolean passed(double d) {
        if (distance >= d) {
            System.out.println("Не получилось");
            return false;
        } else {
            System.out.println("Успешно пробежал");
            return true;
        }
    }
}
