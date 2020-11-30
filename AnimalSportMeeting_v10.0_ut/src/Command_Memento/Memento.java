package Command_Memento;

public class Memento {
    //备忘录
    private String condiment;       //配料描述

    public Memento(String condiment) {
        this.condiment = condiment;
    }

    public String getCondiment() {
        return condiment;
    }
}
