package Singleton;

import Builder.Game;
import Builder.GamesBuilder;
import Command_Memento.CCommandFn;
import Composite.Menu;
import Composite.MenuOption;
import Iterator.AthleteContainer;
import Iterator.GameContainer;
import Mediator.CMediatorFn;
import SimpleFactory.Athlete;
import SimpleFactory.AthleteFactory;
import State.StateGood;
import State.StatePerfect;
import State.StateTired;
import Template_Strategy.FourHundredMetersSwimming;
import Template_Strategy.OneHundredMetersRunning;
import Template_Strategy.OneThousandMetersRunning;

import java.util.Scanner;

public class AnimalSportMeeting {

    //创建 Singleton.AnimalSportMeeting 的一个对象
    private static AnimalSportMeeting instance = new AnimalSportMeeting();
    //成员变量
    private Athlete player;

    //让构造函数为 private，这样该类就不会被实例化
    private AnimalSportMeeting() {
    }

    //获取唯一可用的对象
    public static AnimalSportMeeting getInstance() {
        return instance;
    }

    //测试信息
    public void showMessage() {
        System.out.println("ASM Created Successfully!");
    }

    //流程控制器
    public void flowController() {
        Scanner input = new Scanner(System.in);
        //创建玩家
        System.out.println("请输入你的名字：");
        String name = input.nextLine();
        System.out.println("选择你的物种：");
        String race = input.nextLine();
        System.out.println("选择外观颜色：");
        String color = input.nextLine();
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
        // 向比赛菜单中添加三个选项
        // 可在此处创建三个比赛实例替换 Add 中参数 element  后续同理
        gameMenu.add(run_100);
        gameMenu.add(run_1000);
        gameMenu.add(swim_400);
        //饮品台
        MenuOption drinkTable = new MenuOption("饮品台", CCommandFn.getInstance());
        MenuOption queryRank = new MenuOption("询问成绩", element);
        MenuOption buyEquipment = new MenuOption("买装备", element);
        MenuOption printRank = new MenuOption("打印成绩单", element);
        rootMenu.add(gameMenu);
        rootMenu.add(drinkTable);
        rootMenu.add(queryRank);
        rootMenu.add(buyEquipment);
        rootMenu.add(printRank);
        // 菜单以及选择返回
        rootMenu.printMenu();
        int i = input.nextInt();
        while (i != 0) {
            switch (i) {
                case 1: {
                    gameMenu.printMenu();
                    Game game;
                    switch (input.nextInt()) {
                        case 1:
                            game = (OneHundredMetersRunning)(gameMenu.getMenu().get(0).option);
                            game.gamePreparation();
                            game.gameStart();
                            game.gameEnd();
                            break;
                        case 2:
                            game = (OneThousandMetersRunning)(gameMenu.getMenu().get(1).option);
                            game.gamePreparation();
                            game.gameStart();
                            game.gameEnd();
                            break;
                        case 3:
                            game = (FourHundredMetersSwimming)(gameMenu.getMenu().get(2).option);
                            game.gamePreparation();
                            game.gameStart();
                            game.gameEnd();
                            break;
                        case 0:
                            run_100.getLast().printMenu();
                            i = input.nextInt();
                            break;
                        default:
                            break;
                    }
                    break;
                }
                case 2:
                    CCommandFn CCommandFn = (CCommandFn)rootMenu.getMenu().get(1).option;
                    try {
                        CCommandFn.CommandFn();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
                default:
                    break;
            }
            i = input.nextInt();
        }
    }

}
