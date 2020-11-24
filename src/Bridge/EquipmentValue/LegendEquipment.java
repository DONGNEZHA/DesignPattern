package Bridge.EquipmentValue;

import AbstractFactory_Animal.Animal;
import Bridge.AbstractAnimalEquip;
import Bridge.Interface.EquipmentImplementor;
import FactoryMethod_Equipment.Equipment;

public class LegendEquipment extends AbstractAnimalEquip {
    public LegendEquipment(EquipmentImplementor animalEquip) {
        super(animalEquip);
    }

    @Override
    public void EquipEquipment(Animal animal, Equipment equipment) {
        super.EquipEquipment(animal, equipment);
    }

    @Override
    public int getEquipmentValue() {
        Congratulation();
        return 5;
        //代表装备稀有


    }
    public void Congratulation(){
        System.out.println("哇！金色传说！");
    }
}
