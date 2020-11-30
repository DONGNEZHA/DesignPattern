package Bridge;

import FactoryMethod.Equipment;
import SimpleFactory.Athlete;

public class BracerEquipment extends AbstractAnimalEquip {
    public BracerEquipment(EquipmentImplementor animalEquip) {
        super(animalEquip);
    }

    //桥接后增加新的功能
    @Override
    public void EquipEquipment(Athlete animal, Equipment equipment) {
        super.EquipEquipment(animal, equipment);
        animal.setStrength(animal.getStrength() + 3);
        animal.setSkill(animal.getSkill() + 2);
    }

}
