package Mediator;


public class CMediatorFn {
    //单例模式
    private static CMediatorFn instance = new CMediatorFn();

    private CMediatorFn() {
    }

    public static CMediatorFn getInstance() {
        return instance;
    }

    public void MediateFn() {


        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteOthers Others = new ConcreteOthers(mediator);
        ConcreteAthlete Athlete = new ConcreteAthlete(mediator);

        mediator.setOthers(Others);
        mediator.setAthlete(Athlete);

        Others.send("在饮品台偶遇其他选手，通知了你尽快参加比赛。");
    }

}


