package Proxy;

import Builder.Game;
import Iterator.GameContainer;

public class RealScoreSheet implements ScoreSheet {
    @Override
    //打印成绩单
    public void printScoreSheet() {
        for (int i = 0; i < 3; ++i) {
            switch (i) {
                case 0:
                    System.out.println("100m赛跑最终成绩：");
                    break;
                case 1:
                    System.out.println("1000m赛跑最终成绩：");
                    break;
                case 2:
                    System.out.println("400m游泳最终成绩：");
                    break;
                default:
                    break;
            }
            if (GameContainer.getInstance().get(i).isVisited()) {
                Game game = GameContainer.getInstance().get(i);
                for (int j = 1; j <= 8; ++j) {
                    System.out.println("参赛编号：" + j + "  姓名：" + game.getAthleteLists().get(j - 1).getAnimalName() + "  成绩：" + game.getScore()[j - 1] + "秒");
                }
            }
        }
    }
}
