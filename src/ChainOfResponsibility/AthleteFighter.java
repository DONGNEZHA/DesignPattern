package ChainOfResponsibility;

import Iterator.AthleteContainer;
import SimpleFactory.Athlete;

import java.util.ArrayList;
import java.util.Random;

public class AthleteFighter extends AbstractOpponent  {

    private Athlete animal;
    private AthleteFighter presentFighter;

    public AthleteFighter() { }

    public void setAnimal(Athlete animal) {
        this.animal = animal;
    }

    public Athlete getAnimal() {
        return animal;
    }

}

