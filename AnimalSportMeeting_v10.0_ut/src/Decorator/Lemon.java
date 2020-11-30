package Decorator;

public class Lemon extends CondimentDecorator {
    //柠檬类（装饰者）
    public Lemon(Drink drink) {
        super(drink);
        getMyDrink().condiment = getMyDrink().condiment + "+Lemon";
    }

    @Override
    public String getDescription() {
        return "Lemon";
    }
}
