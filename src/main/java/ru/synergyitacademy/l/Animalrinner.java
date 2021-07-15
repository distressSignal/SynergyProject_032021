package ru.synergyitacademy.l;

import ru.synergyitacademy.l.iner.Tiger;

public class Animalrinner {
    public static void main(String[] args) {
        final Cat cat = new Cat(25);
        Jump jump = new Jump();
//       cat = new Cat(5);
        Animal[] animals = new Animal[]{new Cat(), new Dog(-1)};
        Jump[]jumps = new Jump[2];
        for (int i = 0; i <animals.length ; i++) {
            animals[i].jump();
        }

//        for (Animal animal : animals) {
//            animal.voice();
//            animal.jump();
//            jump.jumpingTo(animal);
//        }




        Animal tiger = new Tiger(25);
        tiger.feed(cat);
        System.out.println(Dog.amount);
        System.out.println(Cat.anInt);
        Animal.kill(tiger);

        Human human = new Human();
        cat.feed(human);
        human.feef(cat);
    }
}
