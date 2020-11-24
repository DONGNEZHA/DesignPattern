package Template_Strategy;

import Builder.Game;
import SimpleFactory.Athlete;

public class OneHundredMetersRunning extends Game {
    public OneHundredMetersRunning(String Name) {
        super(Name);
    }

    @Override
    public void gamePreparation() {
        System.out.println("OneHundredMetersRunning Game is preparing!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("OneHundredMetersRunning Game prepared!");
    }

    @Override
    public void gameStart() {
        System.out.println("OneHundredMetersRunning Game Started!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void gameEnd() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("OneHundredMetersRunning Game Finished!");
    }

    @Override
    public double selectProject(Athlete athlete) {
        double value = athlete.getSpeed() * 1.3 + athlete.getPhysical() * 1.1 + athlete.getStrength() * 1 + athlete.getSkill() * 1.2;
        double time = value * 0.027432;
        return time;
    }

}
