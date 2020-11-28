package Singleton_LazyInitialization;

import AbstractFactory.Judge;
import AbstractFactory.JudgeStore;
import Bridge.AbstractAnimalEquip;
import Bridge.EquipmentImplementor;
import Bridge.PerfectEquip;
import Bridge.SportShoesEquipment;
import Builder.Game;
import Builder.GamesBuilder;
import Command_Memento.*;
import Composite.Menu;
import Composite.MenuOption;
import Decorator.Drink;
import Facade.Facade;
import FactoryMethod.Equipment;
import FactoryMethod.SportShoesFactory;
import Iterator.AthleteContainer;
import Iterator.GameContainer;
import Mediator.ConcreteAthlete;
import Mediator.ConcreteMediator;
import Mediator.ConcreteOthers;
import Observer.ScoreSubject;
import Prototpye_Flyweight.AttributeFactory;
import Prototpye_Flyweight.DogAudience;
import Proxy.ProxyScoreSheet;
import Proxy.ScoreSheet;
import SimpleFactory.Athlete;
import SimpleFactory.AthleteFactory;
import Visitor.CVisitorFn;

import java.util.ArrayList;

import static Prototpye_Flyweight.FlyweightPattern.*;

public class MainTest {
    //单例模式
    private static MainTest instance = new MainTest();

    private MainTest() {
    }

    public static MainTest getInstance() {
        return instance;
    }

    public void TestController() throws InterruptedException {
        SingletonTest();
        SimpleFactoryTest();
        IteratorTest();
        AbstractFactoryTest();
        BuilderTest();
//        FacadeTest();
//        CompositeTest();
        TemplateTest();
        StrategyTest();
        StateTest();
//        ObserverTest();
//        CommandTest();
//        MementoTest();
//        FactoryMethodTest();
//        BridgeTest();
//        DecoratorTest();
//        MediatorTest();
//        ProxyTest();
//        FlyweightTest();
//        PrototypeTest();
        VisitorTest();
    }

    public void SingletonTest() {
        System.out.println("1 单例模式（Singleton Pattern）");
        System.out.println("包:Singleton_LazyInitialization");
        System.out.println("类：AnimalSportMeeting");
        System.out.println("实现接口：AnimalSportMeeting.getInstance().showMessage()");
        System.out.println("测试信息：");
        AnimalSportMeeting.getInstance().showMessage();
        System.out.println();
    }

    public void SimpleFactoryTest() {
        System.out.println("2 简单工厂模式（Simple Factory Pattern）");
        System.out.println("包:SimpleFactory");
        System.out.println("类：AthleteFactory");
        System.out.println("实现接口：AthleteFactory.createAthlete(String race, String color)");
        System.out.println("测试信息：");
        Athlete athlete = new AthleteFactory().createAthlete("Dog", "Green");
        if (athlete != null) {
            System.out.println("运动员创建成功！");
            athlete.showAnimalInfo();
        } else {
            System.out.println("运动员创建失败！");
        }
        AthleteContainer.getInstance().add(athlete);
        System.out.println();
    }

    public void IteratorTest() {
        System.out.println("3 迭代器模式（Iterator Pattern）");
        System.out.println("包:Iterator");
        System.out.println("类：AthleteContainer");
        System.out.println("实现接口：AthleteContainer.getInstance()");
        System.out.println("测试信息：");
        AthleteFactory athleteFactory = new AthleteFactory();
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Cat", "Red"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Cat", "Green"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Cat", "Yellow"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Dog", "Red"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Dog", "Yellow"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Bear", "Red"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Bear", "Yellow"));
        ArrayList<Athlete> athletes = AthleteContainer.getInstance().getAthletes();
        if (!athletes.isEmpty()) {
            System.out.println("运动员列表获取成功！");
            for (Athlete athlete : athletes) {
                athlete.showAnimalInfo();
            }
        } else {
            System.out.println("运动员列表获取失败！");
        }
        System.out.println();
    }

    public void AbstractFactoryTest() {
        System.out.println("4 抽象工厂模式（Abstract Factory Pattern）");
        System.out.println("包:AbstractFactory");
        System.out.println("类：JudgeStore");
        System.out.println("实现接口：judge = JudgeStore.getInstance().orderJudge(String JudgeName)");
        System.out.println("测试信息：");
        Judge judge = JudgeStore.getInstance().orderJudge("DR100");
        judge.setJudgeName("蜻蜓队长");
        System.out.println("裁判创建成功！");
        System.out.println("裁判姓名：" + judge.getJudgeName());
        System.out.println("比赛项目：" + judge.getGameType().toString());
        System.out.println();
    }

