package FactoryMethod;

import SimpleFactory.Athlete;

public class SportShoesFactory implements IFactory {
    @Override
    public Equipment createEquipment(Athlete owner) {
        return new SportShoes(owner);
    }
}
