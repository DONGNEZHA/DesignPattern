package Decorator;

import Command_Memento.Memento;

public class Milk extends CondimentDecorator {
    private Drink myDrink;

    public Milk(Drink drink) {
        myDrink = drink;
        myDrink.condiment = myDrink.condiment + "+Milk";
    }

    @Override
    public String getDescription() {

        return "Milk";
    }

}
