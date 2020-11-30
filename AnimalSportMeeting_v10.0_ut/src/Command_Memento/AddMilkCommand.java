package Command_Memento;

import Decorator.CondimentDecorator;
import Decorator.Drink;
import Decorator.Milk;

public class AddMilkCommand implements Command {
    //添加配料牛奶
    private Drink myDrink;

    private CondimentDecorator addMilk;

    public AddMilkCommand(Drink myDrink) {
        this.myDrink = myDrink;
    }

    public void execute() {
        addMilk = new Milk(myDrink);
        System.out.println("Order:" + addMilk.getDescription());
    }

    public Drink getMyDrink() {
        return myDrink;
    }
}
