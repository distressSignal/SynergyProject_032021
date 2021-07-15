package ru.synergyitacademy.les8;

import ru.synergyitacademy.les8.another.B;
import ru.synergyitacademy.les8.another.D;

public class Launcher {
    public static void main(String[] args) {
        B b = new B();
        b.anotherM();

        D d = new D();
        System.out.println(d.getIndex());
        b.modify(d);
        System.out.println(d.getIndex());

       SemaphoreColors colors =  SemaphoreColors.GREEN;

        switch (colors){
            case RED:{
            }
            case YELLOW:{
            }
            case GREEN:{
            }
        }
        colors.print();
        System.out.println(colors.name());

       SemaphoreColors semaphoreColors = SemaphoreColors.valueOf("YELLOW");
       semaphoreColors.print();
        System.out.println(semaphoreColors.name());
        System.out.println(semaphoreColors.ordinal());
    }
}
