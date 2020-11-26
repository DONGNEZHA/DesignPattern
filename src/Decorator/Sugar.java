package Decorator;

public class Sugar extends CondimentDecorator {

    public Sugar(Drink drink) {
        super(drink);
        getMyDrink().condiment = getMyDrink().condiment + "+Sugar";
    }

    @Override
    public String getDescription() {
        return "Sugar";
    }

}
