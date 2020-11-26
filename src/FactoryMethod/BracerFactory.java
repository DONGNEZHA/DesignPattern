package FactoryMethod;

import SimpleFactory.Athlete;

public class BracerFactory implements IFactory {
    @Override
    public Equipment createEquipment(Athlete owner) {
        return new Bracer(owner);
    }
}
