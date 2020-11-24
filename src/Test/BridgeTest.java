package Test;

import Bridge.*;
import AbstractFactory_Animal.Animal;
import AbstractFactory_Animal.AnimalStore;
import Bridge.EquipDegree.BadEquip;
import Bridge.EquipDegree.PerfectEquip;
import Bridge.EquipmentValue.LegendEquipment;
import Bridge.EquipmentValue.ordinaryEquipment;
import Bridge.Interface.EquipmentImplementor;
import FactoryMethod_Equipment.Equipment;
import FactoryMethod_Equipment.Interface.IFactory;
import FactoryMethod_Equipment.Factory.SubmersibleFactory;

public class BridgeTest {
    public static void main(String[] args) {

        System.out.println("Bridge Pattern");
        //装备准备阶段
        EquipmentImplementor ei1=new PerfectEquip();
        //创建普通品质装备
        AbstractAnimalEquip equipment=new ordinaryEquipment(ei1);

        //初始化Animal对象
        AnimalStore animalStore=new AnimalStore();
        Animal animal=null;
        animal=animalStore.orderAnimal();
        //初始化Equipment对象
        IFactory factory_1=new SubmersibleFactory();
        Equipment equipment_1=factory_1.createEquipment();
        equipment_1.function();
        //Bridge模式开始
        equipment.EquipEquipment(animal,equipment_1);
        //改变装备完成度
        ei1=new BadEquip();
        //创建传说装备
        equipment=new LegendEquipment(ei1);
        equipment.EquipEquipment(animal,equipment_1);
        //传说装备特性（装13）
        equipment.getEquipmentValue();


    }
}
