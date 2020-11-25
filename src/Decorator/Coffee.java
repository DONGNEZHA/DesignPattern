package Decorator;

import Command_Memento.Memento;

public class Coffee extends Drink {
    @Override
    public String getDescription() {
        return "Coffee" + condiment;
    }

    public Memento createMemento() {
        return new Memento(this.condiment);
    }

}
