package Command_Memento;

import Adapter.AliAdapter;
import Adapter.WechatPay;
import Decorator.Drink;
import Interpreter.ExchangePrice;
import Interpreter.OriginalPrice;
import Interpreter.Price;

import java.util.Scanner;

public class CCommandFn {
    //单例模式
    //执行饮品台控制台交互的类
    private static CCommandFn instance = new CCommandFn();

    private CCommandFn() {
    }

    public static CCommandFn getInstance() {
        return instance;
    }

    public boolean CommandFn() throws InterruptedException {

        System.out.println("\nPlease choose your drink:");
        System.out.println("[0]Exit [1]Coffee [2]Cola [3]MineralWater:");
        int i;
        Scanner scan_input = new Scanner(System.in);
        i = scan_input.nextInt();
        boolean isOrder = false;  //判断是否点单成功
        while (true) {
            if (i == 0) break;
            switch (i) {
                case 1: {
                    //点咖啡
                    CareTaker orderList = new CareTaker();
                    Command orderCoffee = new OrderCoffeeCommand();
                    orderCoffee.execute();
                    Drink myCoffee = orderCoffee.getMyDrink();
                    orderList.append(orderCoffee, myCoffee.createMemento());
                    OrderCondiment coffeeCondiment = new OrderCondiment(orderList, myCoffee);
                    coffeeCondiment.start();
                    isOrder = coffeeCondiment.start();
                    break;
                }
                case 2: {
                    //点可乐
                    CareTaker orderList = new CareTaker();
                    Command orderCola = new OrderColaCommand();
                    orderCola.execute();
                    Drink myCola = orderCola.getMyDrink();
                    orderList.append(orderCola, myCola.createMemento());
                    OrderCondiment colaCondiment = new OrderCondiment(orderList, myCola);
                    colaCondiment.start();
                    isOrder = colaCondiment.start();
                    break;
                }
                case 3: {
                    //点矿泉水
                    CareTaker orderList = new CareTaker();
                    Command orderMineralWater = new OrderMineralWaterCommand();
                    orderMineralWater.execute();
                    Drink myMineralWater = orderMineralWater.getMyDrink();
                    orderList.append(orderMineralWater, myMineralWater.createMemento());
                    OrderCondiment mineralWaterCondiment = new OrderCondiment(orderList, myMineralWater);
                    mineralWaterCondiment.start();
                    isOrder = mineralWaterCondiment.start();
                    break;
                }
                default:
                    break;
            }
            i = 0;
            if (!isOrder) {
                System.out.println("\nPlease choose your drink:");
                System.out.println("[0]Exit [1]Coffee [2]Cola [3]MineralWater:");
                i = scan_input.nextInt();
            }
        }
        //如果点单成功，则进行支付
        if (isOrder) {
            Price price = new Price();
            price.SetOriPrice(10f);
            System.out.println("您的点单原价为10");
            price.SetExchange(10f);
            System.out.println("目前汇率 —— 1:10");
            OriginalPrice oriPriceInterpreter = new OriginalPrice();
            oriPriceInterpreter.Method(price);
            float result;
            ExchangePrice discountPriceInterpreter = new ExchangePrice();
            result = discountPriceInterpreter.Method(price);
            System.out.println("现价为：" + result);
            Scanner scan = new Scanner(System.in);
            int type;
            System.out.println("请选择你要使用的支付方式：\n1、Ali支付  2、WeChat支付");
            type = scan.nextInt();
            switch (type) {
                case 1: {
                    //使用支付宝
                    new AliAdapter().pay();
                    break;
                }
                case 2: {
                    //使用微信
                    new WechatPay().pay();
                    break;
                }
            }
            return true;
        }
        return false;
    }
}

