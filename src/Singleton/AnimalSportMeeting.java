package Singleton;

import Builder.GamesBuilder;
import Iterator.AthleteContainer;
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
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Dragonfly", "OneHundredMetersRunning"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Dragonfly", "FourHundredMetersSwimming"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Dragonfly", "Yellow"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Monkey", "OneHundredMetersRunning"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Monkey", "FourHundredMetersSwimming"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Bear", "OneHundredMetersRunning"));
        AthleteContainer.getInstance().add(athleteFactory.createAthlete("Bear", "Yellow"));
        //创建比赛项目
        GamesBuilder.getInstance().buildGames();

        //运动会正式开始
        for (int i = 0; i < 3; ++i) {

        }

    }

}
