package Bridge;

import FactoryMethod.Equipment;
import SimpleFactory.Athlete;

public class SportShoesEquipment extends AbstractAnimalEquip {
    public SportShoesEquipment(EquipmentImplementor animalEquip) {
        super(animalEquip);
    }

    @Override
    public void EquipEquipment(Athlete animal, Equipment equipment) {
        super.EquipEquipment(animal, equipment);
        animal.setSpeed(animal.getSpeed() + 3);
        animal.setPhysical(animal.getPhysical() + 2);
    }

    @Override
    public int getEquipmentValue() {
        return 1;
        //1代表装备品质为普通
    }
}
