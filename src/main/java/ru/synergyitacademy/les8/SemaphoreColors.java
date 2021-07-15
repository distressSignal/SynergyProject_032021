package ru.synergyitacademy.les8;

public enum SemaphoreColors {
    RED("красный"), YELLOW("желтый"), GREEN("зеленый");

    String color;

    SemaphoreColors(String name) {
        this.color =name;
    }

    public void print(){
        System.out.println(color);
    }
}
