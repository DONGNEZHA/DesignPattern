package FactoryMethod;

import SimpleFactory.Athlete;

public class BracerFactory implements IFactory {
    //创建护腕
    @Override
    public Equipment createEquipment(Athlete owner) {
        return new Bracer(owner);
    }
}