    public void BuilderTest() {
        System.out.println("5 建造者模式（Builder Pattern）");
        System.out.println("包:Builder");
        System.out.println("类：GamesBuilder");
        System.out.println("实现接口：GamesBuilder.getInstance().buildGames()");
        System.out.println("测试信息：");
        GamesBuilder.getInstance().buildGames();
        if (!GameContainer.getInstance().getGames().isEmpty()) {
            System.out.println("比赛创建成功！");
            for (Game game : GameContainer.getInstance().getGames()) {
                game.showGameInfo();
            }
        } else {
            System.out.println("比赛创建失败！");
        }
        System.out.println();
    }

    public void FacadeTest() {
        System.out.println("6 外观模式（Facade Pattern）");
        System.out.println("包:Facade");
        System.out.println("类：Facade");
        System.out.println("实现接口：facade.method()");
        System.out.println("测试信息：");
        Facade facade = new Facade();
        facade.method();
        System.out.println("运动员检录完成！");
        System.out.println();
    }

    public void CompositeTest() {
        System.out.println("7 组合模式（Composite Pattern）");
        System.out.println("包:Composite");
        System.out.println("类：MenuOption");
        System.out.println("实现接口：printMenu()");
        System.out.println("测试信息：");
        //设置测试用菜单
        Menu rootMenu = new Menu("大厅选择");
        //第一个比赛菜单
        Menu gameMenu = new Menu("比赛");
        //创建三个比赛实例
        int element = 0;
        MenuOption run_100 = new MenuOption("100米跑", GameContainer.getInstance().get(0));
        MenuOption run_1000 = new MenuOption("1000米跑", GameContainer.getInstance().get(1));
        MenuOption swim_400 = new MenuOption("400米游泳", GameContainer.getInstance().get(2));
        MenuOption boxing = new MenuOption("拳击", GameContainer.getInstance().get(3));
        // 向比赛菜单中添加三个选项
        // 可在此处创建三个比赛实例替换 Add 中参数 element  后续同理
        gameMenu.add(run_100);
        gameMenu.add(run_1000);
        gameMenu.add(swim_400);
        gameMenu.add(boxing);
        //饮品台
        MenuOption drinkTable = new MenuOption("饮品台", CCommandFn.getInstance());
        MenuOption queryRank = new MenuOption("询问成绩", element);
        MenuOption buyEquipment = new MenuOption("买装备", element);
        MenuOption printRank = new MenuOption("打印成绩单", element);
        MenuOption meetAudience = new MenuOption("粉丝见面会", element);
        rootMenu.add(gameMenu);
        rootMenu.add(drinkTable);
        rootMenu.add(queryRank);
        rootMenu.add(buyEquipment);
        rootMenu.add(printRank);
        rootMenu.add(meetAudience);
        // 菜单以及选择返回
        System.out.println("打印一级菜单：");
        rootMenu.printMenu();
        System.out.println("打印二级菜单：");
        gameMenu.printMenu();
        System.out.println();
    }

    public void TemplateTest() {
        System.out.println("8 模板模式（Template Pattern）");
        System.out.println("包:Template_Strategy");
        System.out.println("类：FourHundredMetersSwimming/OneHundredMetersRunning/OneThousandMetersRunning/Boxing");
        System.out.println("实现接口：game.showGameInfo()");
        System.out.println("测试信息：");
        for (Game game : GameContainer.getInstance().getGames()) {
            game.showGameInfo();
        }
        System.out.println();
    }

    public void StrategyTest() {
        System.out.println("9 策略模式（Strategy Pattern）");
        System.out.println("包:Template_Strategy");
        System.out.println("类：FourHundredMetersSwimming/OneHundredMetersRunning/OneThousandMetersRunning/Boxing");
        System.out.println("实现接口：game.gameStart()");
        System.out.println("测试信息：");
        for (int i = 0; i < 3; ++i) {
            GameContainer.getInstance().get(i).gameStart();
            GameContainer.getInstance().get(i).gameEnd();
        }
        System.out.println();
    }

