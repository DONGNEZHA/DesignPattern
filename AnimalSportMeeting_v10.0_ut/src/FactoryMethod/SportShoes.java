package FactoryMethod;

import SimpleFactory.Athlete;

public class SportShoes extends Equipment {
    //运动鞋
    @Override
    public void function() {
        System.out.println("get a submersible");
        System.out.println("now you can join swim game");
    }

    public SportShoes(Athlete owner) {
        super(owner);
    }

    @Override
    public String getEquipmentName() {
        return "SportShoes";
    }
}
