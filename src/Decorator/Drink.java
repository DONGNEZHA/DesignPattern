package Decorator;

import Command_Memento.Memento;

public class Drink {
    public String condiment = "";

    public String getDescription() {
        return "null";
    }

    public Memento createMemento() {
        return new Memento(condiment);
    }

    public String getFromMemento(Memento memento) {
        return memento.getCondiment();
    }
}
