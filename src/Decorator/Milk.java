package Decorator;

public class Milk extends CondimentDecorator {

    public Milk(Drink drink) {
        super(drink);
        getMyDrink().condiment = getMyDrink().condiment + "+Milk";
    }

    @Override
    public String getDescription() {
        return "Milk";
    }

}
