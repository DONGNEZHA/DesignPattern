package Template_Strategy;

import Builder.Game;
import SimpleFactory.Athlete;

import java.util.Random;

public class FourHundredMetersSwimming extends Game {
    public FourHundredMetersSwimming(String Name) {
        super(Name);
    }

    @Override
    public void gamePreparation() {
        System.out.println("FourHundredMetersSwimming Game is preparing!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FourHundredMetersSwimming Game prepared!");
    }

    @Override
    public void gameStart() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FourHundredMetersSwimming Game Started!");
        for (int i = 0; i < 8; ++i) {
            getValue(i);
        }
        sortScore();
    }

    @Override
    public void gameEnd() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FourHundredMetersSwimming Game Finished!");
        System.out.println("400m游泳最终成绩：");
        for (int i = 1; i <= 8; ++i) {
            System.out.println("参赛编号：" + i + "  姓名：" + getAthleteLists().get(i - 1).getAnimalName() + "  成绩：" + getScore()[i - 1] + "秒");
        }
        System.out.println("冠军：" + getAthleteLists().get(getRankByRank()[0]).getAnimalName());
        System.out.println("亚军：" + getAthleteLists().get(getRankByRank()[1]).getAnimalName());
        System.out.println("季军：" + getAthleteLists().get(getRankByRank()[2]).getAnimalName());
        System.out.println("你的名次：" + getRankByNO()[0]);
    }

    @Override
    public void getValue(int no) {
        Random rand = new Random();
        double random = (rand.nextInt(20) + 90);
        Athlete athlete = getAthleteLists().get(no);
        double value = athlete.getSpeed() * 1.1 + athlete.getPhysical() * 1.2 + athlete.getStrength() * 1 + athlete.getSkill() * 1.3;
        double time = value * 0.5623183 * random / 100;
        getScore()[no] = time;
    }

}
