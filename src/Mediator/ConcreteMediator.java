package Mediator;

public class ConcreteMediator extends Mediator {

    private ConcreteOthers Others;//具体同事1，其他普通动物
    private ConcreteAthlete Athlete;//具体同事2，运动员动物

    public void setOthers(ConcreteOthers Others) {
        this.Others = Others;
    }

    public void setAthlete(ConcreteAthlete Athlete) {
        this.Athlete = Athlete;
    }

    @Override
    //普通动物和运动员发送信息功能
    public void send(String message, Colleague colleague) {
        if (colleague == Others) {
            Athlete.notify(message);
        } else {
            Others.notify(message);
        }
    }
}
