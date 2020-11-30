package FactoryMethod;

import SimpleFactory.Athlete;

public class SportShoesFactory implements IFactory {
    //创建运动鞋
    @Override
    public Equipment createEquipment(Athlete owner) {
        return new SportShoes(owner);
    }
}
