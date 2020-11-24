package Mediator;

public class ConcreteOthers extends Colleague {

    public ConcreteOthers(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("ConcreteOthers：send：普通动物得到消息：" + message);
    }

}