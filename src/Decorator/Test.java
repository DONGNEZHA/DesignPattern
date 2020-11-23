package Decorator;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Drink myDrink = new Coffee();
        CondimentDecorator myDecorator = new Sugar(myDrink);
        CondimentDecorator myDecorator2 = new Milk(myDrink);
        System.out.println(myDrink.getDescription());
        Drink myDrink2 = new Cola();
        System.out.println(myDrink2.getDescription());
        CondimentDecorator myDrinkD=new Lemon(myDrink2);
        System.out.println(myDrink2.getDescription());
        myDrink=myDrinkD;
        System.out.println(myDrink.getDescription());

        Command_Memento.Test.main();
    }
}
