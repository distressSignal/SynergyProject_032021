package ru.synergyitacademy.les8;

public interface Convertable {

    int USD_RUB = 76;

    int EUR_RUB = 88;

    long convert(long summa);

    default void print(long summa){
        System.out.println(convert(summa));
    }



    static Convertable getConverter(Valutes valutes){
        return valutes.getConvertable();
    }


}
