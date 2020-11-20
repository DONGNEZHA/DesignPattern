package Singleton;

import Builder.Games;
import Builder.GamesBuilder;
import Factory.Animal;
import Factory.AnimalFactory;

import java.util.Scanner;

public class AnimalSportMeeting {

    //创建 Singleton.AnimalSportMeeting 的一个对象
    private static AnimalSportMeeting instance = new AnimalSportMeeting();

    //让构造函数为 private，这样该类就不会被实例化
    private AnimalSportMeeting(){}

    //获取唯一可用的对象
    public static AnimalSportMeeting getInstance(){
        return instance;
    }

    //测试信息
    public void showMessage() {
        System.out.println("ASM Created Successfully!");
    }

    //流程控制器(相当于main函数)
    public void flowController() {
        Scanner ms = new Scanner(System.in);
        //创建玩家
        System.out.println("Choose your race:");
        String race = ms.nextLine();
        System.out.println("Choose your color:");
        String color = ms.nextLine();
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = new Animal(animalFactory.getRace(race), animalFactory.getColor(color));
        animal.AnimalName = color + race;
        animal.showAnimalInfo();
        //创建NPC运动员

        //创建裁判

        //创建比赛项目
        Games games;
        games = GamesBuilder.getInstance().buildGames();
        games.showGamesInfo();

        //运动会正式开始


    }

}
