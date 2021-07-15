package ru.synergyitacademy.Less12;

import ru.synergyitacademy.Less11.Calculator;

public class ExceptionRunner {
    public static void main(String[] args) {
        try {
            calculate();
        } catch (CustomRuntimeException e){
            e.printStackTrace();
            
        }
        long value = -125L;
        if (value > 0) {
            System.out.println(value);
        }
        else {
            throw new CustomRuntimeException();
        }
    }

    private static void calculate() {
    }
}
