package Visitor;

import Builder.Game;
import Iterator.AthleteContainer;

public class CVisitorFn {
    public static void VisitorFn(int athlete, Game game) {
        Hall hall = new Hall();
        //添加模拟运动员排名信息
        int no = 0;
        switch (game.getName()) {
            case "100m赛跑":
                break;
            case "1000m赛跑":
                no = 1;
                break;
            case "400m游泳":
                no = 2;
                break;
        }
        hall.addElement(new RankingList(game.getName(), AthleteContainer.getInstance().get(athlete).getAnimalName(),
                AthleteContainer.getInstance().get(athlete).getRank()[no]));

        RankingViewer audience = new Audience();
        //观众访问大厅
        hall.show(audience);

        ((Audience) audience).getCertainItem();
        ((Audience) audience).getCertainName();
        ((Audience) audience).getCertainRanking();


    }
}
