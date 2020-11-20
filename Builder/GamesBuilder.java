package Builder;

public class GamesBuilder {

    //单例模式
    private static GamesBuilder instance = new GamesBuilder();
    private GamesBuilder(){}
    public static GamesBuilder getInstance(){
        return instance;
    }

    public Games buildGames (){
        Games games = new Games();
        games.addGame(new Game("running"));
        games.addGame(new Game("swimming"));
        return games;
    }
}
