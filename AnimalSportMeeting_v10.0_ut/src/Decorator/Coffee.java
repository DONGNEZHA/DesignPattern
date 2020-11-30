package Decorator;

import Command_Memento.Memento;

public class Coffee extends Drink {
    //咖啡类（被装饰者）

    @Override
    public String getDescription() {
        return "Coffee" + condiment;
    }

    public Memento createMemento() {
        return new Memento(this.condiment);
    }

}
