package State;

import java.util.Random;

public class StateTired extends AnimalState {
    @Override
    public void drinkCoffee() {
        System.out.println("你喝了一杯咖啡，状态得到恢复");

        super.stateContext.setAnimalState(StateContext.state2);
    }

    @Override
    public void attendGame() {
        System.out.println("已达到最差状态");
    }

    @Override
    public double getState() {
        Random rand = new Random();
        double random = rand.nextInt(40) + 80;
        return 0.8 * random / 100;
    }
}
