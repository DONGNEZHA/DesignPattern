package ChainOfResponsibility;

import Iterator.AthleteContainer;

import java.util.ArrayList;
import java.util.Random;

public class AthleteFighters {

    private ArrayList<AthleteFighter> athleteFighters = new ArrayList<>();
    private AthleteFighter presentFighter;

    public AthleteFighters() {
        for (int i = 0; i < 8; ++i) {
            AthleteFighter athleteFighter = new AthleteFighter();
            athleteFighter.setAnimal(AthleteContainer.getInstance().get(i));
            athleteFighters.add(athleteFighter);
        }
    }

    public void fight() {
        int i = 1;
        presentFighter = athleteFighters.get(0);
        presentFighter.setNextAbstractOpponent(athleteFighters.get(1));

        while (i < athleteFighters.size()) {
            AthleteFighter nextFighter = (AthleteFighter) presentFighter.getNextAbstractOpponent();
            Random rand1 = new Random();
            double random1 = (rand1.nextInt(2000) + 9000);
            Random rand2 = new Random();
            double random2 = (rand2.nextInt(2000) + 9000);
            double value1 = (presentFighter.getAnimal().getSpeed() * 10 + presentFighter.getAnimal().getPhysical() * 11
                    + presentFighter.getAnimal().getStrength() * 14 + presentFighter.getAnimal().getSkill() * 12)
                    * presentFighter.getAnimal().getAnimalState().getState() * random1;
            double value2 = (nextFighter.getAnimal().getSpeed() * 10 + nextFighter.getAnimal().getPhysical() * 11
                    + nextFighter.getAnimal().getStrength() * 14 + nextFighter.getAnimal().getSkill() * 12)
                    * nextFighter.getAnimal().getAnimalState().getState() * random2;
            if (value1 >= value2) {
                System.out.println("第" + i + "轮：" + presentFighter.getAnimal().getAnimalName()
                        + " vs " + nextFighter.getAnimal().getAnimalName() + "  胜者："
                        + presentFighter.getAnimal().getAnimalName());
                if (i == 7) break;
                presentFighter.setNextAbstractOpponent(athleteFighters.get(++i));
            } else {
                System.out.println("第" + i + "轮：" + presentFighter.getAnimal().getAnimalName()
                        + " vs " + nextFighter.getAnimal().getAnimalName() + "  胜者："
                        + nextFighter.getAnimal().getAnimalName());
                if (i == 7) break;
                presentFighter = (AthleteFighter) presentFighter.getNextAbstractOpponent();
                presentFighter.setNextAbstractOpponent(athleteFighters.get(++i));
            }
        }
        System.out.println("冠军是" + presentFighter.getAnimal().getAnimalName() + '!');
    }
}
