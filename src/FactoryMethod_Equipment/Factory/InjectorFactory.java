package FactoryMethod_Equipment.Factory;

import FactoryMethod_Equipment.AnimalEquipment.Injector;
import FactoryMethod_Equipment.Equipment;
import FactoryMethod_Equipment.Interface.IFactory;

public class InjectorFactory implements IFactory {
    @Override
    public Equipment createEquipment() {
        return new Injector();
    }
}
