package Singleton;

import Builder.Game;
import Builder.GamesBuilder;
import Iterator.AthleteContainer;
import Iterator.GameContainer;
import SimpleFactory.Athlete;
import SimpleFactory.AthleteFactory;

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
        Scanner ms = new Scanner(System.in);
        //创建玩家
        System.out.println("请输入你的名字：");
        String name = ms.nextLine();
        System.out.println("选择你的物种：");
        String race = ms.nextLine();
        System.out.println("选择外观颜色：");
        String color = ms.nextLine();
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
        for (Game game : GameContainer.getInstance().getGames()) {
            game.gamePreparation();
            game.gameStart();
            game.gameEnd();
        }

    }

}
