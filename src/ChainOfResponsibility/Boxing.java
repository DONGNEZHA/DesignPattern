package ChainOfResponsibility;

import Builder.Game;

public class Boxing extends Game {

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

    }

    @Override
    public void getValue(int no) {

    }
}
