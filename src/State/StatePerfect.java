package State;

import java.util.Random;

public class StatePerfect extends AnimalState {
    @Override
    public void drinkCoffee() {
        System.out.println("�Ѵﵽ���״̬");
    }

    @Override
    public void attendGame() {
        System.out.println("��μ���һ��������״̬�½���");

        super.stateContext.setAnimalState(StateContext.state2);
    }

    @Override
    public double getState() {
        Random rand = new Random();
        double random = rand.nextInt(40) + 80;
        return random / 100;
    }
}
