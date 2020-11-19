package State;

import java.util.Random;

public class StateGood extends AnimalState {
    @Override
    public void drinkCoffee() {
        System.out.println("�����һ�����ȣ�״̬�õ��ָ�");

        super.stateContext.setAnimalState(StateContext.state1);
    }

    @Override
    public void attendGame() {
        System.out.println("��μ���һ��������״̬�½���");

        super.stateContext.setAnimalState(StateContext.state3);
    }
    @Override
    public double getState() {
        Random rand = new Random();
        double random = rand.nextInt(40)+80;
        return 0.9*random/100;
    }
}
