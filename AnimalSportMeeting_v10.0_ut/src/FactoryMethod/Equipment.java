package FactoryMethod;

import SimpleFactory.Athlete;

public abstract class Equipment {
    Athlete Owner;

    public Equipment(Athlete owner) {
        Owner = owner;
    }

    public abstract void function();
    //Equipment abstract class as super class

    public abstract String getEquipmentName();
}
