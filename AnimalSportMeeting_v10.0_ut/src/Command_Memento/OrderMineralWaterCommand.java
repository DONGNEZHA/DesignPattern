package Command_Memento;

import Decorator.Drink;
import Decorator.MineralWater;

public class OrderMineralWaterCommand implements Command {
    //点单矿泉水命令
    private MineralWater myMineralWater = new MineralWater();

    @Override
    public void execute() {
        System.out.println("Order:" + myMineralWater.getDescription());
    }

    @Override
    public Drink getMyDrink() {
        return myMineralWater;
    }

}
