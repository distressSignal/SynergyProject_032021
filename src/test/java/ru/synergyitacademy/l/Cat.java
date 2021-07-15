package ru.synergyitacademy.l;

public class Cat extends Animal {
  public static int anInt;
    public Cat() {
        super("Cat",1);
        anInt++;

    }
    public Cat(int age) {
        super("Cat",age);
        anInt++;
    }

    @Override
    public void jump() {
        System.out.println("Киса прыгает");
    }

    static class Kitty{

}
}
