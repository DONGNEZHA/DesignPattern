package Command_Memento;

import Decorator.Cola;
import Decorator.Drink;

public class OrderColaCommand implements Command {
    private Cola myCola = new Cola();

    @Override
    public void execute() {
        System.out.println("Order:" + myCola.getDescription());
    }

    @Override
    public Drink getMyDrink() {
        return myCola;
    }
}
