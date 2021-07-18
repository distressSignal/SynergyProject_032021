package ru.synergyitacademy.HomeWork12;

public class Kpp {
    private int weight;
    private double height, width;

    void checkCar(Car[] car){
        for (Car value : car) {
            try {
                System.out.println("------------------------------------------------------------------------------");
                value.speedRun();
                value.overelCar(Kpp.this);
                System.out.println("------------------------------------------------------------------------------");
            } catch (MaxSpeedExc80 | MaxSpeedExc100 | WeightException | HeightException | WidthException e) {
                System.out.println(e);
            }
        }
    }
    public Kpp() {
        this.weight = 8;
        this.height = 4;
        this.width = 2.4;
    }

    public int getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
