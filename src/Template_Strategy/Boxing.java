package Template_Strategy;

import Builder.Game;
import ChainOfResponsibility.AthleteFighters;

public class Boxing extends Game {

    private AthleteFighters athleteFighters;

    public Boxing(String Name) {
        super(Name);
        athleteFighters = new AthleteFighters();
    }

    @Override
    public void gamePreparation() {

    }

    @Override
    public void gameStart() {
        athleteFighters.fight();
    }

    @Override
    public void gameEnd() {
        setVisited(true);
    }

    @Override
    public void getValue(int no) {

    }
}
