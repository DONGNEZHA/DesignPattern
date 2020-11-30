package Builder;

import Template_Strategy.Boxing;
import Iterator.GameContainer;
import Template_Strategy.FourHundredMetersSwimming;
import Template_Strategy.OneHundredMetersRunning;
import Template_Strategy.OneThousandMetersRunning;

public class GamesBuilder {

    //单例模式
    private static GamesBuilder instance = new GamesBuilder();
    private GamesBuilder() { }
    public static GamesBuilder getInstance() {
        return instance;
    }

    //创建所有比赛
    public void buildGames() {
        GameContainer.getInstance().add(new OneHundredMetersRunning("100m赛跑"));
        GameContainer.getInstance().add(new OneThousandMetersRunning("1000m赛跑"));
        GameContainer.getInstance().add(new FourHundredMetersSwimming("400m游泳"));
        GameContainer.getInstance().add(new Boxing("拳击赛"));
    }
}
