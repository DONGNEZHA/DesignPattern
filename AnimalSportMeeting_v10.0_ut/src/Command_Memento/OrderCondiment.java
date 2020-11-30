package Command_Memento;

import Decorator.Drink;

import java.util.Scanner;

public class OrderCondiment {
    //执行添加配料的控制台交互类
    private CareTaker myCare;
    private Drink myDrink;

    public OrderCondiment(CareTaker myCare, Drink myDrink) {
        this.myCare = myCare;
        this.myDrink = myDrink;
    }

    public boolean start() throws InterruptedException {
        System.out.println("\nPlease choose your condiment:");
        System.out.println("[0]Exit [1]Sugar [2]Milk [3]Lemon [4]undo [5]redo [6]OK:");
        int j;
        Scanner scan_input1 = new Scanner(System.in);
        j = scan_input1.nextInt();
        while (j != 0) {
            if (j == 1) {
                //添加白砂糖
                myCare.clear();
                Command addSugar = new AddSugarCommand(myDrink);
                addSugar.execute();
                myCare.append(addSugar, myDrink.createMemento());
                System.out.println("Your current order:" + myDrink.getDescription());
            } else if (j == 2) {
                //添加牛奶
                myCare.clear();
                Command addMilk = new AddMilkCommand(myDrink);
                addMilk.execute();
                myCare.append(addMilk, myDrink.createMemento());
                System.out.println("Your current order: " + myDrink.getDescription());
            } else if (j == 3) {
                //添加柠檬
                myCare.clear();
                Command addLemon = new AddLemonCommand(myDrink);
                addLemon.execute();
                myCare.append(addLemon, myDrink.createMemento());
                System.out.println("Your current order: " + myDrink.getDescription());
            } else if (j == 4) {
                //undo
                myCare.undo();
                System.out.println("Your current order: " + myDrink.getDescription());
            } else if (j == 5) {
                //redo
                myCare.redo();
                System.out.println("Your current order: " + myDrink.getDescription());
            } else if (j == 6) {
                //确定下单
                System.out.println("Order SuccessFully!");
                System.out.println("Your final order: " + myDrink.getDescription());
                return true;
            }
            System.out.println("\nPlease choose your condiment:");
            System.out.println("[0]Exit [1]Sugar [2]Milk [3]Lemon [4]undo [5]redo [6]OK:");
            j = scan_input1.nextInt();
        }
        return false;
    }
}
