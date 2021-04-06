package ru.synergyitacademy.HomeWork3;


import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        quadraticEquation(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        primeNumber();
        sqrt(49);
        System.out.println(" Введите число последовательности Фибоначчи ");
        fib(scanner.nextInt());


    }

    public static void fib(int n) {

        int previousNumber = 0;
        int nextNumber = 1;

        for (int k = 1; k <= n; k++) {
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            if (n == k) {
                System.out.println(sum);
            }


        }
    }

    public static void primeNumber() {
        boolean isprime;
        int i = 2;
        while (i <= 1000) {
            isprime = true;
            for (int l = 2; l <= i / l; l++)
                if (i % l == 0)
                    isprime = false;
            if (isprime)
                System.out.println(i);
            i++;
        }


    }

    public static void sqrt(int number) {
        int ch2 = number;
        int sc = 0;
        for (int k = 1; k <= number; k += 2) {
            sc++;
            number += -k;
        }
        if ((sc * sc) != ch2) {
            System.out.println("вычислить корень указанного числа невозможно");
        } else {
            System.out.println(sc);
        }


    }

    public static void quadraticEquation(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");


        }
        double numOne;
        double numTwo;
        double numThree;
        while (true) {


            double d = b * b - 4 * a * c;
            if (d > 0) {
                numOne = (-b - Math.sqrt(d)) / (2 * a);
                numTwo = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println(numOne + " " + numTwo);
                break;

            } else if (d == 0) {
                numThree = -b / (2 * a);
                System.out.println(numThree);
                break;

            } else {
                System.out.println("Нет действительных решений уравнения");
                break;
            }


        }
    }
}
