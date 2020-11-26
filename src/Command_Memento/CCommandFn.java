package Command_Memento;

import Decorator.Drink;

import java.util.Scanner;

public class CCommandFn {
    //单例模式
    private static CCommandFn instance = new CCommandFn();

    private CCommandFn() {
    }

    public static CCommandFn getInstance() {
        return instance;
    }

    public void CommandFn() throws InterruptedException {

        System.out.println("\nPlease choose your drink:");
        System.out.println("[0]Exit [1]Coffee [2]Cola [3]MineralWater:");
        int i;
        Scanner scan_input = new Scanner(System.in);
        i = scan_input.nextInt();
        while (true) {
            if (i == 0) break;
            switch (i) {
                case 1: {
                    CareTaker orderList = new CareTaker();
                    Command orderCoffee = new OrderCoffeeCommand();
                    orderCoffee.execute();
                    Drink myCoffee = orderCoffee.getMyDrink();
                    orderList.append(orderCoffee, myCoffee.createMemento());
                    OrderCondiment coffeeCondiment = new OrderCondiment(orderList, myCoffee);
                    coffeeCondiment.start();
                    break;
                }
                case 2: {
                    CareTaker orderList = new CareTaker();
                    Command orderCola = new OrderColaCommand();
                    orderCola.execute();
                    Drink myCola = orderCola.getMyDrink();
                    orderList.append(orderCola, myCola.createMemento());
                    OrderCondiment colaCondiment = new OrderCondiment(orderList, myCola);
                    colaCondiment.start();
                    break;
                }
                case 3: {
                    CareTaker orderList = new CareTaker();
                    Command orderMineralWater = new OrderMineralWaterCommand();
                    orderMineralWater.execute();
                    Drink myMineralWater = orderMineralWater.getMyDrink();
                    orderList.append(orderMineralWater, myMineralWater.createMemento());
                    OrderCondiment mineralWaterCondiment = new OrderCondiment(orderList, myMineralWater);
                    mineralWaterCondiment.start();
                    break;
                }
                default:
                    break;
            }
            System.out.println("\nPlease choose your drink:");
            System.out.println("[0]Exit [1]Coffee [2]Cola [3]MineralWater:");
            i = scan_input.nextInt();
        }
    }
}

