package Facade;

import Iterator.AthleteContainer;

public class Exam {
    //体检
    public void dosomething() {
        System.out.println("运动员体检...");
        System.out.println("你的动物种族：" + AthleteContainer.getInstance().get(0).getAnimalRace().getRace());
        System.out.println("你的外观颜色：" + AthleteContainer.getInstance().get(0).getAnimalColor().getColor());
        System.out.println("你的体力能力值：" + AthleteContainer.getInstance().get(0).getPhysical());
        System.out.println("你的速度能力值：" + AthleteContainer.getInstance().get(0).getSpeed());
        System.out.println("你的力量能力值：" + AthleteContainer.getInstance().get(0).getStrength());
        System.out.println("你的技巧能力值：" + AthleteContainer.getInstance().get(0).getSkill());
    }
}
