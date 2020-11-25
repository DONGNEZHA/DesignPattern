package Command_Memento;

import Decorator.Drink;

public class Memento extends Drink {
    private String condiment;

    public Memento(String condiment) {
        this.condiment = condiment;
    }

    public String getCondiment() {
        return condiment;
    }
}
