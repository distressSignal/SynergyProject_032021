package ru.synergyitacademy.les8;

public class UsdToRubConverter implements Convertable {
    @Override
    public long convert(long summa) {
        return summa * USD_RUB;
    }
}
