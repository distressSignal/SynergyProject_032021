package ru.synergyitacademy.Less12;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    public CustomException() {
        super("Exception hapens");
    }
}
