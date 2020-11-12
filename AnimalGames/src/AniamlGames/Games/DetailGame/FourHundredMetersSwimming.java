package AniamlGames.Games.DetailGame;

import AniamlGames.Games.Games;

//  @program: AnimalGame
//  @description: A basic class about detail game
//  @author: Xinyu Cui
//  @create: 2020/11/12

public class FourHundredMetersSwimming extends Games {
    @Override
    public void gamePreparation(){
        System.out.println("FourHundredMetersSwimming Game is preparing!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FourHundredMetersSwimming Game prepared!");
    }

    @Override
    public void gameStart() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FourHundredMetersSwimming Game Started!");
    }

    @Override
    public void gameEnd() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FourHundredMetersSwimming Game Finished!");
    }
}
