package Command_Memento;

import Decorator.CondimentDecorator;
import Decorator.Drink;
import Decorator.Lemon;

public class AddLemonCommand implements Command {
    //添加配料柠檬
    private Drink myDrink;
    private CondimentDecorator addLemon;

    public AddLemonCommand(Drink myDrink) {
        this.myDrink = myDrink;
    }

    public void execute() {
        addLemon = new Lemon(myDrink);
        System.out.println("Order:" + addLemon.getDescription());
    }

    public Drink getMyDrink() {
        return myDrink;
    }
}
