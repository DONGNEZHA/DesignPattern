package Command_Memento;

import Decorator.Cola;
import Decorator.Drink;

public class OrderColaCommand implements Command{
    private Cola myCola=new Cola();

    public void execute() {
        System.out.println("Order:"+myCola.getDescription());
    }

    public Drink getMyDrink() {
        return myCola;
    }
}
