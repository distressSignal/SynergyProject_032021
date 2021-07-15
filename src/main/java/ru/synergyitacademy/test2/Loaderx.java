package ru.synergyitacademy.test2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Loaderx {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String number = "Привет как дела? Жду тебя";
        String textBbc = "Buckingham Palace said the funeral plans had been modified to take into account public health" +
                " guidelines.\n" +
                "\n" +
                "The funeral will take place entirely within the grounds of the castle and the public have been asked " +
                "not to gather there or at other royal residences.\n";

//        String safe = searchAndReplaceDiamonds("«Номер кредитной карты <4008 1234 5678> 8912»", "«***»)");
//        String safe2 = RegularSearchAndReplaceDiamonds("«Номер кредитной карты <4008 1234 5678> 8912»", "«***»");
//        System.out.println(safe);
//        System.out.println(safe2);


        String textsBBc2 = textBbc;
        String textsBB = textsBBc2.replaceAll("[^A-z]", " ");
        String[] textsArr = textsBB.split("\\s+");
        for (int i = 0, b = 0; i < textsArr.length; i++, b++) {
//            System.out.print(textsArr[i] + " ");
            if (b == 10) {
                System.out.println();
                b = 0;
            }

        }
//        System.out.println(textsArr.length);

        String[] sNum = number.split("\\?\\s+");

        int sum = 0;
        String sum2 = text.replaceAll("[^0-9]", " ").trim();
        String[] sSum = sum2.split("\\s+");
        for (int i = 0; i < sSum.length; i++) {
//            System.out.println(sSum[i]);
            sum += Integer.parseInt(sSum[i]);


        }


//        System.out.println(sum);

        String text2 = "Ivanov Vasi Petovich gh";

        String[] texting = text2.split("\\s+");
        String famaly = "Фамилия: " + texting[0];
        String name = "Имя: " + texting[1];
        String otch = "Отчество " + texting[2];
//
//        System.out.println(famaly);
//        System.out.println(name);
//        System.out.println(otch);
        int day = 15;
        int month = 11;
        int year = 1991;

        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        Calendar c = new GregorianCalendar();
//        System.out.println(c.getTime());
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.DATE, day);
//        System.out.println(c.getTime());
        SimpleDateFormat format;
        format = new SimpleDateFormat("dd.MM.yyyy EEEE");

        for (int i = 1; i <= 30; i++) {
            c.add(Calendar.YEAR, +1);
            System.out.println(i+" - "+format.format(c.getTime()));
        }


        ;


        boolean bb = false;
        while (bb) {
            String numer = scanner.nextLine();
            String prodNumer = numer.replaceAll("[^0-9]", "");
            if (prodNumer.length() < 10 || prodNumer.length() > 11) {

                System.out.println("Неверный формат номера");
            } else if (prodNumer.length() == 10) {
                String a = "7" + prodNumer;
                System.out.println(a);

            } else if (prodNumer.length() == 11) {
                String[] pr = prodNumer.split("");
                int prn = Integer.parseInt(pr[0]);
                if (prn == 7 || prn == 8) {
                    String seven = "7" + prodNumer.substring(1);

                    System.out.println(seven);

                } else {
                    System.out.println("Неверный формат номера");
                }

            }

        }


    }

    static String RegularSearchAndReplaceDiamonds(String text, String placeholder) {
        int one = text.indexOf(">");
        int two = text.indexOf("<");
        String t = placeholder.substring(1, placeholder.length() - 1).trim();

        StringBuilder strBuilder = new StringBuilder(text).replace(two, one + 1, t);


        return String.valueOf(strBuilder);


    }

    static String searchAndReplaceDiamonds(String text, String placeholder) {
        String result = "";
        String one;
        String placeholder2 = "";
        placeholder2.trim();
        int plhONE = placeholder.indexOf("«");
        int plhTwo = placeholder.lastIndexOf("»");
        placeholder2 += placeholder.substring(plhONE + 1, plhTwo);

        int oneIndex = text.lastIndexOf("<");
        result += text.substring(0, oneIndex).trim();
        result += placeholder2;
        int twoIndex = text.indexOf(">");
        one = text.substring(twoIndex + 1).trim();
        result += one;
        return result;

    }
}
