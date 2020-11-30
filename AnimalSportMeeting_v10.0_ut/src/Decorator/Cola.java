package Decorator;

public class Cola extends Drink {
    //可乐类（被装饰者）
    @Override
    public String getDescription() {
        return "Cola" + condiment;
    }
}
