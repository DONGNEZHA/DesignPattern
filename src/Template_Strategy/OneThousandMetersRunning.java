package Template_Strategy;

import Builder.Game;
import SimpleFactory.Athlete;

public class OneThousandMetersRunning extends Game {
    public OneThousandMetersRunning(String Name) {
        super(Name);
    }

    @Override
    public void gamePreparation() {
        System.out.println("OneThousandMetersRunning Game is preparing!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("OneThousandMetersRunning Game prepared!");
    }

    @Override
    public void gameStart() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("OneThousandMetersRunning Game Started!");
    }

    @Override
    public void gameEnd() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("OneThousandMetersRunning Game Finished!");
    }

    @Override
    public double selectProject(Athlete athlete) {
        double value = athlete.getSpeed() * 1.1 + athlete.getPhysical() * 1.3 + athlete.getStrength() * 1 + athlete.getSkill() * 1.2;
        double time = value * 0.411288;
        return time;
    }


}
