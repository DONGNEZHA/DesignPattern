package Bridge;
import abstractFactory.Animal;
import factoryMethod.Equipment;

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
