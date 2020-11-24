package Bridge.EquipmentValue;

import AbstractFactory_Animal.Animal;
import Bridge.AbstractAnimalEquip;
import Bridge.Interface.EquipmentImplementor;
import FactoryMethod_Equipment.Equipment;

public class ordinaryEquipment extends AbstractAnimalEquip {
    public ordinaryEquipment(EquipmentImplementor animalEquip) {
        super(animalEquip);
    }

    @Override
    public void EquipEquipment(Animal animal, Equipment equipment) {
            super.EquipEquipment(animal, equipment);
    }

    @Override
    public int getEquipmentValue() {
        return 1;
        //1代表装备品质为普通
    }
}
