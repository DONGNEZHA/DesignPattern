package Bridge;

import FactoryMethod.Equipment;
import SimpleFactory.Athlete;

public class BadEquip implements EquipmentImplementor {
    //桥接
    @Override
    public void equip(Athlete animal, Equipment equipment) {
        System.out.println("装备：" + equipment.getEquipmentName() + "被糟糕的的安装在了" + animal.getAnimalName()
                + "身上！！");
    }
}
