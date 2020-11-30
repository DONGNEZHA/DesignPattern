package Command_Memento;

import Decorator.Drink;

public interface Command {
    //命令模式接口
    public abstract void execute() throws InterruptedException;

    public abstract Drink getMyDrink();
}

