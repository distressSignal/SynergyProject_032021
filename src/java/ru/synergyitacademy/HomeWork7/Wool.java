package ru.synergyitacademy.HomeWork7;

public class Wool implements Obstacles {
    double distance;
    boolean ok = true;

    public boolean isOk() {
        return ok;
    }

    public Wool(double distance) {
        this.distance =distance;
    }

    public void jump(double d) {
        if (this.distance>=d){
            System.out.println(" не получилось ");
            ok = false;
        }else {
            System.out.println("успешно прыгнул");
            ok =true;
        }
    }
}
