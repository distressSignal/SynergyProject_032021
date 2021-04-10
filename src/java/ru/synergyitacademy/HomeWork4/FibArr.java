package ru.synergyitacademy.HomeWork4;
import java.util.Scanner;

public class FibArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[46];// Todo 47 выходит за рамки Int
        String q = "quit";

        while (true) {
            int a = scanner.nextInt();
            if (arr[a - 1] >= 1) {
                System.out.println(arr[a - 1]);
            } else {
                for (int i = 0; i < a; i++) {
                    if (arr[i] < 1) {
                        for (int k = i; k < a; k++) {
                            arr[k] = fib(k + 1);
                            break;
                        }
                    }
                }
                System.out.println(arr[a - 1]);
            }
            if (scanner.nextLine().equals(q)) {
                break;
            }
        }


    }

    public static int fib(int n) {
        return n == 1 || n == 2 ? 1 : fib(n - 1) + fib(n - 2);
    }
}
