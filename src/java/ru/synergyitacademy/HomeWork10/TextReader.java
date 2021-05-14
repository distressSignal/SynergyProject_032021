package ru.synergyitacademy.HomeWork10;

import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] textsArr = scanner.nextLine().replaceAll("[^А-я]", " ").split("\\s+");
        // TODO: 14.05.2021   еще урок не прогрузился, поэтому не знаю, можно ли стрингбилдером пользоваться.
        //  Немного сократил код. условно убираем все кроме букв(?!. и т.д)
        //  и заменяем на пробел. и переводим в массив

        String min = textsArr[0];
        String max = textsArr[1];

        for (int i = 0; i < textsArr.length; i++) {
            if (textsArr[i].length() < min.length()) {
                min = textsArr[i];
            }
            if (textsArr[i].length() > max.length()) {
                max = textsArr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
