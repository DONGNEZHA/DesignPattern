package Bridge;

import FactoryMethod.Equipment;
import SimpleFactory.Athlete;

public class SportShoesEquipment extends AbstractAnimalEquip {
    public SportShoesEquipment(EquipmentImplementor animalEquip) {
        super(animalEquip);
    }

    //桥接后增加新的功能
    @Override
    public void EquipEquipment(Athlete animal, Equipment equipment) {
        super.EquipEquipment(animal, equipment);
        animal.setSpeed(animal.getSpeed() + 3);
        animal.setPhysical(animal.getPhysical() + 2);
    }
}
