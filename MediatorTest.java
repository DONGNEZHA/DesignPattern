package Test;
import  org.junit.Test;

import Mediator.ConcreteAthlete;
import Mediator.ConcreteMediator;
import Mediator.ConcreteOthers;

public class MediatorTest {
    @Test
    public void test() {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteOthers Others = new ConcreteOthers(mediator);
        ConcreteAthlete Athlete = new ConcreteAthlete(mediator);

        mediator.setOthers(Others);
        mediator.setAthlete(Athlete);

        Others.send("普通动物要求运动员参会");
        Athlete.send("运动员已经参会");
    }

}
