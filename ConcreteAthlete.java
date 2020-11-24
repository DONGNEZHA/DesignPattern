package Mediator;

public class ConcreteAthlete extends Colleague {

    public ConcreteAthlete(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("ConcreteAthlete：send：运动员得到消息：" + message);
    }

}

