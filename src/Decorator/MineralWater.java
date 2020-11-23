package Decorator;

import Decorator.Drink;

public class MineralWater extends Drink {
    @Override
    public String getDescription() {
        return "MineralWater" + condiment;
    }
}
