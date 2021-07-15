package ru.synergyitacademy.Less11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExRun {

    public static void main(String[] args) {

        try {
          FileInputStream fileInputStream =  new FileInputStream("test.txt");

            int v = Calculator.divide(25,0);
            Integer max = null;
            int zero = max;
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Деление на ноль");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Деление на лллл");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Файл не найден");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        catch (Throwable th){
            th.printStackTrace();
        }
        System.out.println("Hello world");


    }
}
