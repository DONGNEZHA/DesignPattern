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
    private double[] score = new double[8];
    private int[] rankByNO = new int[8];
    private int[] rankByRank = new int[8];
    private boolean isVisited;

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
                judge = JudgeStore.getInstance().orderJudge("DS400");
                judge.setJudgeName("蜻蜓队长（水上形态）");
                break;
            default:
                break;
        }
        JudgeContainer.getInstance().add(judge);
        for (int i = 0; i < 8; ++i) {
            addAthlete(AthleteContainer.getInstance().get(i));
        }
        isVisited = false;
    }

    //getter & setter
    public void addAthlete(Athlete athlete) {
        athleteLists.add(athlete);
    }

    public abstract void gameStart();

    public abstract void gameEnd();

    public abstract void getValue(int no);

    public String getName() {
        return name;
    }

    public List<Athlete> getAthleteLists() {
        return athleteLists;
    }

    public Judge getJudge() {
        return judge;
    }

    public double[] getScore() {
        return score;
    }

    public int[] getRankByNO() {
        return rankByNO;
    }

    public int[] getRankByRank() {
        return rankByRank;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
    //排名
    public void sortScore() {
        for (int i = 0; i < 8; ++i) {
            rankByNO[i] = 1;
        }
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (score[i] < score[j]) {
                    ++rankByNO[j];
                }
            }
        }
        for (int i = 0; i < 8; ++i) {
            rankByRank[rankByNO[i] - 1] = i;
        }
    }

    //输出测试信息
    public void showGameInfo() {
        System.out.println("比赛名称：" + name);
        System.out.println("参赛运动员名单：");
        for (int i = 1; i <= 8; ++i) {
            System.out.println("参赛编号：" + i + "  姓名：" + athleteLists.get(i - 1).getAnimalName());
        }
        if (judge != null) {
            System.out.println("本场裁判：" + judge.getJudgeName());
        }
    }

}
