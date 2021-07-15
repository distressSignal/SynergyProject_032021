package ru.synergyitacademy.HomeWork1;

import java.io.*;
import java.util.Scanner;

public class Launcher {

    /**
     * Основная точка входа в приложение
     *
     * @param args список аргументов, которые можно кастомизировать
     * @throws Exception список исключений, которые генерируются во время выполнения программы
     */
    public static void main(String[] args) throws Exception {
        //TODO: переписать данный код
        // Выведется в консоль фраза Привет, мир!


        double rast =105;
        double rMetr= rast*1000;
        double scor =40;
        double mScor= scor*60;
        double vr=0;

        for (int i = 0; scor < 350*5; i++) {

                scor*=1.05;

         vr=   (rMetr/mScor);

            System.out.println(vr+" при скорости "+scor);


        }



    }
}