package Command_Memento;

import Decorator.Drink;

import java.util.Scanner;

public class Test {
    public static void main() throws InterruptedException {

        System.out.println("\nPlease choose your drink:");
        System.out.println("[0]Exit [1]Coffee [2]Cola [3]MineralWater:");
        int i;
        Scanner scan_input = new Scanner(System.in);
        i = scan_input.nextInt();
        while (i != 0) {
            if (i == 1) {
                CareTaker orderList = new CareTaker();
                Command orderCoffee = new OrderCoffeeCommand();
                orderCoffee.execute();
                Drink myCoffee = orderCoffee.getMyDrink();
                orderList.append(orderCoffee, myCoffee.createMemento());
                OrderCondiment coffeeCondiment = new OrderCondiment(orderList, myCoffee);
                coffeeCondiment.start();
            } else if (i == 2) {
                CareTaker orderList = new CareTaker();
                Command orderCola = new OrderColaCommand();
                orderCola.execute();
                Drink myCola = orderCola.getMyDrink();
                orderList.append(orderCola, myCola.createMemento());
                OrderCondiment colaCondiment = new OrderCondiment(orderList, myCola);
                colaCondiment.start();
            } else if (i == 3) {
                CareTaker orderList = new CareTaker();
                Command orderMineralWater = new OrderMineralWaterCommand();
                orderMineralWater.execute();
                Drink myMineralWater = orderMineralWater.getMyDrink();
                orderList.append(orderMineralWater, myMineralWater.createMemento());
                OrderCondiment mineralWaterCondiment = new OrderCondiment(orderList, myMineralWater);
                mineralWaterCondiment.start();
            } else break;
            System.out.println("\nPlease choose your drink:");
            System.out.println("[0]Exit [1]Coffee [2]Cola [3]MineralWater:");
            i = scan_input.nextInt();
        }
    }
}

