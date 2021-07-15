package ru.synergyitacademy.l;

public abstract class Animal {
    private static final long MAX_Amount = 15551221221L;
    public static int amount;
    private final String animalType;
    private int age;

    public Animal(String type) {
        this.animalType = type;
        this.age = 0;
        amount++;
    }

    public Animal(String type, int age) {
        this(type);
        this.age = age;
    }

    final void voice() {
        if (checkAge()) {
            System.out.println("This animal " + toString());
        } else {
            System.out.println("Проверьте возраст животного");
        }
    }

    protected void beOlder() {
        if (checkAge()) {
            age++;
        }
    }

    public boolean checkAge() {
        return !(this.age <= 0 || this.age >= 50);
    }

    public String toString() {
        switch (animalType) {
            case "Cat":
                return "myau";
            case "Dog":
                return "gav";
            default:
                return "Ничего не делать";
        }

    }

    public void feed(Animal animal) {
        kill(animal);

    }

    public void feed(Human human){
        human.feef(this);
    }

    public static void kill(Animal animal) {
        animal.age = 0;
    }

    public abstract void jump();


}

