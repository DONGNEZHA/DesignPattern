package ChainOfResponsibility;

public abstract class AbstractOpponent {
    private AbstractOpponent nextAbstractOpponent;

    public void setNextAbstractOpponent(AbstractOpponent abstractOpponent){
        this.nextAbstractOpponent = abstractOpponent;
    }

    public AbstractOpponent getNextAbstractOpponent() {
        return nextAbstractOpponent;
    }

}
