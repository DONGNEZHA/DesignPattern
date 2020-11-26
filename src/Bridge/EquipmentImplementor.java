package Bridge;

import FactoryMethod.Equipment;
import SimpleFactory.Athlete;

public interface EquipmentImplementor {
    public void equip(Athlete animal, Equipment equipment);
}
