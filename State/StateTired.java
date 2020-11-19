package State;

import java.util.Random;

public class StateTired extends AnimalState {
    @Override
    public void drinkCoffee() {
        System.out.println("�����һ�����ȣ�״̬�õ��ָ�");

        super.stateContext.setAnimalState(StateContext.state2);
    }

    @Override
    public void attendGame() {
        System.out.println("�Ѵﵽ���״̬");
    }

    @Override
    public double getState() {
        Random rand = new Random();
        double random = rand.nextInt(40)+80;
        return 0.8*random/100;
    }
}
