package FactoryMethod;

import SimpleFactory.Athlete;

public class Bracer extends Equipment {
    //护腕
    @Override
    public void function() {
        System.out.println("get a injector");
        System.out.println("now you can join air game");
    }

    public Bracer(Athlete owner) {
        super(owner);
    }

    @Override
    public String getEquipmentName() {
        return "Bracer";
    }
}
