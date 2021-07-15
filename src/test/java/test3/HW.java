package test3;

import java.util.ArrayList;
import java.util.Arrays;

public class HW {

    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String pr = "a,b,c,d";
        String[] prString = pr.split(",");
        String[] arrText = text.split(",?\\s+");


        int b = arrText.length - 1;
        String a = "";
        for (int i = 0; i < arrText.length / 2; i++) {
            a = arrText[i];
            arrText[i] = arrText[arrText.length - 1 - i];
            arrText[arrText.length - 1 - i] = a;
        }

        float[] temperature = {36.7f, 38.9f, 34.7f};

        float sr = 0;
        float tempZdP = 0;
        String temp = "Температуры пациентов: ";
        String srS = "Средняя температура:  ";
        String stemp = "Количество здоровых:  ";

        for (int i = 0; i < temperature.length; i++) {
            sr += temperature[i];
            if (i == temperature.length - 1) {
                sr /= temperature.length;
                srS += sr;
                stemp += tempZdP;


            }
            if (temperature[i] >= 36.2f && temperature[i] <= 36.9f) {
                tempZdP++;
            }
            temp += temperature[i] + " ";


        }

//        System.out.println(temp);
//        System.out.println(srS);
//        System.out.println(stemp);

        for (int i = 0; i < 7; i++) {

        }
        ArrayList<String> todoList = new ArrayList<>(){{
            add("one");
            add("two");
        }};

        todoList.add("Первое наше дело");
        todoList.add(1, "второе дело");

        todoList.remove(0);
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(todoList.get(i));
        }
//        String arr[][] = new String[17][17];
//        System.out.println(arr.length);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println();
//            for (int j = 0; j < arr.length; j++) {
//               if (i==j || j== arr.length-1-i){
//                   arr[i][j]="X";
//               }else
//                   arr[i][j]=" ";
//                System.out.print(arr[i][j]);
//            }
//
//        }


    }


}
