package Decorator;

public class Lemon extends CondimentDecorator {
    private Drink myDrink;

    public Lemon(Drink drink) {
        myDrink = drink;
        myDrink.condiment = myDrink.condiment + "+Lemon";
    }

    @Override
    public String getDescription() {
        return myDrink.getDescription();
    }
}
