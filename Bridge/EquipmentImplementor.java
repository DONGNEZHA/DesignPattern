package Bridge;
import abstractFactory.Animal;
import factoryMethod.Equipment;

public interface EquipmentImplementor {
    public void equip(Animal animal,Equipment equipment);
}
