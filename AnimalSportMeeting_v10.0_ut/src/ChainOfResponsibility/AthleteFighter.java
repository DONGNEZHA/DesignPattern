package ChainOfResponsibility;

import SimpleFactory.Athlete;

public class AthleteFighter extends AbstractOpponent {

    private Athlete animal;
    private AthleteFighter presentFighter;

    public AthleteFighter() {
    }

    public Athlete getAnimal() {
        return animal;
    }

    public void setAnimal(Athlete animal) {
        this.animal = animal;
    }

}

