package FactoryMethod;

import SimpleFactory.Athlete;

public interface IFactory {
    Equipment createEquipment(Athlete owner);
}
