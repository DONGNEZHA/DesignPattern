package Command_Memento;

import Decorator.Drink;
import Decorator.MineralWater;

public class OrderMineralWaterCommand implements Command{
    private MineralWater myMineralWater=new MineralWater();

    public void execute() {
        System.out.println("Order:"+myMineralWater.getDescription());
    }

    public Drink getMyDrink() {
        return myMineralWater;
    }

}
