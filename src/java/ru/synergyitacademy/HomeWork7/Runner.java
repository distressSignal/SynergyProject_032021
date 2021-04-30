package ru.synergyitacademy.HomeWork7;

public class Runner {
    public static void main(String[] args) {
        Participants[] participants = new Participants[]{new Cat("Вася"), new Human("Грегорий"), new Cat("Марфа"), new Robot("Робо")};

        Obstacles[] obstacles = new Obstacles[]{new Wool(2), new Treadmill(400),new Treadmill(50)};

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j] instanceof Wool) {
                    if (!obstacles[j].passed(participants[i].jump())) {
                        System.out.println("Выбыл: " + participants[i].getName());
                        break;
                    }
                } else {
                    if (!obstacles[j].passed(participants[i].run())) {
                        System.out.println("Выбыл: " + participants[i].getName());
                        break;
                    }
                }
            }
        }
    }
}