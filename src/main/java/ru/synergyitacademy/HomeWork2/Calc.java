package ru.synergyitacademy.HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) {
        String a = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            a = reader.readLine();


        } catch (IOException e) {

            e.printStackTrace();
        }

        String[] cif = a.split("[+/*-]");//Todo:Отделить числа от знаков

        char qw = a.charAt(cif[0].length());

        String num1 = cif[0];
        String num2 = cif[1];
        System.out.println("n");


        boolean b = (num1.contains(".")) || (num1.contains(",")) || (num2.contains(".")) || (num2.contains(","));// Todo ПоКнять, целое число или нет. а дальше использовать метод

        if (b) {
            System.out.println(calculate(Double.parseDouble(num1), Double.parseDouble(num2), qw));// Todo не получилось запихнуть выражение в тернарник.
        } else {
            System.out.println(calculate(Integer.parseInt(num1), Integer.parseInt(num2), qw));
        }


    }

    public static int calculate(int number1, int number2, char operation) {
        int result = 0;
        result = (int) getResult(number1, number2, operation);
        return result;
    }

    public static double calculate(double number1, double number2, char operation) {
        double result = 0;
        result = getResult(number1, number2, operation);
        return result;

    }

    private static double getResult(double number1, double number2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = (number1 / number2);
                if (number2 == 0) {
                    throw new IllegalArgumentException("Нельзя делить на ноль");
                } else if (number1 == 0) {
                    throw new IllegalArgumentException("Ноль нельзя делить");
                }
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");

        }
        return result;
    }
}