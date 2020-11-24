package Bridge;
import AbstractFactory_Animal.Animal;
import Bridge.Interface.EquipmentImplementor;
import FactoryMethod_Equipment.Equipment;

public abstract class AbstractAnimalEquip {
    private EquipmentImplementor animalEquip;
    public AbstractAnimalEquip(EquipmentImplementor animalEquip){
        this.animalEquip=animalEquip;
    }
    public void EquipEquipment(Animal animal,Equipment equipment){
        this.animalEquip.equip(animal,equipment);

    }
    public abstract int getEquipmentValue();
}
