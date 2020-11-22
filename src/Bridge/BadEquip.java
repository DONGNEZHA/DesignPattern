package Bridge;
import abstractFactory.Animal;
import factoryMethod.Equipment;
public class BadEquip implements EquipmentImplementor{
    @Override
    public void equip(Animal animal, Equipment equipment) {
        System.out.println("装备："+equipment.getEquipmentName()+"被糟糕的的安装在了"+animal.getAnimalName()
                +"身上！！");
    }
}
