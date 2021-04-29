package ru.synergyitacademy.HomeWork7;

public interface Obstacles {

    boolean ok =true;

    default void jump(double jump) {
    }

    default void run(double run) {
    }

    default boolean isOk() {
        return ok;
    }
}

