package Decorator;

public class Lemon extends CondimentDecorator {

    public Lemon(Drink drink) {
        super(drink);
        getMyDrink().condiment = getMyDrink().condiment + "+Lemon";
    }

    @Override
    public String getDescription() {
        return "Lemon";
    }
}
