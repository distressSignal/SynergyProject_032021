package ru.synergyitacademy.HomeWork3;


import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        quadraticEquation(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        primeNumber();
        sqrt(49);
        System.out.println(" Введите число последовательности Фибоначчи ");
        System.out.println(fib(scanner.nextInt()));
    }

    public static int fib(int n) {
        return n == 1 || n == 2 ? 1 : fib(n - 1) + fib(n - 2);
    }

    public static void primeNumber() {
        int i = 2;
        while (i <= 1000) {
            boolean isprime = false;
            for (int l = 2; l <= i / l; l++)
                if (i % l == 0)
                    isprime = true;
            if (!isprime)
                System.out.println(i);
            i++;
        }
    }

    public static void sqrt(int num) {
        if (sqrtTwo(num) * sqrtTwo(num) == num) {
            System.out.println(sqrtTwo(num));
        } else {
            System.out.println("Вычислить корень указанного числа невозможно");
        }
    }

    static int sqrtTwo(int number) {
        int sc = 0;
        for (int k = 1; k <= number; k += 2) {
            sc++;
            number += -k;
        }
        return sc;
    }

    public static void quadraticEquation(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        }
        double numOne;
        double numTwo;
        double numThree;
        double d = b * b - 4 * a * c;
        if (d > 0) {
            numOne = (-b - Math.sqrt(d)) / (2 * a);
            numTwo = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println(numOne + " " + numTwo);
        } else if (d == 0) {
            numThree = -b / (2 * a);
            System.out.println(numThree);
        } else {
            System.out.println("Нет действительных решений уравнения");
        }
    }
}
