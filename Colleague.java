package Mediator;

 public abstract class Colleague {//AthleteAndOthers

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
