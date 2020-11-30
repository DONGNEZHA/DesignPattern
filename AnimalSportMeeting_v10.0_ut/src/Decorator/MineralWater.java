package Decorator;

public class MineralWater extends Drink {
    //矿泉水类（被装饰者）
    @Override
    public String getDescription() {
        return "MineralWater" + condiment;
    }
}
