package AniamlGames.Games;

//  @program: AnimalGame
//  @description: A basic class about games
//  @author: Xinyu Cui
//  @create: 2020/11/12

public abstract class Games {
    public abstract void gamePreparation();
    public abstract void gameStart();
    public abstract void gameEnd();

    //Games template
    public final void play(){
        //Game preparation
        gamePreparation();

        //Game begin
        gameStart();

        //Game end
        gameEnd();
    }
}
