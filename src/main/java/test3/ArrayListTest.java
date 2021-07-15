package test3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> todos = new ArrayList<>();
        todos.add("Проверка");

        Scanner scanner = new Scanner(System.in);
        String scReader = scanner.nextLine();

        String[] scReaderA = scReader.split(" ");
        for (String s : scReaderA) {
            System.out.println(s);
        }

        if (scReaderA[0].equalsIgnoreCase("LIST")) {
            for (int i = 0; i < todos.size(); i++) {
                System.out.println(todos.get(i));
            }


        }
        if (scReaderA[0].equalsIgnoreCase("ADD")) {
            System.out.println("Add2");

            System.out.println("test2");
            int num = -1;
            String text = "";
            for (int i = 1; i < scReaderA.length; i++)
                try {
                    if (i == Integer.parseInt(scReaderA[1])) {
                        System.out.println("Nashel");
                        num = i;
                        i++;
                        break;
                    }


                } finally {

                }
            if (num < 1) {
                for (int i = 1; i < scReaderA.length; i++) {
                    text += scReaderA[i];
                }
                todos.add(text);
            } else {
                for (int i = 2; i < scReaderA.length; i++) {
                    text += scReaderA[i];
                }
                todos.add(num - 1, text);
            }


        }

        for (String todo : todos) {
            System.out.println(todo);
        }


    }
}
