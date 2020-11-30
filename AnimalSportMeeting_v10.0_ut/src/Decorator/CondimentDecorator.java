package Decorator;

public class CondimentDecorator extends Drink {
    //装饰者类

    private Drink myDrink;

    public CondimentDecorator(Drink myDrink) {
        this.myDrink = myDrink;
    }

    public Drink getMyDrink() {
        return myDrink;
    }

    public String getDescription() {
        return "null";
    }

}
