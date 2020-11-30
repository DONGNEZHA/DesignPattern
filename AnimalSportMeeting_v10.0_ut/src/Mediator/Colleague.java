package Mediator;

public abstract class Colleague {
    //抽象同事类，也就是运动员和普通动物的抽象类

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
