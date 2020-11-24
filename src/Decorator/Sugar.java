package Decorator;

public class Sugar extends CondimentDecorator {
    private Drink myDrink;

    public Sugar(Drink drink) {
        myDrink = drink;
        myDrink.condiment = myDrink.condiment + "+Sugar";
    }

    @Override
    public String getDescription() {
        return "Sugar";
    }

}
