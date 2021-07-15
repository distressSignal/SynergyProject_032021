package ru.synergyitacademy.HomeWork12;

public class Runner extends RuntimeException{
    public static void main(String[] args)throws MaxSpeedExc100,MaxSpeedExc80,WeightException,WidthException {
        KPP kpp = new KPP();

        Car[] car = new Car[30];
        for (int i=0; i<30; i++) {
            int x = 1 + (int) (Math.random() * 2);
            if (x == 1) {
                car[i] = new Pass();
            } else {
                car[i] = new Cargo();
            }
        }


        for (int i=0; i < car.length; i++) {
            try {
                System.out.println("------------------------------------------------------------------------------");
                car[i].speedRun();
                car[i].overelCar(kpp);
                System.out.println("------------------------------------------------------------------------------");
            } catch (MaxSpeedExc80 | MaxSpeedExc100 | WeightException | HeightException | WidthException e) {
                System.out.println(e);
            }
        }

    }
}
