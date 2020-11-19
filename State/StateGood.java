package State;

import java.util.Random;

public class StateGood extends AnimalState {
    @Override
    public void drinkCoffee() {
        System.out.println("你喝了一杯咖啡，状态得到恢复");

        super.stateContext.setAnimalState(StateContext.state1);
    }

    @Override
    public void attendGame() {
        System.out.println("你参加了一场比赛，状态下降了");

        super.stateContext.setAnimalState(StateContext.state3);
    }
    @Override
    public double getState() {
        Random rand = new Random();
        double random = rand.nextInt(40)+80;
        return 0.9*random/100;
    }
}
