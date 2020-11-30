package Singleton_LazyInitialization;

import Bridge.*;
import Builder.Game;
import Builder.GamesBuilder;
import Command_Memento.CCommandFn;
import Composite.Menu;
import Composite.MenuOption;
import Facade.Facade;
import FactoryMethod.BracerFactory;
import FactoryMethod.Equipment;
import FactoryMethod.SportShoesFactory;
import Iterator.AthleteContainer;
import Iterator.GameContainer;
import Mediator.CMediatorFn;
import Prototpye_Flyweight.CPrototypeFn;
import Proxy.ProxyScoreSheet;
import Proxy.ScoreSheet;
import Servant.Preparation;
import Servant.Worker;
import SimpleFactory.Athlete;
import SimpleFactory.AthleteFactory;
import State.StateGood;
import State.StatePerfect;
import Template_Strategy.Boxing;
import Template_Strategy.FourHundredMetersSwimming;
import Template_Strategy.OneHundredMetersRunning;
import Template_Strategy.OneThousandMetersRunning;
import Visitor.CVisitorFn;

import java.util.Scanner;

public class AnimalSportMeeting {

    //创建 Singleton.AnimalSportMeeting 的一个对象

    private Athlete player;

    //让构造函数为 private，这样该类就不会被实例化
    private AnimalSportMeeting() {
    }

    public static AnimalSportMeeting getInstance() {
        return SingletonHolder.instance;
    }

    //测试信息
    public void showMessage() {
        System.out.println("ASM Created Successfully!");
    }

