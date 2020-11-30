package ChainOfResponsibility;

public abstract class AbstractOpponent {
    //抽象对手类
    private AbstractOpponent nextAbstractOpponent;

    //获取下一个对手
    public AbstractOpponent getNextAbstractOpponent() {
        return nextAbstractOpponent;
    }

    //设置下一个要对战的对手
    public void setNextAbstractOpponent(AbstractOpponent abstractOpponent) {
        this.nextAbstractOpponent = abstractOpponent;
    }

}
