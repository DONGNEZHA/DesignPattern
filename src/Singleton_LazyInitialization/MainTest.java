package Singleton_LazyInitialization;

import SimpleFactory.Athlete;
import SimpleFactory.AthleteFactory;

public class MainTest {
    //单例模式
    private static MainTest instance = new MainTest();
    private MainTest() { }
    public static MainTest getInstance() {
        return instance;
    }

    public void TestController() {
        SingletonTest();
        SimpleFactoryTest();
    }

    public void SingletonTest() {
        System.out.println("单例模式（Singleton Pattern）");
        System.out.println("包:Singleton_LazyInitialization");
        System.out.println("类：AnimalSportMeeting");
        System.out.println("实现接口：AnimalSportMeeting.getInstance().showMessage()");
        System.out.println("测试信息：");
        AnimalSportMeeting.getInstance().showMessage();
    }

    public void SimpleFactoryTest() {
        System.out.println("简单工厂模式（SimpleFactory Pattern）");
        System.out.println("包:SimpleFactoryTest");
        System.out.println("类：AthleteFactory");
        System.out.println("实现接口：AthleteFactory.createAthlete(String race, String color)");
        System.out.println("测试信息：");
        Athlete athlete = new AthleteFactory().createAthlete("Dog", "Green");
        if (athlete != null) {
            System.out.println("athlete创建成功！");
            athlete.showAnimalInfo();
        } else {
            System.out.println("athlete创建失败！");
        }
    }


}
