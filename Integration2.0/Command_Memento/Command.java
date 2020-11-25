package Command_Memento;

import Decorator.Drink;

public interface Command {
    public abstract void execute() throws InterruptedException;

    public abstract Drink getMyDrink();
}

