package Builder;

import java.util.ArrayList;
import java.util.List;

public class Games {

    private List<Game> games = new ArrayList<Game>();

    public void addGame(Game game){
        games.add(game);
    }

    public void showGamesInfo() {
        for (Game game : games) {
            System.out.println("Game Name : " + game.name);
            System.out.println("Athletes List:");
            for (Athlete athlete : game.athleteLists) {
                System.out.println(athlete.name);
            }
            System.out.println("Judge Name : " + game.judge.name);
        }
    }

}