    //流程控制器
    public void flowController() throws CloneNotSupportedException {
        System.out.println("欢迎来到动物运动会！");
        Scanner input = new Scanner(System.in);
        //创建玩家
        System.out.println("请输入你的名字：");
        String name = input.nextLine();
        System.out.println("选择你的物种 [1]Cat [2]Dog [3]Bear");
        int raceNum = input.nextInt();
        System.out.println("选择外观颜色 [1]Red [2]Green [3]Yellow");
        int colorNum = input.nextInt();
        String race = "Cat";
        String color = "Red";
        switch (raceNum) {
            case 1:
                race = "Cat";
                break;
            case 2:
                race = "Dog";
                break;
            case 3:
                race = "Bear";
                break;
            default:
                break;
        }
        switch (colorNum) {
            case 1:
                color = "Red";
                break;
            case 2:
                color = "Green";
                break;
            case 3:
                color = "Yellow";
                break;
            default:
                break;
        }
        AthleteFactory athleteFactory = new AthleteFactory();
        player = athleteFactory.createAthlete(race, color);
        player.setAnimalName(name);
        AthleteContainer.getInstance().add(player);
        //创建NPC运动员
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Cat", "Red"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Cat", "Green"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Cat", "Yellow"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Dog", "Red"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Dog", "Green"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Bear", "Red"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Bear", "Yellow"));
        //创建比赛项目
        GamesBuilder.getInstance().buildGames();
        for (Game game : GameContainer.getInstance().getGames()) {
            game.showGameInfo();
        }
        //运动员检入
        Facade facade = new Facade();
        facade.method();
        //运动会正式开始
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
        rootMenu.printMenu();
        int i = input.nextInt();
        int gameVisited = 0;
        while (i != 0) {
            switch (i) {
                case 1: {
                    gameMenu.printMenu();
                    Game game;
                    switch (input.nextInt()) {
                        case 1:
                            game = (OneHundredMetersRunning) (gameMenu.getMenu().get(0).option);
                            if (game.isVisited()) {
                                System.out.println("该项目已结束，请参加其他项目！");
                                break;
                            }
                            Worker worker1 = new Worker();
                            worker1.prepare((Preparation) game);
                            game.gameStart();
                            game.gameEnd();
                            ++gameVisited;
                            break;
                        case 2:
                            game = (OneThousandMetersRunning) (gameMenu.getMenu().get(1).option);
                            if (game.isVisited()) {
                                System.out.println("该项目已结束，请参加其他项目！");
                                break;
                            }
                            Worker worker2 = new Worker();
                            worker2.prepare((Preparation) game);
                            game.gameStart();
                            game.gameEnd();
                            ++gameVisited;
                            break;
                        case 3:
                            game = (FourHundredMetersSwimming) (gameMenu.getMenu().get(2).option);
                            if (game.isVisited()) {
                                System.out.println("该项目已结束，请参加其他项目！");
                                break;
                            }
                            Worker worker3 = new Worker();
                            worker3.prepare((Preparation) game);
                            game.gameStart();
                            game.gameEnd();
                            ++gameVisited;
                            break;
                        case 4:
                            game = (Boxing) (gameMenu.getMenu().get(3).option);
                            if (game.isVisited()) {
                                System.out.println("该项目已结束，请参加其他项目！");
                                break;
                            }
                            game.gameStart();
                            game.gameEnd();
                            ++gameVisited;
                            break;
                        case 0:
                            run_100.getLast().printMenu();
                            i = input.nextInt();
                            break;
                        default:
                            break;
                    }
                    if (gameVisited == 3) {
                        System.out.println("");
                    }
                    break;
                }
                case 2:
                    CCommandFn CCommandFn = (CCommandFn) rootMenu.getMenu().get(1).option;
                    boolean isDrink = false;
                    try {
                        isDrink = CCommandFn.CommandFn();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(isDrink){
                        System.out.println("在饮品台休息了一会儿，状态提升！");
                        switch (player.getAnimalState().toString()) {
                            case "StatePerfect":
                                break;
                            case "StateGood":
                                player.setAnimalState(new StatePerfect());
                                break;
                            case "StateTired":
                                player.setAnimalState(new StateGood());
                                break;
                            default:
                                break;
                        }
                        CMediatorFn.getInstance().MediateFn();
                    }
                    break;
                case 3:
                    System.out.println("输入要询问的运动员编号：");
                    int n = input.nextInt() - 1;
                    System.out.println("选择要询问的比赛 [1]100m赛跑 [2]1000m赛跑 [3]400m游泳");
                    int m = input.nextInt();
                    Game game = GameContainer.getInstance().get(m - 1);
                    if (!game.isVisited()) {
                        System.out.println("该比赛尚未开始！");
                        break;
                    }
                    CVisitorFn.VisitorFn(n, game);
                    break;
                case 4:
                    System.out.println("欢迎光临运动装备专卖店！");
                    System.out.println("选购心仪的装备 [1]运动跑鞋 [2]运动护腕");
                    int k = input.nextInt();
                    if (k == 1) {
                        SportShoesFactory sportShoesFactory = new SportShoesFactory();
                        Equipment sportShoes = sportShoesFactory.createEquipment(player);
                        EquipmentImplementor ei = new PerfectEquip();
                        AbstractAnimalEquip equipment = new SportShoesEquipment(ei);
                        equipment.EquipEquipment(player, sportShoes);
                    } else if (k == 2) {
                        BracerFactory bracerFactory = new BracerFactory();
                        Equipment bracer = bracerFactory.createEquipment(player);
                        EquipmentImplementor ei = new PerfectEquip();
                        AbstractAnimalEquip equipment = new BracerEquipment(ei);
                        equipment.EquipEquipment(player, bracer);
                    }
                    break;
                case 5:
                    ScoreSheet proxyScoreSheet = new ProxyScoreSheet();
                    proxyScoreSheet.printScoreSheet();
                    break;
                case 6:
                    try {
                        CPrototypeFn.PrototypeFn();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                case 0:
                    break;
                default:
                    break;
            }
            if (gameVisited == 3) {
                System.out.println("所有比赛均已结束！");
                break;
            }
            rootMenu.printMenu();
            i = input.nextInt();
        }
        System.out.println("动物运动会到此结束！");
    }

    private static class SingletonHolder {
        // 静态初始化器，有JVM来保证线程安全
        private static AnimalSportMeeting instance = new AnimalSportMeeting();
    }

}
