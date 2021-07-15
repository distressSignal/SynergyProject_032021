package ru.synergyitacademy.les8;

public enum Valutes {
    EUR_RUB(new EurToRubConverter()),
    RUB_EUR(new RubToEURConverter()),
    USD_RUB(new UsdToRubConverter()),
    RUB_USD(new RubToEURConverter());

    private Convertable convertable;

    Valutes(Convertable convertable) {
        this.convertable = convertable;
    }

    public Convertable getConvertable() {
        return this.convertable;
    }
}
