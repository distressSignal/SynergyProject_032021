package ru.synergyitacademy.l;

public class Dog extends Animal{
    public Dog() {
        super("Dog",1);
    }
    public Dog(int age){
        super("Dog ",age);
    }

    @Override
    public void jump() {
    }
}
