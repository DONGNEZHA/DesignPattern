package Command_Memento;

import Decorator.CondimentDecorator;
import Decorator.Drink;
import Decorator.Sugar;

public class AddSugarCommand implements Command {
    //添加配料白砂糖
    private Drink myDrink;
    private CondimentDecorator addSugar;

    public AddSugarCommand(Drink myDrink) {
        this.myDrink = myDrink;
    }

    public void execute() {
        addSugar = new Sugar(myDrink);
        System.out.println("Order:" + addSugar.getDescription());
    }

    public Drink getMyDrink() {
        return myDrink;
    }
}
