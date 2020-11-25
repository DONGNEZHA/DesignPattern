package Decorator;

public class MineralWater extends Drink {
    @Override
    public String getDescription() {
        return "MineralWater" + condiment;
    }
}
