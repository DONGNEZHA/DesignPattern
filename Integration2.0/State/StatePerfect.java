package State;

import java.util.Random;

public class StatePerfect extends AnimalState {
    @Override
    public void drinkCoffee() {
        System.out.println("已达到最佳状态");
    }

    @Override
    public void attendGame() {
        System.out.println("你参加了一场比赛，状态下降了");

        super.stateContext.setAnimalState(StateContext.state2);
    }

    @Override
    public double getState() {
        Random rand = new Random();
        double random = rand.nextInt(40) + 80;
        return random / 100;
    }
}
