package Bridge;
import abstractFactory.Animal;
import abstractFactory.AnimalStore;
import factoryMethod.Equipment;
import factoryMethod.IFactory;
import factoryMethod.SubmersibleFactory;

public class Main {
    public static void main(String[] args) {
        //装备准备阶段
        EquipmentImplementor ei1=new PerfectEquip();
        //创建普通品质装备
        AbstractAnimalEquip equipment=new ordinaryEquipment(ei1);

        //初始化Animal对象
        AnimalStore animalStore=new AnimalStore();
        Animal animal=null;
        animal=animalStore.orderAnimal("GreenDog");
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
