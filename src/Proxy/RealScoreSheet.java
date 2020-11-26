package Proxy;

import Facade.Facade;

public class RealScoreSheet implements ScoreSheet {
    @Override
    public void printScoreSheet() {

        Facade facade = new Facade();
        facade.method();
    }
}
