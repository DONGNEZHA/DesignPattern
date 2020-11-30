package Template_Strategy;

import Builder.Game;
import ChainOfResponsibility.AthleteFighters;
import Servant.Preparation;

public class Boxing extends Game implements Preparation {

    private AthleteFighters athleteFighters;

    public Boxing(String Name) {
        super(Name);
        athleteFighters = new AthleteFighters();
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

    @Override
    public void gamePreparation() {

    }
}