    public void StateTest() {
        System.out.println("10 状态模式（State Pattern）");
        System.out.println("包:State");
        System.out.println("类：AnimalState");
        System.out.println("实现接口：athlete.getAnimalState()");
        System.out.println("测试信息：");
        System.out.println("当前状态：" + AthleteContainer.getInstance().get(0).getAnimalState().toString());
        System.out.println();
    }

    public void ObserverTest() {
        System.out.println("11 观察者模式（Observer Pattern）");
        System.out.println("包:Observer");
        System.out.println("类：AthleteObserver");
        System.out.println("实现接口：ScoreSubject.getInstance().notifyObserver(int game, int[] rank, double[] score)");
        System.out.println("测试信息：");
        Athlete athlete = AthleteContainer.getInstance().get(0);
        System.out.println("原始数据：");
        System.out.println(athlete.getAnimalName() + " 项目："
                + GameContainer.getInstance().get(0).getName() + " 成绩（秒）："
                + athlete.getScore()[0] + " 名次：" + athlete.getRank()[0]);
        ScoreSubject.getInstance().notifyObserver(0, new int[]{1}, new double[]{9.58});
        System.out.println("数据同步更新成功！");
        System.out.println(athlete.getAnimalName() + " 项目："
                + GameContainer.getInstance().get(0).getName() + " 成绩（秒）："
                + athlete.getScore()[0] + " 名次：" + athlete.getRank()[0]);
        System.out.println();
    }

    public void CommandTest() throws InterruptedException {
        System.out.println("12 命令模式（Command Pattern）");
        System.out.println("包:Command_Memento");
        System.out.println("类：Command");
        System.out.println("实现接口：Command.execute()");
        System.out.println("测试信息：");
        CareTaker orderList = new CareTaker();
        Command orderCoffee = new OrderCoffeeCommand();
        orderCoffee.execute();
        Drink myCoffee = orderCoffee.getMyDrink();
        orderList.append(orderCoffee, myCoffee.createMemento());
        System.out.println("Your order: " + myCoffee.getDescription());
        System.out.println();
    }

    public void DecoratorTest() throws InterruptedException {
        System.out.println("13 装饰器模式（Decorator Pattern）");
        System.out.println("包:Decorator");
        System.out.println("类：CondimentDecorator");
        System.out.println("实现接口：CondimentDecorator.getMyDrink()");
        System.out.println("测试信息：");
        CareTaker orderList = new CareTaker();
        Command orderCoffee = new OrderCoffeeCommand();
        orderCoffee.execute();
        Drink myCoffee = orderCoffee.getMyDrink();
        orderList.append(orderCoffee, myCoffee.createMemento());
        Command addSugar = new AddSugarCommand(myCoffee);
        addSugar.execute();
        orderList.append(addSugar, myCoffee.createMemento());
        Command addMilk = new AddMilkCommand(myCoffee);
        addMilk.execute();
        orderList.append(addMilk, myCoffee.createMemento());
        System.out.println("Your order: " + myCoffee.getDescription());
        System.out.println();
    }

    public void MementoTest() throws InterruptedException {
        System.out.println("14 备忘录模式（Memento Pattern）");
        System.out.println("包:Command_Memento");
        System.out.println("类：CareTaker");
        System.out.println("实现接口：CareTaker.undo()/CareTaker.redo()");
        System.out.println("测试信息：");
        CareTaker orderList = new CareTaker();
        Command orderCoffee = new OrderCoffeeCommand();
        orderCoffee.execute();
        Drink myCoffee = orderCoffee.getMyDrink();
        orderList.append(orderCoffee, myCoffee.createMemento());
        Command addSugar = new AddSugarCommand(myCoffee);
        addSugar.execute();
        orderList.append(addSugar, myCoffee.createMemento());
        System.out.println("Your current order:" + myCoffee.getDescription());
        System.out.println("Order:undo");
        orderList.undo();
        System.out.println("Your current order:" + myCoffee.getDescription());
        System.out.println("Order:redo");
        orderList.redo();
        System.out.println("Your current order:" + myCoffee.getDescription());
        Command addMilk = new AddMilkCommand(myCoffee);
        addMilk.execute();
        orderList.append(addMilk, myCoffee.createMemento());
        System.out.println("Your final order: " + myCoffee.getDescription());
        System.out.println();
    }

