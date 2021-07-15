package ru.synergyitacademy.Less12;

import java.io.IOException;

public class ReaderLauncher {

    public static void main(String[] args)  {
        try {
            String content = FileReader.getContent("test4.txt");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(" file isn't available");
        }
    }
}
