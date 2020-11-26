package Bridge;

import FactoryMethod.Equipment;
import SimpleFactory.Athlete;

public class BracerEquipment extends AbstractAnimalEquip {
    public BracerEquipment(EquipmentImplementor animalEquip) {
        super(animalEquip);
    }

    @Override
    public void EquipEquipment(Athlete animal, Equipment equipment) {
        super.EquipEquipment(animal, equipment);
        animal.setStrength(animal.getStrength() + 3);
        animal.setSkill(animal.getSkill() + 2);
    }

    @Override
    public int getEquipmentValue() {
        Congratulation();
        return 5;
        //代表装备稀有


    }

    public void Congratulation() {
        System.out.println("哇！金色传说！");
    }
}
