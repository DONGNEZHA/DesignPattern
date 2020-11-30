package Decorator;

public class Sugar extends CondimentDecorator {
    //白砂糖类（装饰者）
    public Sugar(Drink drink) {
        super(drink);
        getMyDrink().condiment = getMyDrink().condiment + "+Sugar";
    }

    @Override
    public String getDescription() {
        return "Sugar";
    }

}
