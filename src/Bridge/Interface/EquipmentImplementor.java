package Bridge.Interface;
import AbstractFactory_Animal.Animal;
import FactoryMethod_Equipment.Equipment;

public interface EquipmentImplementor {
    public void equip(Animal animal,Equipment equipment);
}
