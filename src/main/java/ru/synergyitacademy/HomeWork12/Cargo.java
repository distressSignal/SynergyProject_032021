package ru.synergyitacademy.HomeWork12;

public class Cargo implements Car {
    private int number, speed, weight;
    private double height, length, width;

    public Cargo() {
        this.number = 1000 + (int) (Math.random() * 1999);
        this.speed = 40 + (int) (Math.random() * 60);
        this.weight = 2 + (int) (Math.random() * 12);
        this.height = 2 + (int) (Math.random() * 5);
        this.length = 4 + (int) (Math.random() * 15);
        this.width = 0.5 + (Math.random() * 3);
    }

    public int getNumber() {
        return number;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void speedRun() throws MaxSpeedExc80, MaxSpeedExc100 {
        if (getSpeed() < 80) {
            System.out.println("Машина с номером: " + getNumber() + " движется со скоростью" + getSpeed());
        } else if (getSpeed() < 100) {
            throw new MaxSpeedExc80("Машина с номером: " + getNumber() + " движется со скоростью быстрее чем 80 ");
        } else {
            throw new MaxSpeedExc100("Авто с номером:" + getNumber() + " задержано полицией");
        }
    }

    @Override
    public void overelCar(KPP kpp) throws WeightException, HeightException, WidthException {
        if (getWeight() > kpp.getWeight()) {
            throw new WeightException("Авто с №" + getNumber() + " не прошло контроль по весу.");
        } else if (getHeight() > kpp.getHeight()) {
            throw new HeightException("Авто с №" + getNumber() + " не прошло контроль по высоте.");
        } else if (getWidth() > kpp.getWidth()) {
            throw new WidthException("Авто с №" + getNumber() + " не прошло контроль по ширине.");
        } else {
            System.out.println("Авто с №" + getNumber() + " имеет габариты (высота - " + getHeight() + " ширина - " + getWidth() + " длинна - " + getLength() + ") и весит - " + getWeight());
        }

    }
}
