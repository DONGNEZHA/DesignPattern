package FactoryMethod_Equipment.Factory;

import FactoryMethod_Equipment.AnimalEquipment.Submersible;
import FactoryMethod_Equipment.Equipment;
import FactoryMethod_Equipment.Interface.IFactory;

public class SubmersibleFactory implements IFactory {
    @Override
    public Equipment createEquipment() {
        return new Submersible();
    }
}
