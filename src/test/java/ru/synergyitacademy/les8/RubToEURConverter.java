package ru.synergyitacademy.les8;

public class RubToEURConverter implements Convertable{
    @Override
    public long convert(long summa) {
        return summa / EUR_RUB;
    }
}
