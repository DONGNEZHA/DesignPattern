package Bridge.EquipDegree;

import AbstractFactory_Animal.Animal;
import Bridge.Interface.EquipmentImplementor;
import FactoryMethod_Equipment.Equipment;

public class PerfectEquip implements EquipmentImplementor {
    @Override
    public void equip(Animal animal, Equipment equipment) {
        System.out.println("装备："+equipment.getEquipmentName()+"被完美的安装在了"+animal.getAnimalName()
        +"身上！！");
    }
}
