package ru.synergyitacademy.HomeWork7;

public class Treadmill implements Obstacles {
    double distance;
    boolean ok = true;

    public boolean isOk() {
        return ok;
    }
    public Treadmill(double distance) {
        this.distance =distance;
    }
    public void run(double d) {
        if (distance>=d){
            System.out.println("Не получилось");
            ok=false;
        }else {
            System.out.println("Успешно пробежал");
            ok=true;
        }
    }
}
