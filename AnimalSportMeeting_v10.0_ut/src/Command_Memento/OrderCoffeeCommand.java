package Command_Memento;

import Decorator.Coffee;
import Decorator.Drink;

public class OrderCoffeeCommand implements Command {
    //点单咖啡的命令
    private Coffee myCoffee = new Coffee();

    @Override
    public void execute() {
        System.out.println("Order:" + myCoffee.getDescription());
    }

    @Override
    public Drink getMyDrink() {
        return myCoffee;
    }
}
