package Decorator;

public class Cola extends Drink {
    @Override
    public String getDescription() {
        return "Cola" + condiment;
    }
}
