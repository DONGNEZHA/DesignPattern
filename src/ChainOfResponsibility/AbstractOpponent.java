package ChainOfResponsibility;

public abstract class AbstractOpponent {
    private AbstractOpponent nextAbstractOpponent;

    public AbstractOpponent getNextAbstractOpponent() {
        return nextAbstractOpponent;
    }

    public void setNextAbstractOpponent(AbstractOpponent abstractOpponent) {
        this.nextAbstractOpponent = abstractOpponent;
    }

}
