package Bridge;

import FactoryMethod.Equipment;
import SimpleFactory.Athlete;

public abstract class AbstractAnimalEquip {
    private EquipmentImplementor animalEquip;

    public AbstractAnimalEquip(EquipmentImplementor animalEquip) {
        this.animalEquip = animalEquip;
    }

    public void EquipEquipment(Athlete animal, Equipment equipment) {
        this.animalEquip.equip(animal, equipment);
    }
}
