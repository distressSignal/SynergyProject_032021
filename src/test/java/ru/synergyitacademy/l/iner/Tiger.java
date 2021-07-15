package ru.synergyitacademy.l.iner;

import ru.synergyitacademy.l.Animal;

public class Tiger extends Animal {
    public Tiger() {
        super("Тигр");
    }

    public Tiger(int age) {
        super("Тигр", age);
        beOlder();
    }

    @Override
    public void jump() {

    }
}