    public void FactoryMethodTest() {
        System.out.println("15 工厂方法模式（Factory Method Pattern）");
        System.out.println("包:FactoryMethod");
        System.out.println("类：BracerFactory/SportShoesFactory");
        System.out.println("实现接口：SportShoesFactory.createEquipment(Athlete owner)");
        System.out.println("测试信息：");
        Athlete player = AthleteContainer.getInstance().get(0);
        SportShoesFactory sportShoesFactory = new SportShoesFactory();
        Equipment sportShoes = sportShoesFactory.createEquipment(player);
        System.out.println("运动装备创建成功！");
        System.out.println("装备类型：" + sportShoes.getEquipmentName());
        System.out.println();
    }

    public void BridgeTest() {
        System.out.println("16 桥接模式（Bridge Pattern）");
        System.out.println("包:Bridge");
        System.out.println("类：EquipmentImplementor");
        System.out.println("实现接口：PerfectEquip.equip(Athlete animal, Equipment equipment)");
        System.out.println("测试信息：");
        Athlete player = AthleteContainer.getInstance().get(0);
        System.out.println("装备前速度：" + player.getSpeed());
        SportShoesFactory sportShoesFactory = new SportShoesFactory();
        Equipment sportShoes = sportShoesFactory.createEquipment(player);
        EquipmentImplementor ei = new PerfectEquip();
        AbstractAnimalEquip equipment = new SportShoesEquipment(ei);
        equipment.EquipEquipment(player, sportShoes);
        System.out.println("装备前速度：" + player.getSpeed());
        System.out.println();
    }

    public void MediatorTest() {
        System.out.println("17 中介者模式（Mediator Pattern）");
        System.out.println("包:Mediator");
        System.out.println("类：ConcreteMediator");
        System.out.println("实现接口：Others.send(String msg)");
        System.out.println("测试信息：");
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteOthers Others = new ConcreteOthers(mediator);
        ConcreteAthlete Athlete = new ConcreteAthlete(mediator);
        mediator.setOthers(Others);
        mediator.setAthlete(Athlete);
        Others.send("在饮品台偶遇其他选手，通知了你尽快参加比赛。");
        System.out.println();
    }

    public void ProxyTest() {
        System.out.println("18 代理模式（Proxy Pattern）");
        System.out.println("包:Proxy");
        System.out.println("类：ProxyScoreSheet");
        System.out.println("实现接口：ProxyScoreSheet.printScoreSheet()");
        System.out.println("测试信息：");
        ScoreSheet proxyScoreSheet = new ProxyScoreSheet();
        proxyScoreSheet.printScoreSheet();
        System.out.println();
    }

    public void FlyweightTest() {
        System.out.println("19 享元模式（Flyweight Pattern）");
        System.out.println("包:Prototpye_Flyweight");
        System.out.println("类：AttributeFactory");
        System.out.println("实现接口：AttributeFactory.setDogAudience()");
        System.out.println("测试信息：");
        System.out.println("观众创建成功！");
        DogAudience dogAudience = (DogAudience) AttributeFactory.setDogAudience("White");
        dogAudience.setAge(getRandomAge());
        dogAudience.setSex(getRandomSex());
        dogAudience.printRace();
        System.out.println();
    }

    public void PrototypeTest() {
        System.out.println("20 原型模式（Prototype Pattern）");
        System.out.println("包:Prototpye_Flyweight");
        System.out.println("类：AudienceCache");
        System.out.println("实现接口：AudienceCache.getAudience(String audienceId)");
        System.out.println("测试信息：");
        DogAudience dogAudience1 = (DogAudience) AttributeFactory.setDogAudience("Brown");
        dogAudience1.setAge(getRandomAge());
        dogAudience1.setSex(getRandomSex());
        dogAudience1.printRace();
        System.out.println("Clone Successfully!");
        DogAudience dogAudience2 = (DogAudience) AttributeFactory.setDogAudience("Brown");
        dogAudience2.setAge(getRandomAge());
        dogAudience2.setSex(getRandomSex());
        dogAudience2.printRace();
        System.out.println();
    }

    public void VisitorTest() {
        System.out.println("21 访问者模式（Visitor Pattern）");
        System.out.println("包:Visitor");
        System.out.println("类：Visitor");
        System.out.println("实现接口：Visitor.getAudience(String audienceId)");
        System.out.println("测试信息：");
        CVisitorFn.VisitorFn(0, GameContainer.getInstance().get(0));
        System.out.println();
    }



}
