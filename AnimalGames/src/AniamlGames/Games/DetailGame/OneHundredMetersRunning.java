package AniamlGames.Games.DetailGame;

import AniamlGames.Games.Games;

//  @program: AnimalGame
//  @description: A basic class about detail game
//  @author: Xinyu Cui
//  @create: 2020/11/12

public class OneHundredMetersRunning extends Games {
    @Override
    public void gamePreparation(){
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
}
