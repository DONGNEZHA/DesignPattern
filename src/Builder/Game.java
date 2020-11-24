package Builder;

import AbstractFactory.Judge;
import AbstractFactory.JudgeStore;
import Iterator.AthleteContainer;
import Iterator.JudgeContainer;
import SimpleFactory.Athlete;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {
    private String name;
    private List<Athlete> athleteLists = new ArrayList<Athlete>();
    private Judge judge;

    public Game(String Name) {
        name = Name;
        switch (Name) {
            case "100m赛跑":
                judge = JudgeStore.getInstance().orderJudge("DR100");
                judge.setJudgeName("蜻蜓队长（陆地形态）");
                break;
            case "1000m赛跑":
                judge = JudgeStore.getInstance().orderJudge("MR1000");
                judge.setJudgeName("吉吉国王");
                break;
            case "400m游泳":
                judge = JudgeStore.getInstance().orderJudge("DS100");
                judge.setJudgeName("蜻蜓队长（水上形态）");
                break;
            default:
                break;
        }
        JudgeContainer.getInstance().add(judge);
        for (int i = 0; i < 8; ++i) {
            addAthlete(AthleteContainer.getInstance().get(i));
        }
    }

    public void addAthlete(Athlete athlete) {
        athleteLists.add(athlete);
    }

    public abstract void gamePreparation();

    public abstract void gameStart();

    public abstract void gameEnd();

    public abstract double selectProject(Athlete athlete);

    public String getName() {
        return name;
    }

    public List<Athlete> getAthleteLists() {
        return athleteLists;
    }

    public Judge getJudge() {
        return judge;
    }

}
