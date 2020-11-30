package Decorator;

public class Milk extends CondimentDecorator {
    //牛奶类（装饰者）
    public Milk(Drink drink) {
        super(drink);
        getMyDrink().condiment = getMyDrink().condiment + "+Milk";
    }

    @Override
    public String getDescription() {
        return "Milk";
    }

}
