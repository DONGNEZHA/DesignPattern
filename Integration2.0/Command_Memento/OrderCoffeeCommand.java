package Command_Memento;

import Decorator.Coffee;
import Decorator.Drink;

public class OrderCoffeeCommand implements Command {
    private Coffee myCoffee = new Coffee();

    public void execute() {
        System.out.println("Order:" + myCoffee.getDescription());
    }

    public Drink getMyDrink() {
        return myCoffee;
    }
}
